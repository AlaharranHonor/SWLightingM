package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.registry.SWLMBlocks;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

/**
 * Static methods which can be reloaded and hotswapped.
 */
public class MixinCallbacks {

    public static void renderSWLMStar(ItemStack pStack, int pX, int pY) {
        Item item = pStack.getItem();
        if (!pStack.isEmpty() && item instanceof BlockItem && item.getRegistryName().getNamespace().equals("swlm")) {
            if (item.getRegistryName().equals(SWLMBlocks.STAR_WORM_COBBLE.getId())) return;

            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, new ResourceLocation(SWLM.MOD_ID, "textures/item_star.png"));
            RenderSystem.disableDepthTest();
            RenderSystem.disableBlend();
            GuiComponent.blit(new PoseStack(), pX, pY, 0, 0, 0, 16, 16, 16, 16);
        }
    }

}
