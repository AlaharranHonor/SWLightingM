package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.util.registry.SWLMBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onCLientSetup(FMLClientSetupEvent event) {
        // SWLM
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.HANGING_STAR_WORMS.get(), RenderType.cutout());

        // OTHER
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.ACACIA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.BIRCH_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.DARK_OAK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.JUNGLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.OAK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.SPRUCE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.BLACK_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.BLUE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.BROWN_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.CYAN_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.GRAY_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.GREEN_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.LIGHT_BLUE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.LIGHT_GRAY_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.LIME_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.MAGENTA_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.ORANGE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.PINK_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.PURPLE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.RED_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.WHITE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.YELLOW_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.GRASS_BLOCK.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.WARPED_NYLIUM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.CRIMSON_NYLIUM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.AZALEA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.FLOWERING_AZALEA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SWLMBlocks.TINTED_GLASS.get(), RenderType.translucent());
    }
}
