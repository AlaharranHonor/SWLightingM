package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.config.ConfigHolder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

// TODO Turn to DataGen
public class PlacedFeatureSetup {

    public static final ResourceKey<PlacedFeature> SW_COBBLE_PLACED_KEY = createKey("sw_cobble_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, SW_COBBLE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatureSetup.SW_COBBLE_KEY),
            List.of(
                CountPlacement.of(7),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(ConfigHolder.SERVER.serverSWLMCobbleBottomHeight.get()), VerticalAnchor.absolute(ConfigHolder.SERVER.serverSWLMCobbleMaxHeight.get())))
        );
    }


    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ModRef.ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
