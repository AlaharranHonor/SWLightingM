package com.alaharranhonor.swlm.util.init;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.config.ConfigHolder;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class SWLMPlacedFeature {

	public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SWLM.MOD_ID);

	public static final RegistryObject<PlacedFeature> SWLM_ORE_GEN = PLACED_FEATURES.register("star_worm_cobble", () -> new PlacedFeature(SWLMConfiguredFeature.SWLM_ORE_GEN.getHolder().get(), List.of(CountPlacement.of(ConfigHolder.SERVER.serverSWLMCobbleVeinSize.get()),
		InSquarePlacement.spread(),
		BiomeFilter.biome(),
		HeightRangePlacement.uniform(VerticalAnchor.absolute(ConfigHolder.SERVER.serverSWLMCobbleBottomHeight.get()), VerticalAnchor.absolute(ConfigHolder.SERVER.serverSWLMCobbleMaxHeight.get())))));


}
