package com.alaharranhonor.swlm.mixin.client;

import com.alaharranhonor.swlm.util.MixinCallbacks;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

    @Inject(method = "renderGuiItemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V",
    at = @At("TAIL"))
    private void renderSWLMStar(Font pFr, ItemStack pStack, int pXPosition, int pYPosition, String pText, CallbackInfo ci) {
        if (!pStack.isEmpty()) {
            MixinCallbacks.renderSWLMStar(pStack, pXPosition, pYPosition);
        }
    }

}
