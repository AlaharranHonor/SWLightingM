package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.config.ConfigHelper;
import com.alaharranhonor.swlm.config.ConfigHolder;
import com.alaharranhonor.swlm.util.init.BlockInit;
import com.alaharranhonor.swlm.world.gen.OreGenUtils;
import com.alaharranhonor.swlm.world.gen.SWLMOreGen;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;


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


		}
		@SubscribeEvent
		public static void RegisterItemColors(ColorHandlerEvent.Item event) {
			ItemColors colors = event.getItemColors();
			colors.register((stack, color) -> {


				BlockState blockstate = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
				return event.getBlockColors().getColor(blockstate, (IBlockDisplayReader)null, (BlockPos)null, color);
			}, BlockInit.GRASS_BLOCK.get(), BlockInit.ACACIA_LEAVES.get(), BlockInit.JUNGLE_LEAVES.get(), BlockInit.DARK_OAK_LEAVES.get(), BlockInit.OAK_LEAVES.get(),
					BlockInit.SPRUCE_LEAVES.get(), BlockInit.BIRCH_LEAVES.get());

		}
	}
}
