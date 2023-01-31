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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.CaveVines;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Random;

public class StarWormVinesBlock extends GrowingPlantHeadBlock implements BonemealableBlock, CaveVines {
    public StarWormVinesBlock(Properties pProperties) {
        super(pProperties, Direction.DOWN, SHAPE, false, 0.1D);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0).setValue(BERRIES, false));

    }

    /**
     * Used to determine how much to grow the plant when using bonemeal.
     *
     * @param pRandom
     */
    @Override
    protected int getBlocksToGrowWhenBonemealed(Random pRandom) {
        return 1;
    }

    @Override
    protected boolean canGrowInto(BlockState pState) {
        return pState.isAir();
    }

    @Override
    protected Block getBodyBlock() {
        return SWLMBlocks.STAR_WORM_VINES_PLANT.get();
    }

    @Override
    protected BlockState getGrowIntoState(BlockState pState, Random pRandom) {
        return super.getGrowIntoState(pState, pRandom).setValue(BERRIES, pRandom.nextFloat() < 0.11F);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) {
        return new ItemStack(SWLMBlocks.STAR_WORM.get());
    }

    /**
     * @param pState
     * @param pLevel
     * @param pPos
     * @param pPlayer
     * @param pHand
     * @param pHit
     * @deprecated
     */
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
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

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(BERRIES);
    }

    /**
     * @param pLevel
     * @param pPos
     * @param pState
     * @param pIsClient
     * @return whether bonemeal can be used on this block
     */
    @Override
    public boolean isValidBonemealTarget(BlockGetter pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return !pState.getValue(BERRIES);
    }

    @Override
    public boolean isBonemealSuccess(Level pLevel, Random pRand, BlockPos pPos, BlockState pState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel pLevel, Random pRand, BlockPos pPos, BlockState pState) {
        pLevel.setBlock(pPos, pState.setValue(BERRIES, true), 2);
    }
}
