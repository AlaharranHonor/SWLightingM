package com.alaharranhonor.swlm.datagen.server;

import com.alaharranhonor.swlm.config.BlockConfigList;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Collections;

public class BlockLootGen extends BlockLootSubProvider {

    public BlockLootGen(HolderLookup.Provider registries) {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        BlockConfigList.REGISTERED_BLOCKS.values().forEach(this::dropSelf);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockConfigList.REGISTERED_BLOCKS.values();
    }
}

