package com.alaharranhonor.swlm.datagen.server.tags;

import com.alaharranhonor.swlm.registry.BlockSetup;
import com.alaharranhonor.swlm.registry.ItemSetup;
import com.alaharranhonor.swlm.util.SWLMTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends ItemTagsProvider {


    public ItemTagGen(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(SWLMTags.Items.STAR_WORM_GOOP)
            .add(ItemSetup.STAR_WORM_GOOP.get())
            .addOptional(new ResourceLocation("swem", "star_worm_goop"));

        tag(SWLMTags.Items.STAR_WORM)
            .add(ItemSetup.STAR_WORM.get())
            .addOptional(new ResourceLocation("swem", "star_worm"));

        tag(SWLMTags.Items.STAR_WORM_COBBLE)
                .add(BlockSetup.COBBLESTONE.get().asItem())
                .addOptional(new ResourceLocation("swem", "star_worm_cobble"));

        tag(SWLMTags.Items.MORTAR_AND_PESTLE)
                .add(ItemSetup.PESTLE_MORTAR.get());
    }
}
