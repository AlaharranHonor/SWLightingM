package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ConfiguredFeatureSetup {

    public static final ResourceKey<ConfiguredFeature<?, ?>> SW_COBBLE_KEY = registerKey("sw_cobble");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, SW_COBBLE_KEY, Feature.ORE, new OreConfiguration(
            new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockSetup.STAR_WORM_COBBLE.get().defaultBlockState(), 7
        ));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ModRef.res(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
