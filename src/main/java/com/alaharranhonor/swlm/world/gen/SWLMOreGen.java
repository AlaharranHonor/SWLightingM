package com.alaharranhonor.swlm.world.gen;

import com.alaharranhonor.swlm.util.init.SWLMPlacedFeature;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class SWLMOreGen {
    public static Holder<PlacedFeature> SWLM_COBBLE_ORE;

    public static void registerConfiguredFeatures() {
        /*SWLM_COBBLE_ORE = registerPlacedFeature("star_worm_cobble", SWLMConfiguredFeature.SWLM_ORE_GEN.getHolder().get(),
            CountPlacement.of(ConfigHolder.SERVER.serverSWLMCobbleVeinSize.get()),
            InSquarePlacement.spread(),
            BiomeFilter.biome(),
            HeightRangePlacement.uniform(VerticalAnchor.absolute(ConfigHolder.SERVER.serverSWLMCobbleBottomHeight.get()), VerticalAnchor.absolute(ConfigHolder.SERVER.serverSWLMCobbleMaxHeight.get())));*/
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeature(String registryName, Holder<ConfiguredFeature<C, F>> feature, PlacementModifier... placementModifiers) {

        return PlacementUtils.register(registryName, feature, placementModifiers);
    }

    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.BiomeCategory.NETHER) {
            // Nether oregen
        } else if (event.getCategory() == Biome.BiomeCategory.THEEND) {
            // End oregen
        } else {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SWLMPlacedFeature.SWLM_ORE_GEN.getHolder().get());
        }
    }


}
