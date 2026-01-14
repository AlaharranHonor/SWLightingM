package com.alaharranhonor.swlm.config;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.block.LightFallingBlock;
import com.google.common.collect.*;
import com.mojang.serialization.MapCodec;
import net.minecraft.ResourceLocationException;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.registries.RegisterEvent;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EventBusSubscriber
public class BlockConfigList {

    public static final File BLOCK_CONFIG_FOLDER = FMLPaths.CONFIGDIR.get().resolve("swlm").toFile();
    static {
        BLOCK_CONFIG_FOLDER.mkdirs();
    }

    public static final Multimap<String, ResourceLocation> BLOCK_LIST = HashMultimap.create();
    public static final Map<ResourceLocation, Block> REGISTERED_BLOCKS = new HashMap<>();
    public static final Map<ResourceLocation, Item> REGISTERED_ITEMS = new HashMap<>();

    public static final BiMap<ResourceLocation, ResourceLocation> BLOCK_EQUIVALENCE = HashBiMap.create();

    public static void loadConfigBlocks() {
        ModRef.LOGGER.info("Loading Blocks for {} addons", BLOCK_CONFIG_FOLDER.listFiles().length);
        for (File file : BLOCK_CONFIG_FOLDER.listFiles()) {
            if (!file.getName().contains(".txt")) {
                continue;
            }

            String mod = file.getName().substring(0, file.getName().length() - 4);
            ModRef.LOGGER.info("Loading LM Blocks for {}", mod);
            if (!ModList.get().isLoaded(mod)) {
                ModRef.LOGGER.info("{} is not loaded", mod);
                continue;
            }

            String line = null;
            try {
                BufferedReader reader = Files.newBufferedReader(file.toPath());
                while ((line = reader.readLine()) != null) {
                    BLOCK_LIST.put(mod, ResourceLocation.parse(line));
                }
            } catch (IOException e) {
                ModRef.LOGGER.error(e);
                e.printStackTrace();
            } catch (ResourceLocationException rle) {
                ModRef.LOGGER.warn("Invalid block id '{}'", line);
            }

            ModRef.LOGGER.info("Loaded {} LM Blocks for {}", BLOCK_LIST.get(mod).size(), mod);
        }
    }

    @SubscribeEvent
    public static void registerConfigBlocks(RegisterEvent event) {
        event.register(Registries.BLOCK, helper -> {
            loadConfigBlocks(); // Load config blocks here so that every addon mod is able to create the .txt file with their blocks.
            ListMultimap<TagKey<Block>, Holder<Block>> tagMap = ArrayListMultimap.create();
            BuiltInRegistries.BLOCK.getTags().forEach(p -> tagMap.putAll(p.getFirst(), p.getSecond().stream().toList()));
            BLOCK_LIST.values().forEach(addonBlockName -> {
                ResourceLocation swlmBlockName = ModRef.res(addonBlockName.getPath());
                Block base = BuiltInRegistries.BLOCK.get(addonBlockName);
                BlockBehaviour.Properties properties = BlockBehaviour.Properties.ofFullCopy(base).lightLevel(s -> 15);
                Block block;
                if (base instanceof RotatedPillarBlock) {
                    block = new RotatedPillarBlock(properties);
                } else if (base instanceof FallingBlock) {
                    block = new LightFallingBlock(properties);
                } else {
                    block = new Block(properties);
                }

                helper.register(swlmBlockName, block);
                // Add the tags of the base block to the new block
                BuiltInRegistries.BLOCK.getHolder(addonBlockName).ifPresent(baseRef -> {
                    BuiltInRegistries.BLOCK.getHolder(swlmBlockName).ifPresent(ref -> {
                        baseRef.tags().forEach(tag -> tagMap.put(tag, ref));
                    });
                });
                REGISTERED_BLOCKS.put(addonBlockName, block);
                BLOCK_EQUIVALENCE.put(addonBlockName, swlmBlockName);
            });

            BuiltInRegistries.BLOCK.bindTags(Multimaps.asMap(tagMap));
            ModRef.LOGGER.info("Registered {} addon blocks", REGISTERED_BLOCKS.size());
        });
    }

    @SubscribeEvent
    public static void registerConfigBlockItems(RegisterEvent event) {
        if (event.getRegistryKey() != Registries.ITEM) {
            return;
        }

        event.register(Registries.ITEM, helper -> {
            REGISTERED_BLOCKS.forEach((id, block) -> {
                ResourceLocation path = BuiltInRegistries.BLOCK.getKey(block);
                Item item = new BlockItem(block, new Item.Properties());
                helper.register(path, item);
                REGISTERED_ITEMS.put(id, item);
            });
        });
    }


}
