package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.worldgen.SWLMOreGen;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.TagsUpdatedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = ModRef.ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeBusEventSubscriber {

	@SubscribeEvent
	public static void setup(FMLCommonSetupEvent event) {
		//event.enqueueWork(SWLMOreGen::registerConfiguredFeatures);
	}

	@SubscribeEvent
	public static void updateGenTags(TagsUpdatedEvent event) {
		BlockConfigList.REGISTERED_BLOCKS.forEach((baseId, block) -> {
			Block baseBlock = ForgeRegistries.BLOCKS.getValue(baseId);
			block.builtInRegistryHolder().bindTags(baseBlock.builtInRegistryHolder().tags().toList());
		});

		BlockConfigList.REGISTERED_ITEMS.forEach((baseId, item) -> {
			Item baseItem = ForgeRegistries.ITEMS.getValue(baseId);
			item.builtInRegistryHolder().bindTags(baseItem.builtInRegistryHolder().tags().toList());
		});
	}

	@SubscribeEvent
	public static void onBlockMissingMappings(MissingMappingsEvent event) {
		for (MissingMappingsEvent.Mapping<Block> mapping : event.getAllMappings(Registries.BLOCK)) {
			if (mapping.getKey().getNamespace().equalsIgnoreCase("swem")) {
				if (mapping.getKey().getPath().contains("star_worm_block")) {
					mapping.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swlm", mapping.getKey().getPath().substring(16))));
				}
			}
		}
	}

	@SubscribeEvent
	public static void onItemMissingMappings(MissingMappingsEvent event) {
		for (MissingMappingsEvent.Mapping<Item> mapping : event.getAllMappings(Registries.ITEM)) {
			if (mapping.getKey().getNamespace().equalsIgnoreCase("swem")) {
				if (mapping.getKey().getPath().contains("star_worm_block")) {
					mapping.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation("swlm", mapping.getKey().getPath().substring(16))));
				}
			}
		}
	}
}
