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
                .configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, bstate, 5))
                .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(5, 0, 20))
                        .squared())
                .count(8);
    }
}