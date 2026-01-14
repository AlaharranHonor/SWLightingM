package com.alaharranhonor.swlm.datagen.server.tags;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.registry.BlockSetup;
import com.alaharranhonor.swlm.util.SWLMTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends BlockTagsProvider {

    public BlockTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ModRef.ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(SWLMTags.Blocks.STAR_WORM_COBBLE)
            .add(BlockSetup.STAR_WORM_COBBLE.get())
            .addOptional(ResourceLocation.fromNamespaceAndPath("swem", "star_worm_cobble"));
    }
}
