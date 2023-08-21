package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.registry.BlockSetup;
import com.alaharranhonor.swlm.registry.ItemSetup;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterItemDecorationsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModRef.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber {

	@SubscribeEvent
	public static void registerItemDecorators(RegisterItemDecorationsEvent event) {
		ItemSetup.REGISTRY.getEntries().forEach(item -> {
			if (item.get() instanceof BlockItem && !item.getId().equals(BlockSetup.STAR_WORM_COBBLE.getId())) {
				event.register(item.get(), (guiGraphics, font, stack, xOffset, yOffset) -> {
					//RenderSystem.disableDepthTest();
					//RenderSystem.disableBlend();
					guiGraphics.blit(new ResourceLocation(ModRef.ID, "textures/item_star.png"), xOffset, yOffset, 200, 0, 0, 16, 16, 16, 16);
					return true;
				});
			}
		});
	}

	@Mod.EventBusSubscriber(modid = ModRef.ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModBusHandler {
		@SubscribeEvent
		public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
			BlockColors colors = event.getBlockColors();
			colors.register((state, reader, pos, color) -> {
				return reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColor.getDefaultColor();
			}, BlockSetup.ACACIA_LEAVES.get(), BlockSetup.JUNGLE_LEAVES.get(), BlockSetup.DARK_OAK_LEAVES.get(), BlockSetup.OAK_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return FoliageColor.getEvergreenColor();
			}, BlockSetup.SPRUCE_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return FoliageColor.getBirchColor();
			}, BlockSetup.BIRCH_LEAVES.get());
			colors.register((state, reader, pos, color) -> {
				return reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : GrassColor.get(0.5D, 1.0D);
			}, BlockSetup.GRASS_BLOCK.get());
		}
		@SubscribeEvent
		public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
			ItemColors colors = event.getItemColors();
			colors.register((stack, color) -> {
				BlockState blockstate = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
				return event.getBlockColors().getColor(blockstate, (BlockAndTintGetter)null, (BlockPos)null, color);
			}, BlockSetup.GRASS_BLOCK.get(), BlockSetup.ACACIA_LEAVES.get(), BlockSetup.JUNGLE_LEAVES.get(), BlockSetup.DARK_OAK_LEAVES.get(), BlockSetup.OAK_LEAVES.get(),
					BlockSetup.SPRUCE_LEAVES.get(), BlockSetup.BIRCH_LEAVES.get());
		}
	}
}
