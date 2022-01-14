package com.alaharranhonor.swlm.mixin;

import com.alaharranhonor.swlm.util.SWLMUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CauldronBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CauldronBlock.class)
public abstract class CauldronBlockMixin {
    @Final
    @Shadow
    public static final IntegerProperty LEVEL = BlockStateProperties.LEVEL_CAULDRON;


    @Shadow public abstract void setWaterLevel(World worldIn, BlockPos pos, BlockState state, int level);

    @Inject(at = @At("HEAD"), method = "use", cancellable = true)
    private void onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit, CallbackInfoReturnable<ActionResultType> callback) {
        ItemStack stack = player.getItemInHand(handIn);

        int i = state.getValue(LEVEL);

        Block foundBlock = SWLMUtil.mappings.get(stack.getItem());

        if (i > 0 && foundBlock != null) {
            player.setItemInHand(handIn, new ItemStack(foundBlock));
            this.setWaterLevel(worldIn, pos, state, i -1);
            player.awardStat(Stats.USE_CAULDRON);
            callback.setReturnValue(ActionResultType.CONSUME);
        }

    }

}