package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.config.BlockConfigList;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.TagsUpdatedEvent;

@EventBusSubscriber
public class ForgeBusEventSubscriber {

	@SubscribeEvent
	public static void updateGenTags(TagsUpdatedEvent event) {
        // Copy block tags
        ListMultimap<TagKey<Block>, Holder<Block>> blockTags = ArrayListMultimap.create();
        BuiltInRegistries.BLOCK.getTags().forEach(p -> blockTags.putAll(p.getFirst(), p.getSecond().stream().toList()));
		BlockConfigList.BLOCK_EQUIVALENCE.forEach((baseId, lmId) -> {
            // Add the tags of the base block to the new block
            BuiltInRegistries.BLOCK.getHolder(baseId).ifPresent(baseRef -> {
                BuiltInRegistries.BLOCK.getHolder(lmId).ifPresent(ref -> {
                    baseRef.tags().forEach(tag -> blockTags.put(tag, ref));
                });
            });
		});
        BuiltInRegistries.BLOCK.bindTags(Multimaps.asMap(blockTags));

        // Copy item tags
        ListMultimap<TagKey<Item>, Holder<Item>> itemTags = ArrayListMultimap.create();
        BuiltInRegistries.ITEM.getTags().forEach(p -> itemTags.putAll(p.getFirst(), p.getSecond().stream().toList()));
		BlockConfigList.BLOCK_EQUIVALENCE.forEach((baseId, lmId) -> {
            // Add the tags of the base block to the new block
            BuiltInRegistries.ITEM.getHolder(baseId).ifPresent(baseRef -> {
                BuiltInRegistries.ITEM.getHolder(lmId).ifPresent(ref -> {
                    baseRef.tags().forEach(tag -> itemTags.put(tag, ref));
                });
            });
		});
        BuiltInRegistries.ITEM.bindTags(Multimaps.asMap(itemTags));
	}
}
