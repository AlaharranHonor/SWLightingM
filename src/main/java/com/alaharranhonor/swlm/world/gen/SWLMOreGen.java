package com.alaharranhonor.swlm.world.gen;

import com.alaharranhonor.swlm.util.init.BlockInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class SWLMOreGen {
    public static ConfiguredFeature<?, ?> SWLM_COBBLE_ORE;

    public static boolean checkAndInitBiome(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.Category.NETHER) {
            return true;
        }

        if (event.getCategory() != Biome.Category.THEEND) {
            initOverWorldFeatures();
            return true;
        }
        return false;
    }

    protected static void initOverWorldFeatures() {
        if (SWLM_COBBLE_ORE == null) {
            SWLM_COBBLE_ORE = OreGenUtils.buildOverWorldFeature(BlockInit.STAR_WORM_COBBLE.get().defaultBlockState());
        }
    }

    public static void generateOverworldOres(BiomeLoadingEvent event) {
        event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SWLM_COBBLE_ORE);
    }
}
