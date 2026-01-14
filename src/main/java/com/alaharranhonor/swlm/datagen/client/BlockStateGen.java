package com.alaharranhonor.swlm.datagen.client;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.block.HangingStarWormsBlock;
import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.BlockSetup;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlockStateGen extends BlockStateProvider {

    public BlockStateGen(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModRef.ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlockWithItem(BlockSetup.STAR_WORM_COBBLE.get(), cubeAll(BlockSetup.STAR_WORM_COBBLE.get()));

        this.getVariantBuilder(BlockSetup.HANGING_STAR_WORMS.get())
            .forAllStates(state -> {
                boolean isEnd = state.getValue(HangingStarWormsBlock.END);
                String name = isEnd ? "hanging_star_worms_end" : "hanging_star_worms";
                return ConfiguredModel.builder().modelFile(this.models().cross(name, ModRef.res("block/" + name))).build();
            });

        BlockConfigList.REGISTERED_BLOCKS.forEach((baseId, block) -> {
            if (block instanceof RotatedPillarBlock) {
                ModelFile model = new ModelFile.UncheckedModelFile(ResourceLocation.fromNamespaceAndPath(baseId.getNamespace(), "block/" + baseId.getPath()));
                this.getVariantBuilder(block)
                    .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y)
                    .modelForState().modelFile(model).addModel()
                    .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z)
                    .modelForState().modelFile(model).rotationX(90).addModel()
                    .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X)
                    .modelForState().modelFile(model).rotationX(90).rotationY(90).addModel();
            } else {
                this.simpleBlock(block, new ModelFile.UncheckedModelFile(ResourceLocation.fromNamespaceAndPath(baseId.getNamespace(), "block/" + baseId.getPath())));
            }
        });
    }
}
