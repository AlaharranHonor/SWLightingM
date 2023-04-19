package com.alaharranhonor.swlm.datagen.server.tags;

import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.util.SWLMTags;
import com.alaharranhonor.swlm.registry.SWLMBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

public class ItemTagGen extends ItemTagsProvider {
    public ItemTagGen(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
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
