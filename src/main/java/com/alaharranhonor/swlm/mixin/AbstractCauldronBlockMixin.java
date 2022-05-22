package com.alaharranhonor.swlm.mixin;

import com.alaharranhonor.swlm.util.SWLMUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractCauldronBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractCauldronBlock.class)
public abstract class AbstractCauldronBlockMixin {
    @Final
    private static final IntegerProperty LEVEL = BlockStateProperties.LEVEL_CAULDRON;


    public abstract void setWaterLevel(Level worldIn, BlockPos pos, BlockState state, int level);

    @Inject(at = @At("HEAD"), method = "use", cancellable = true)
    private void onBlockActivated(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit, CallbackInfoReturnable<InteractionResult> callback) {
        ItemStack stack = player.getItemInHand(handIn);
        if (worldIn.isClientSide) {
            callback.setReturnValue(InteractionResult.CONSUME);
            return;
        }

        int i = state.getValue(LEVEL);

        if (stack.isEmpty()) {
            callback.setReturnValue(InteractionResult.PASS);
            return;
        }

        Block foundBlock = SWLMUtil.mappings.get(stack.getItem());

        if (i > 0 && foundBlock != null) {
            player.setItemInHand(handIn, new ItemStack(foundBlock));
            this.setWaterLevel(worldIn, pos, state, i -1);
            player.awardStat(Stats.USE_CAULDRON);
            callback.setReturnValue(InteractionResult.CONSUME);
        }

    }

}