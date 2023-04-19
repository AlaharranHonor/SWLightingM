package com.alaharranhonor.swlm.datagen.client;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.block.HangingStarWormsBlock;
import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.SWLMBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateGen extends BlockStateProvider {

    public BlockStateGen(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.getVariantBuilder(SWLMBlocks.HANGING_STAR_WORMS.get())
            .forAllStates(state -> {
                boolean isEnd = state.getValue(HangingStarWormsBlock.END);
                String name = isEnd ? "hanging_star_worms_end" : "hanging_star_worms";
                return ConfiguredModel.builder().modelFile(this.models().cross(name, SWLM.res("blocks/" + name))).build();
            });

        BlockConfigList.REGISTERED_BLOCKS.forEach((baseId, block) -> {
            if (block instanceof RotatedPillarBlock) {
                ModelFile model = this.models().getExistingFile(baseId);
                this.getVariantBuilder(block)
                    .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y)
                    .modelForState().modelFile(model).addModel()
                    .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z)
                    .modelForState().modelFile(model).rotationX(90).addModel()
                    .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X)
                    .modelForState().modelFile(model).rotationX(90).rotationY(90).addModel();
            } else {
                this.simpleBlock(block, this.models().getExistingFile(baseId));
            }
        });
    }
}
