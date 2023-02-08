package com.alaharranhonor.swlm.datagen.server.tags;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.util.SWLMTags;
import com.alaharranhonor.swlm.util.registry.SWLMBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, pBlockTagsProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(SWLMTags.Items.STAR_WORM_GOOP)
            .add(SWLMBlocks.STAR_WORM_GOOP.get())
            .addOptional(new ResourceLocation("swem", "star_worm_goop"));

        tag(SWLMTags.Items.STAR_WORM)
            .add(SWLMBlocks.STAR_WORM.get())
            .addOptional(new ResourceLocation("swem", "star_worm"));

        tag(SWLMTags.Items.STAR_WORM_COBBLE)
                .add(SWLMBlocks.COBBLESTONE.get().asItem())
                .addOptional(new ResourceLocation("swem", "star_worm_cobble"));

        tag(SWLMTags.Items.MORTAR_AND_PESTLE)
                .add(SWLMBlocks.PESTLE_MORTAR.get());
    }
}
