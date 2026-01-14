package com.alaharranhonor.swlm.worldgen;

import com.alaharranhonor.swlm.config.ConfigHolder;
import com.alaharranhonor.swlm.registry.ConfiguredFeatureSetup;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

public class SWLMOreGen {
    /*public static Holder<PlacedFeature> SW_COBBLE_GEN;

    public static void registerConfiguredFeatures() {
        SW_COBBLE_GEN = registerPlacedFeature("star_worm_cobble", ConfiguredFeatureSetup.SW_COBBLE_GEN.getHolder().get(),
            CountPlacement.of(ConfigHolder.SERVER.serverSWLMCobbleVeinSize.get()),
            InSquarePlacement.spread(),
            BiomeFilter.biome(),
            HeightRangePlacement.uniform(VerticalAnchor.absolute(ConfigHolder.SERVER.serverSWLMCobbleBottomHeight.get()), VerticalAnchor.absolute(ConfigHolder.SERVER.serverSWLMCobbleMaxHeight.get())));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeature(String registryName, Holder<ConfiguredFeature<C, F>> feature, PlacementModifier... placementModifiers) {
        return PlacementUtils.register(registryName, feature, placementModifiers);
    }*/

    /*public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.BiomeCategory.NETHER) {
            // Nether oregen
        } else if (event.getCategory() == Biome.BiomeCategory.THEEND) {
            // End oregen
        } else {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SWLMPlacedFeature.SWLM_ORE_GEN.getHolder().get());

            if ("minecraft:lush_caves".equalsIgnoreCase(event.getName().toString())) {
                event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SWLMPlacedFeature.SWLM_HANGING_STAR_WORMS.getHolder().get());
            }
        }
    }*/


}
