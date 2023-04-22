package com.alaharranhonor.swlm.block;

import com.alaharranhonor.swlm.registry.SWLMBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

import java.util.Random;

public class HangingStarWormsBlock extends Block {

    public static final BooleanProperty END = BooleanProperty.create("end");

    public static BlockState bodyBlockState() {
        return SWLMBlocks.HANGING_STAR_WORMS.get().defaultBlockState();
    }

    public static BlockState endBlockState() {
        return SWLMBlocks.HANGING_STAR_WORMS.get().defaultBlockState().setValue(END, true);
    }

    public HangingStarWormsBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(END, false));
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pNeighborPos) {
        if (pDirection != Direction.UP && pDirection != Direction.DOWN) {
            return pState;
        } else {
            if (pLevel.getBlockTicks().hasScheduledTick(pCurrentPos, this)) {
                return pState;
            } else if (pDirection == Direction.UP && !this.canSurvive(pState, pLevel, pCurrentPos)) {
                pLevel.scheduleTick(pCurrentPos, this, 1);
                return pState;
            } else {
                return pState.setValue(END, !pLevel.getBlockState(pCurrentPos.below()).is(this));
            }
        }
    }

    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        if (!this.canSurvive(pState, pLevel, pPos)) {
            pLevel.destroyBlock(pPos, true);
        }
    }

    @Override
    public boolean propagatesSkylightDown(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return false;
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockPos abovePos = pPos.above();
        BlockState above = pLevel.getBlockState(abovePos);
        return above.is(this) || above.isFaceSturdy(pLevel, abovePos, Direction.DOWN);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(END);
    }
}
