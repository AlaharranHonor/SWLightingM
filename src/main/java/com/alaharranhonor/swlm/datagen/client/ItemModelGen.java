package com.alaharranhonor.swlm.datagen.client;

import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.BlockSetup;
import com.alaharranhonor.swlm.registry.ItemSetup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelGen extends ItemModelProvider {
    public ItemModelGen(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.singleTexture(ItemSetup.STAR_WORM_MOTH.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/star_worm_moth"));

        BlockConfigList.REGISTERED_ITEMS.forEach((id, block) -> {
            this.withExistingParent(id.getPath(), new ResourceLocation(id.getNamespace(), "block/" + id.getPath()));
        });
    }
}
