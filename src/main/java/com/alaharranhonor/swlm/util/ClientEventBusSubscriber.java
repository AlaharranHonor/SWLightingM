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
        RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.OAK_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACK_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.BROWN_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CYAN_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GRAY_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GREEN_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_BLUE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_GRAY_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.LIME_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.MAGENTA_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.PINK_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.PURPLE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.RED_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.WHITE_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.YELLOW_STAINED_GLASS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GRASS_BLOCK.get(), RenderType.getCutoutMipped());
    }
}
