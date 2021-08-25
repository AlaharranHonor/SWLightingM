package com.alaharranhonor.swlm.config;

import com.alaharranhonor.swlm.world.gen.SWLMOreGen;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpreadConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.DecoratedPlacementConfig;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigHelper {
	public static void bakeServer(final ModConfig config) {

		// Vein Size
		((OreFeatureConfig)((DecoratedFeatureConfig)((DecoratedFeatureConfig) SWLMOreGen.SWLM_COBBLE_ORE.config).feature.get().config).feature.get().config).size = ConfigHolder.SERVER.serverSWLMCobbleVeinSize.get();
		// Vein Count
		((FeatureSpreadConfig)((DecoratedFeatureConfig) SWLMOreGen.SWLM_COBBLE_ORE.config).decorator.config).func_242799_a().base = ConfigHolder.SERVER.serverSWLMCobbleVeinCount.get();
		// Minimum Height the ore can spawn
		((TopSolidRangeConfig)((DecoratedPlacementConfig)((DecoratedFeatureConfig)((DecoratedFeatureConfig) SWLMOreGen.SWLM_COBBLE_ORE.config).feature.get().config).decorator.config).inner.config).bottomOffset = ConfigHolder.SERVER.serverSWLMCobbleBottomHeight.get();
		// Maximum Height the ore can spawn.
		((TopSolidRangeConfig)((DecoratedPlacementConfig)((DecoratedFeatureConfig)((DecoratedFeatureConfig) SWLMOreGen.SWLM_COBBLE_ORE.config).feature.get().config).decorator.config).inner.config).maximum = ConfigHolder.SERVER.serverSWLMCobbleMaxHeight.get();
	}
}
