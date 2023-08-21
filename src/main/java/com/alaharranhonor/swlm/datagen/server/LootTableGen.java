package com.alaharranhonor.swlm.datagen.server;

import com.alaharranhonor.swlm.config.BlockConfigList;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class LootTableGen extends LootTableProvider {

    public LootTableGen(PackOutput pOutput, Set<ResourceLocation> pRequiredTables, List<SubProviderEntry> pSubProviders) {
        super(pOutput, pRequiredTables, pSubProviders);
    }

    public static class AutoGenLoot extends BlockLootSubProvider {

        public AutoGenLoot() {
            super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
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
}
