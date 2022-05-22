package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.world.gen.SWLMOreGen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeBusEventSubscriber {

	@SubscribeEvent
	public static void setup(FMLCommonSetupEvent event) {
		event.enqueueWork(SWLMOreGen::registerConfiguredFeatures);
	}

	@SubscribeEvent
	public static void onBlockMissingMappings(RegistryEvent.MissingMappings<Block> event) {
		for (RegistryEvent.MissingMappings.Mapping<Block> mapping : event.getAllMappings()) {
			if (mapping.key.getNamespace().equalsIgnoreCase("swem")) {
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
			}
		}
	}
}
