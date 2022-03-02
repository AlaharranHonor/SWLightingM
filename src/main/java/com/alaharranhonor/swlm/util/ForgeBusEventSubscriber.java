package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.world.gen.SWLMOreGen;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeBusEventSubscriber {

	@SubscribeEvent
	public static void onBiomeLoading(BiomeLoadingEvent event) {
		if (!SWLMOreGen.checkAndInitBiome(event)) {
			return;
		}
		if (event.getCategory() == Biome.Category.NETHER) {
			// Nether oregen
		} else {
			SWLMOreGen.generateOverworldOres(event);
		}
	}

	@SubscribeEvent
	public static void onBlockMissingMappings(RegistryEvent.MissingMappings<Block> event) {
		for (RegistryEvent.MissingMappings.Mapping<Block> mapping : event.getAllMappings()) {
			if (mapping.key.getNamespace().equalsIgnoreCase("swem")) {


				if (mapping.key.getPath().contains("star_worm_block")) {
					mapping.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swlm", mapping.key.getPath().substring(16))));
				}

				mapping.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swlm", mapping.key.getPath().substring(16))));


				if (mapping.key.getPath().contains("star_worm_block")) {
					mapping.remap(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swlm", mapping.key.getPath().substring(16))));
				}

			}
		}
	}

	@SubscribeEvent
	public static void onItemMissingMappings(RegistryEvent.MissingMappings<Item> event) {
		for (RegistryEvent.MissingMappings.Mapping<Item> mapping : event.getAllMappings()) {
			if (mapping.key.getNamespace().equalsIgnoreCase("swem")) {


				if (mapping.key.getPath().contains("star_worm_block")) {
					mapping.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation("swlm", mapping.key.getPath().substring(16))));
				}

				mapping.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation("swlm", mapping.key.getPath().substring(16))));


				if (mapping.key.getPath().contains("star_worm_block")) {
					mapping.remap(ForgeRegistries.ITEMS.getValue(new ResourceLocation("swlm", mapping.key.getPath().substring(16))));
				}

			}
		}
	}
}
