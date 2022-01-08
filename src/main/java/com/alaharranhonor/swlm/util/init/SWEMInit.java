package com.alaharranhonor.swlm.util.init;

import com.alaharranhonor.swem.blocks.CareDoorBlock;
import com.alaharranhonor.swem.items.MedicalItem;
import com.alaharranhonor.swlm.SWLM;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWEMInit {


	public static Block TEST_DOOR_BLOCK;



	/* Blocks are intialized first.
	* Store the reference to the block, and then in the item initialization register the items and block items.
	 */
	@SubscribeEvent
	public static void intializeModBlocks(RegistryEvent.Register<Block> item) {
		if (ModList.get().isLoaded("swem")) {

			TEST_DOOR_BLOCK = new CareDoorBlock(AbstractBlock.Properties.create(Material.WOOD).setLightLevel((state) -> 15), DyeColor.BLACK).setRegistryName("test_care_door");
			System.out.println("SWLM - SWEM WAS INTIALISED - SEARCH FOR ME");
			item.getRegistry().register(TEST_DOOR_BLOCK);
		}
	}

	@SubscribeEvent
	public static void intializeModItems(RegistryEvent.Register<Item> item) {
		if (ModList.get().isLoaded("swem")) {
			// Register stand alone items.
			item.getRegistry().register(new MedicalItem(new Item.Properties().group(SWLM.SWLMTAB), 20, 0).setRegistryName("test_item"));

			// Register block items.
			item.getRegistry().register(new BlockItem(TEST_DOOR_BLOCK, new Item.Properties().group(SWLM.SWLMTAB)).setRegistryName(TEST_DOOR_BLOCK.getRegistryName()));

		}
	}


}
