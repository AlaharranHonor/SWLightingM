package com.alaharranhonor.swlm.mixin.client;

import com.alaharranhonor.swlm.SWLM;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiMixin extends GuiComponent {

    @Inject(method = "renderSlot", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/ItemRenderer;renderGuiItemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;II)V"))
    private void renderSlot(int pX, int pY, float pPartialTick, Player pPlayer, ItemStack pStack, int p_168683_, CallbackInfo ci) {
        if (!pStack.isEmpty() && pStack.getItem() instanceof BlockItem && pStack.getItem().getRegistryName().getNamespace().equals("swlm")) {
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, new ResourceLocation(SWLM.MOD_ID, "textures/item_star.png"));
            RenderSystem.disableDepthTest();

            blit(RenderSystem.getModelViewStack(), pX, pY, 0, 0, 0, 16, 16, 16, 16);
        }
    }
}
