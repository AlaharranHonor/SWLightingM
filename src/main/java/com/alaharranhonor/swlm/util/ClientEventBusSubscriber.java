package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.BlockSetup;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;

@EventBusSubscriber(value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLLoadCompleteEvent event) {
        // SWLM
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.HANGING_STAR_WORMS.get(), RenderType.cutout());

        // OTHER
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.ACACIA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.BIRCH_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.DARK_OAK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.JUNGLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.OAK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.SPRUCE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.BLACK_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.BLUE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.BROWN_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.CYAN_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.GRAY_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.GREEN_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.LIGHT_BLUE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.LIGHT_GRAY_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.LIME_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.MAGENTA_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.ORANGE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.PINK_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.PURPLE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.RED_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.WHITE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.YELLOW_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.GRASS_BLOCK.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.WARPED_NYLIUM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.CRIMSON_NYLIUM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.AZALEA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.FLOWERING_AZALEA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockSetup.TINTED_GLASS.get(), RenderType.translucent());

        BlockConfigList.REGISTERED_BLOCKS.forEach((id, block) -> {
            Block baseBlock = BuiltInRegistries.BLOCK.get(id);
            BlockState baseState = baseBlock.defaultBlockState();
            // TODO
            /*if (ItemBlockRenderTypes.canRenderInLayer(baseState, RenderType.cutoutMipped())) {
                ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutoutMipped());
            } else if (ItemBlockRenderTypes.canRenderInLayer(baseState, RenderType.cutout())) {
                ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
            }*/
        });
    }
}
