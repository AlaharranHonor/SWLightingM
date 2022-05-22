package com.alaharranhonor.swlm.util.init;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.config.ConfigHolder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SWLMConfiguredFeature {

	public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SWLM.MOD_ID);

	public static final RegistryObject<ConfiguredFeature<?, ?>> SWLM_ORE_GEN = CONFIGURED_FEATURES.register("star_worm_cobble", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES,
		BlockInit.STAR_WORM_COBBLE.get().defaultBlockState(), ConfigHolder.SERVER.serverSWLMCobbleVeinSize.get())));


}
