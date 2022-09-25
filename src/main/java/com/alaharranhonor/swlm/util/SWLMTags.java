package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class SWLMTags {


    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> STAR_WORM_GOOP = createTag("star_worm_goop");
        public static final Tags.IOptionalNamedTag<Item> STAR_WORM = createTag("star_worm");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(SWLM.MOD_ID, name));
        }
    }
}
