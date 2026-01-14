package com.alaharranhonor.swlm.datagen.server;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.registry.ConfiguredFeatureSetup;
import com.alaharranhonor.swlm.registry.PlacedFeatureSetup;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class WorldGenGen extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
        .add(Registries.CONFIGURED_FEATURE, ConfiguredFeatureSetup::bootstrap)
        .add(Registries.PLACED_FEATURE, PlacedFeatureSetup::bootstrap);

    public WorldGenGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(ModRef.ID));
    }

}
