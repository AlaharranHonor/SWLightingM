package com.alaharranhonor.swlm.world.gen;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class OreGenUtils {
    public static ConfiguredFeature<?, ?> buildOverWorldFeature(BlockState bstate) {
        return Feature.ORE
                .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, bstate, 5))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(5, 0, 20))
                        .square())
                .func_242731_b(8);
    }
}