package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class SWLMTags {

    public static class Items {
        public static final TagKey<Item> STAR_WORM_GOOP = forgeTag("star_worm_goop");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(SWLM.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
