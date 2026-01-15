package com.alaharranhonor.swlm.datagen.server;

import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.BlockSetup;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Collections;
import java.util.stream.Stream;

public class BlockLootGen extends BlockLootSubProvider {

    public BlockLootGen(HolderLookup.Provider registries) {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        BlockConfigList.REGISTERED_BLOCKS.values().forEach(this::dropSelf);
        BlockSetup.REGISTRY.getEntries().forEach(holder -> {
            // Bedrock has loot table of minecraft:empty which doesn't drop an item.
            // Let's ignore all of those.
            if (holder.get().getLootTable().location().toString().equals("minecraft:empty")) {
                return;
            }

            this.dropSelf(holder.get());
        });
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Stream.concat(BlockConfigList.REGISTERED_BLOCKS.values().stream(), BlockSetup.REGISTRY.getEntries().stream().map(DeferredHolder::get)).toList();
    }
}

