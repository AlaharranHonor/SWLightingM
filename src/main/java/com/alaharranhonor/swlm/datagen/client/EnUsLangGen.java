package com.alaharranhonor.swlm.datagen.client;

import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.SWLMBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EnUsLangGen extends LanguageProvider {

    public EnUsLangGen(DataGenerator gen, String modid) {
        super(gen, modid, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add("item.swlm.star_worm_moth", "Star Worm Moth");
        this.add("item.swlm.star_worm", "Star Worm");
        this.add("item.swlm.star_worm_goop", "Star Worm Goop");
        this.add("item.swlm.pestle_mortar", "Mortar & Pestle");
        this.add("tooltip.swlm.star_worm_moth.tooltip", "A light eating moth. It never runs out of moth!");
        this.add("itemGroup.swlm", "SWLM");

        BlockConfigList.REGISTERED_BLOCKS.forEach((baseId, block) -> {
            this.add(block, "SW " + this.sanitizedName(baseId.getPath()));
        });

        SWLMBlocks.BLOCKS.getEntries().forEach(rb -> {
            this.add(rb.get(), "SW " + this.sanitizedName(rb.getId().getPath()));
        });
    }

    public String sanitizedName(String name) {
        String[] nameParts = name.split("_");

        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < nameParts.length; i++) {
            String part = nameParts[i];
            String firstLetter = part.substring(0, 1);

            finalString.append(firstLetter.toUpperCase()).append(part.substring(1)).append(i == nameParts.length - 1 ? "" : " ");
        }

        return finalString.toString();
    }
}
