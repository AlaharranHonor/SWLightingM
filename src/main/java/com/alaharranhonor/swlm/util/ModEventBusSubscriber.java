package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.registry.SWLMBlocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber {

	@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModBusHandler {
		@SubscribeEvent
		public static void RegisterBlockColors(ColorHandlerEvent.Block event) {
			BlockColors colors = event.getBlockColors();
			colors.register((state, reader, pos, color) -> {
				return reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColor.getDefaultColor();
			}, SWLMBlocks.ACACIA_LEAVES.get(), SWLMBlocks.JUNGLE_LEAVES.get(), SWLMBlocks.DARK_OAK_LEAVES.get(), SWLMBlocks.OAK_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return FoliageColor.getEvergreenColor();
			}, SWLMBlocks.SPRUCE_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return FoliageColor.getBirchColor();
			}, SWLMBlocks.BIRCH_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : GrassColor.get(0.5D, 1.0D);
			}, SWLMBlocks.GRASS_BLOCK.get());
		}
		@SubscribeEvent
		public static void RegisterItemColors(ColorHandlerEvent.Item event) {
			ItemColors colors = event.getItemColors();
			colors.register((stack, color) -> {
				BlockState blockstate = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
				return event.getBlockColors().getColor(blockstate, (BlockAndTintGetter)null, (BlockPos)null, color);
			}, SWLMBlocks.GRASS_BLOCK.get(), SWLMBlocks.ACACIA_LEAVES.get(), SWLMBlocks.JUNGLE_LEAVES.get(), SWLMBlocks.DARK_OAK_LEAVES.get(), SWLMBlocks.OAK_LEAVES.get(),
					SWLMBlocks.SPRUCE_LEAVES.get(), SWLMBlocks.BIRCH_LEAVES.get());
		}
	}
}
