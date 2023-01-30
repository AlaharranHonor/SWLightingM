package com.alaharranhonor.swlm.mixin.client;

import com.alaharranhonor.swlm.SWLM;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.BlockItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractContainerScreen.class)
public class AbstractContainerScreenMixin extends Screen {
    protected AbstractContainerScreenMixin(Component pTitle) {
        super(pTitle);
    }

    @Inject(method = "renderSlot",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/ItemRenderer;renderGuiItemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V"))
    private void renderSlot(PoseStack pPoseStack, Slot pSlot, CallbackInfo ci) {
        if (pSlot.hasItem() && pSlot.getItem().getItem() instanceof BlockItem && pSlot.getItem().getItem().getRegistryName().getNamespace().equals("swlm")) {
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, new ResourceLocation(SWLM.MOD_ID, "textures/item_star.png"));
            RenderSystem.disableDepthTest();

            pPoseStack.pushPose();
            blit(pPoseStack, pSlot.x, pSlot.y, 0, 0, 0, 16, 16, 16, 16);
            pPoseStack.popPose();

        }
    }
}
