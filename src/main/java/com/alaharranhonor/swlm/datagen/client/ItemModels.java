package com.alaharranhonor.swlm.datagen.client;

import com.alaharranhonor.swlm.util.registry.SWLMBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {
    public ItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.singleTexture(SWLMBlocks.STAR_WORM_MOTH.getId().getPath(), mcLoc("item/generated"), modLoc("items/star_worm_moth"));
    }
}
