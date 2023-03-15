package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class SWLMTags {
    public static class Blocks {
        public static final TagKey<Block> STAR_WORM_COBBLE = tag("star_worm_cobble");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(SWLM.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> STAR_WORM_COBBLE = tag("star_worm_cobble");
        public static final TagKey<Item> GLASS = tag("glass");
        public static final TagKey<Item> WOOL = tag("wool");

        public static final TagKey<Item> STAR_WORM_GOOP = tag("star_worm_goop");
        public static final TagKey<Item> STAR_WORM = tag("star_worm");
        public static final TagKey<Item> MORTAR_AND_PESTLE = tag("mortar_and_pestle");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(SWLM.MOD_ID, name));
        }

    }

}
