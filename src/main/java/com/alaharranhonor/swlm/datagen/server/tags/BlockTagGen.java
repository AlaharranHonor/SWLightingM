package com.alaharranhonor.swlm.datagen.server.tags;

import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.util.SWLMTags;
import com.alaharranhonor.swlm.registry.SWLMBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

public class BlockTagGen extends BlockTagsProvider {


    public BlockTagGen(DataGenerator pGenerator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(SWLMTags.Blocks.STAR_WORM_COBBLE)
            .add(SWLMBlocks.STAR_WORM_COBBLE.get())
            .addOptional(new ResourceLocation("swem", "star_worm_cobble"));
    }
}
