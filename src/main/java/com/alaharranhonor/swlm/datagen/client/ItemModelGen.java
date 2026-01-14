package com.alaharranhonor.swlm.datagen.client;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.ItemSetup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemModelGen extends ItemModelProvider {
    public ItemModelGen(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ModRef.ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.singleTexture(ItemSetup.STAR_WORM_MOTH.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/star_worm_moth"));

        BlockConfigList.REGISTERED_ITEMS.forEach((id, block) -> {
            this.getBuilder(id.getPath()).parent(new ModelFile.UncheckedModelFile(ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "block/" + id.getPath())));
        });
    }
}
