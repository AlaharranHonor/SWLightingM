package com.alaharranhonor.swlm.datagen.client;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.block.HangingStarWormsBlock;
import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.BlockSetup;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
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
        lmBlocks();
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

    private void lmBlocks() {
        this.simpleBlockWithItem(BlockSetup.CHISELED_COPPER.get(), cubeAll(Blocks.CHISELED_COPPER));
        this.simpleBlockWithItem(BlockSetup.WEATHERED_CHISELED_COPPER.get(), cubeAll(Blocks.WEATHERED_CHISELED_COPPER));
        this.simpleBlockWithItem(BlockSetup.EXPOSED_CHISELED_COPPER.get(), cubeAll(Blocks.EXPOSED_CHISELED_COPPER));
        this.simpleBlockWithItem(BlockSetup.OXIDIZED_CHISELED_COPPER.get(), cubeAll(Blocks.OXIDIZED_CHISELED_COPPER));
        this.simpleBlockWithItem(BlockSetup.WAXED_CHISELED_COPPER.get(), cubeAll(Blocks.CHISELED_COPPER));
        this.simpleBlockWithItem(BlockSetup.WAXED_OXIDIZED_CHISELED_COPPER.get(), cubeAll(Blocks.OXIDIZED_CHISELED_COPPER));
        this.simpleBlockWithItem(BlockSetup.WAXED_EXPOSED_CHISELED_COPPER.get(), cubeAll(Blocks.EXPOSED_CHISELED_COPPER));
        this.simpleBlockWithItem(BlockSetup.WAXED_WEATHERED_CHISELED_COPPER.get(), cubeAll(Blocks.WEATHERED_CHISELED_COPPER));
        this.simpleBlockWithItem(BlockSetup.CHISELED_TUFF.get(), cubeAll(Blocks.CHISELED_TUFF));
        this.simpleBlockWithItem(BlockSetup.CHISELED_TUFF_BRICKS.get(), cubeAll(Blocks.CHISELED_TUFF_BRICKS));
        this.simpleBlockWithItem(BlockSetup.POLISHED_TUFF.get(), cubeAll(Blocks.POLISHED_TUFF));
        this.simpleBlockWithItem(BlockSetup.TUFF_BRICKS.get(), cubeAll(Blocks.TUFF_BRICKS));
    }
}
