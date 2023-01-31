package com.alaharranhonor.swlm.block;

import com.alaharranhonor.swlm.util.registry.SWLMBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Random;

public class StarWormVinesPlantBlock extends GrowingPlantBodyBlock implements BonemealableBlock, CaveVines {
    public StarWormVinesPlantBlock(Properties p_53886_) {
        super(p_53886_, Direction.DOWN, SHAPE, false);
        this.registerDefaultState(this.stateDefinition.any().setValue(BERRIES, false));
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) SWLMBlocks.STAR_WORM_VINES.get();
    }

    protected BlockState updateHeadAfterConvertedFromBody(BlockState p_153028_, BlockState p_153029_) {
        return p_153029_.setValue(BERRIES, p_153028_.getValue(BERRIES));
    }

    public ItemStack getCloneItemStack(BlockGetter p_153007_, BlockPos p_153008_, BlockState p_153009_) {
        return new ItemStack(SWLMBlocks.STAR_WORM.get());
    }

    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player p_153024_, InteractionHand p_153025_, BlockHitResult p_153026_) {
        if (pState.getValue(BERRIES)) {
            Block.popResource(pLevel, pPos, new ItemStack(SWLMBlocks.STAR_WORM.get(), 1));
            float f = Mth.randomBetween(pLevel.random, 0.8F, 1.2F);
            pLevel.playSound(null, pPos, SoundEvents.CAVE_VINES_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, f);
            pLevel.setBlock(pPos, pState.setValue(BERRIES, Boolean.valueOf(false)), 2);
            return InteractionResult.sidedSuccess(pLevel.isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_153031_) {
        p_153031_.add(BERRIES);
    }

    /**
     * @return whether bonemeal can be used on this block
     */
    public boolean isValidBonemealTarget(BlockGetter p_153011_, BlockPos p_153012_, BlockState p_153013_, boolean p_153014_) {
        return !p_153013_.getValue(BERRIES);
    }

    public boolean isBonemealSuccess(Level p_153016_, Random p_153017_, BlockPos p_153018_, BlockState p_153019_) {
        return true;
    }

    public void performBonemeal(ServerLevel p_153002_, Random p_153003_, BlockPos p_153004_, BlockState p_153005_) {
        p_153002_.setBlock(p_153004_, p_153005_.setValue(BERRIES, Boolean.valueOf(true)), 2);
    }
}
