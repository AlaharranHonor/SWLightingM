package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.util.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onCLientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_ACACIA_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_BIRCH_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_DARK_OAK_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_JUNGLE_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_OAK_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_SPRUCE_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_BLACK_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_BLUE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_BROWN_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_CYAN_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_GRAY_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_GREEN_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_LIGHT_BLUE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_LIGHT_GRAY_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_LIME_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_MAGENTA_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_ORANGE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_PINK_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_PURPLE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_RED_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_WHITE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_YELLOW_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.SWLM_GRASS_BLOCK.get(), RenderType.getCutoutMipped());
    }
}
