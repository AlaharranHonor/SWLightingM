package com.alaharranhonor.swlm.util.registry;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.block.HangingStarWormsBlock;
import com.alaharranhonor.swlm.config.ConfigHolder;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class SWLMConfiguredFeature {

	public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SWLM.MOD_ID);

	public static final RegistryObject<ConfiguredFeature<?, ?>> SWLM_ORE_GEN = CONFIGURED_FEATURES.register("star_worm_cobble", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES,
		SWLMBlocks.STAR_WORM_COBBLE.get().defaultBlockState(), ConfigHolder.SERVER.serverSWLMCobbleVeinSize.get())));

	public static final RegistryObject<ConfiguredFeature<?, ?>> SWLM_HANGING_STAR_WORMS = CONFIGURED_FEATURES.register("hanging_star_worms", () -> new ConfiguredFeature<>(Feature.BLOCK_COLUMN, new BlockColumnConfiguration(List.of(
		BlockColumnConfiguration.layer(UniformInt.of(1, 4), BlockStateProvider.simple(HangingStarWormsBlock.bodyBlockState())),
		BlockColumnConfiguration.layer(ConstantInt.of(1), BlockStateProvider.simple(HangingStarWormsBlock.endBlockState()))), Direction.DOWN, BlockPredicate.ONLY_IN_AIR_PREDICATE, true)));


}
