package com.alaharranhonor.swlm.config;

import com.alaharranhonor.swlm.SWLM;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
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
        SWLM.LOGGER.info("Loading Blocks for {} addons", BLOCK_CONFIG_FOLDER.listFiles().length);
        for (File file : BLOCK_CONFIG_FOLDER.listFiles()) {
            if (!file.getName().contains(".txt")) {
                continue;
            }

            String mod = file.getName().substring(0, file.getName().length() - 4);
            SWLM.LOGGER.info("Loading LM Blocks for {}", mod);
            if (!ModList.get().isLoaded(mod)) {
                SWLM.LOGGER.info("{} is not loaded", mod);
                continue;
            }

            String line = null;
            try {
                BufferedReader reader = Files.newBufferedReader(file.toPath());
                while ((line = reader.readLine()) != null) {
                    BLOCK_LIST.put(mod, new ResourceLocation(line));
                }
            } catch (IOException e) {
                SWLM.LOGGER.error(e);
                e.printStackTrace();
            } catch (ResourceLocationException rle) {
                SWLM.LOGGER.warn("Invalid block id '{}'", line);
            }

            SWLM.LOGGER.info("Loaded {} LM Blocks for {}", BLOCK_LIST.get(mod).size(), mod);
        }
    }

    @SubscribeEvent
    public static void registerConfigBlocks(RegistryEvent.Register<Block> event) {
        loadConfigBlocks(); // Load config blocks here so that every addon mod is able to create the .txt file with their blocks.

        BLOCK_LIST.values().forEach(addonBlockName -> {
            ResourceLocation swlmBlockName = SWLM.res(addonBlockName.getPath());
            Block base = event.getRegistry().getValue(addonBlockName);
            BlockBehaviour.Properties properties = BlockBehaviour.Properties.copy(base).lightLevel(s -> 15);
            Block block;
            if (base instanceof RotatedPillarBlock) {
                block = new RotatedPillarBlock(properties);
            } else if (base instanceof FallingBlock) {
                block = new FallingBlock(properties);
            } else {
                block = new Block(properties);
            }
            block.builtInRegistryHolder().bindTags(base.builtInRegistryHolder().tags().toList());
            event.getRegistry().register(block.setRegistryName(swlmBlockName));
            REGISTERED_BLOCKS.put(addonBlockName, block);
            BLOCK_EQUIVALENCE.put(addonBlockName, swlmBlockName);
        });
        SWLM.LOGGER.info("Registered {} addon blocks", REGISTERED_BLOCKS.size());
    }

    @SubscribeEvent
    public static void registerConfigBlockItems(RegistryEvent.Register<Item> event) {
        REGISTERED_BLOCKS.forEach((id, block) -> {
            ResourceLocation path = block.getRegistryName();
            Item item = new BlockItem(block, new Item.Properties().tab(SWLM.TAB)).setRegistryName(path);
            event.getRegistry().register(item);
            REGISTERED_ITEMS.put(id, item);
        });
    }


}
