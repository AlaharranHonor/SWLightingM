package com.alaharranhonor.swlm.util.registry;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.config.ConfigHolder;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
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

	public static final RegistryObject<PlacedFeature> SWLM_HANGING_STAR_WORMS = PLACED_FEATURES.register("hanging_star_worms", () -> new PlacedFeature(SWLMConfiguredFeature.SWLM_HANGING_STAR_WORMS.getHolder().get(), List.of(CountPlacement.of(188),InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome())));

}
