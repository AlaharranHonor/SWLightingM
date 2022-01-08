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
<<<<<<< HEAD
<<<<<<< HEAD
        RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.OAK_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACK_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUE_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.BROWN_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CYAN_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GRAY_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GREEN_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_BLUE_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_GRAY_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.LIME_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.MAGENTA_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.PINK_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.PURPLE_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.RED_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.WHITE_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.YELLOW_STAINED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GRASS_BLOCK.get(), RenderType.cutoutMipped());
=======
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
>>>>>>> 9b5e33d... Add more blocks
=======
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
>>>>>>> e06d41a... removed swlm_ in front of all registry names
    }
}
