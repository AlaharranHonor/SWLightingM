package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.config.ConfigHelper;
import com.alaharranhonor.swlm.config.ConfigHolder;
import com.alaharranhonor.swlm.util.init.BlockInit;
import com.alaharranhonor.swlm.world.gen.OreGenUtils;
import com.alaharranhonor.swlm.world.gen.SWLMOreGen;
<<<<<<< HEAD
<<<<<<< HEAD
import net.minecraft.block.Block;
=======
>>>>>>> 9b5e33d... Add more blocks
=======
import net.minecraft.block.Block;
>>>>>>> e06d41a... removed swlm_ in front of all registry names
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
<<<<<<< HEAD
<<<<<<< HEAD
import net.minecraft.util.ResourceLocation;
=======
>>>>>>> 9b5e33d... Add more blocks
=======
import net.minecraft.util.ResourceLocation;
>>>>>>> e06d41a... removed swlm_ in front of all registry names
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
<<<<<<< HEAD
<<<<<<< HEAD
import net.minecraftforge.event.RegistryEvent;
=======
>>>>>>> 9b5e33d... Add more blocks
=======
import net.minecraftforge.event.RegistryEvent;
>>>>>>> e06d41a... removed swlm_ in front of all registry names
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
<<<<<<< HEAD
<<<<<<< HEAD
import net.minecraftforge.registries.ForgeRegistries;
=======
>>>>>>> 9b5e33d... Add more blocks
=======
import net.minecraftforge.registries.ForgeRegistries;
>>>>>>> e06d41a... removed swlm_ in front of all registry names

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber {

	@SubscribeEvent
	public static void onModConfigEvent(ModConfig.ModConfigEvent event) {

		ModConfig config = event.getConfig();
		if (config.getModId().equals(SWLM.MOD_ID)) {
			if (config.getSpec() == ConfigHolder.SERVER_SPEC) {
				if (SWLMOreGen.SWLM_COBBLE_ORE == null) {
					SWLMOreGen.SWLM_COBBLE_ORE = OreGenUtils.buildOverWorldFeature(BlockInit.STAR_WORM_COBBLE.get().defaultBlockState());
				}
				ConfigHelper.bakeServer(config);
			}
		}
	}
	@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModBusHandler {
		@SubscribeEvent
		public static void RegisterBlockColors(ColorHandlerEvent.Block event) {
			BlockColors colors = event.getBlockColors();
			colors.register((state, reader, pos, color) -> {
<<<<<<< HEAD
<<<<<<< HEAD
				return reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColors.getDefaultColor();
			}, BlockInit.ACACIA_LEAVES.get(), BlockInit.JUNGLE_LEAVES.get(), BlockInit.DARK_OAK_LEAVES.get(), BlockInit.OAK_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return FoliageColors.getEvergreenColor();
			}, BlockInit.SPRUCE_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return FoliageColors.getBirchColor();
			}, BlockInit.BIRCH_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : GrassColors.get(0.5D, 1.0D);
			}, BlockInit.GRASS_BLOCK.get());
=======
				return reader != null && pos != null ? BiomeColors.getFoliageColor(reader, pos) : FoliageColors.getDefault();
=======
				return reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColors.getDefaultColor();
>>>>>>> d82565f... updated to parchment mappings
			}, BlockInit.ACACIA_LEAVES.get(), BlockInit.JUNGLE_LEAVES.get(), BlockInit.DARK_OAK_LEAVES.get(), BlockInit.OAK_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return FoliageColors.getEvergreenColor();
			}, BlockInit.SPRUCE_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return FoliageColors.getBirchColor();
			}, BlockInit.BIRCH_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
<<<<<<< HEAD
				return reader != null && pos != null ? BiomeColors.getGrassColor(reader, pos) : GrassColors.get(0.5D, 1.0D);
<<<<<<< HEAD
			}, BlockInit.SWLM_GRASS_BLOCK.get());
>>>>>>> 9b5e33d... Add more blocks
=======
=======
				return reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : GrassColors.get(0.5D, 1.0D);
>>>>>>> d82565f... updated to parchment mappings
			}, BlockInit.GRASS_BLOCK.get());
>>>>>>> e06d41a... removed swlm_ in front of all registry names
		}
		@SubscribeEvent
		public static void RegisterItemColors(ColorHandlerEvent.Item event) {
			ItemColors colors = event.getItemColors();
			colors.register((stack, color) -> {
<<<<<<< HEAD
<<<<<<< HEAD
				BlockState blockstate = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
				return event.getBlockColors().getColor(blockstate, (IBlockDisplayReader)null, (BlockPos)null, color);
			}, BlockInit.GRASS_BLOCK.get(), BlockInit.ACACIA_LEAVES.get(), BlockInit.JUNGLE_LEAVES.get(), BlockInit.DARK_OAK_LEAVES.get(), BlockInit.OAK_LEAVES.get(),
					BlockInit.SPRUCE_LEAVES.get(), BlockInit.BIRCH_LEAVES.get());
=======
				BlockState blockstate = ((BlockItem)stack.getItem()).getBlock().getDefaultState();
=======
				BlockState blockstate = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
>>>>>>> d82565f... updated to parchment mappings
				return event.getBlockColors().getColor(blockstate, (IBlockDisplayReader)null, (BlockPos)null, color);
<<<<<<< HEAD
			}, BlockInit.SWLM_GRASS_BLOCK.get(), BlockInit.SWLM_ACACIA_LEAVES.get(), BlockInit.SWLM_JUNGLE_LEAVES.get(), BlockInit.SWLM_DARK_OAK_LEAVES.get(), BlockInit.SWLM_OAK_LEAVES.get(),
					BlockInit.SWLM_SPRUCE_LEAVES.get(), BlockInit.SWLM_BIRCH_LEAVES.get());
>>>>>>> 9b5e33d... Add more blocks
=======
			}, BlockInit.GRASS_BLOCK.get(), BlockInit.ACACIA_LEAVES.get(), BlockInit.JUNGLE_LEAVES.get(), BlockInit.DARK_OAK_LEAVES.get(), BlockInit.OAK_LEAVES.get(),
					BlockInit.SPRUCE_LEAVES.get(), BlockInit.BIRCH_LEAVES.get());
>>>>>>> e06d41a... removed swlm_ in front of all registry names
		}
	}
}
