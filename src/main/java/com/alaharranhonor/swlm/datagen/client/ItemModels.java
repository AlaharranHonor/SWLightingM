package com.alaharranhonor.swlm.datagen.client;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.util.registry.SWLMBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {
    public ItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.singleTexture(SWLMBlocks.STAR_WORM_MOTH.getId().getPath(), mcLoc("item/generated"), convertResourceLocationToTexture("items/star_worm_moth"));
    }

    private ResourceLocation convertResourceLocationToTexture(String path) {
        return new ResourceLocation(SWLM.MOD_ID, TEXTURE.getPrefix() + "/" + path + TEXTURE.getSuffix());
    }
}
