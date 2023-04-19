package com.alaharranhonor.swlm.config;

import com.alaharranhonor.swlm.SWLM;
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

    public static void loadConfigBlocks() {
        for (File file : BLOCK_CONFIG_FOLDER.listFiles()) {
            if (!file.getName().contains(".txt")) {
                continue;
            }

            String mod = file.getName().substring(0, file.getName().length() - 4);

            if (!ModList.get().isLoaded(mod)) {
                //continue;
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
        }
    }

    @SubscribeEvent
    public static void registerConfigBlocks(RegistryEvent.Register<Block> event) {
        BLOCK_LIST.values().forEach(blockName -> {
            ResourceLocation path = SWLM.res(blockName.getPath());
            Block base = event.getRegistry().getValue(blockName);
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
            event.getRegistry().register(block.setRegistryName(path));
            REGISTERED_BLOCKS.put(blockName, block);
        });
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
