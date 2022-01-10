package com.alaharranhonor.swlm.util.init;

import com.alaharranhonor.swem.blocks.CareDoorBlock;
import com.alaharranhonor.swem.blocks.FuelBlock;
import com.alaharranhonor.swem.blocks.RubberMatBase;
import com.alaharranhonor.swem.items.MedicalItem;
import com.alaharranhonor.swlm.SWLM;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWEMInit {


	public static Block RUBBER_MAT_LIGHT;
	public static Block RUBBER_MAT_MEDIUM;
	public static Block RUBBER_MAT_DARK;
	public static Block FUEL_BLOCK;
	public static Block WHITEWASH_LOG;
	public static Block WHITEWASH_PLANK;


	/* Blocks are intialized first.
	* Store the reference to the block, and then in the item initialization register the items and block items.
	 */
	@SubscribeEvent
	public static void intializeModBlocks(RegistryEvent.Register<Block> item) {
		if (ModList.get().isLoaded("swem")) {

			RUBBER_MAT_LIGHT = new Block(AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0f, 3.0f).sound(SoundType.STONE).setLightLevel((state) -> 15)).setRegistryName("light_rubber_mat");
			item.getRegistry().register(RUBBER_MAT_LIGHT);
			RUBBER_MAT_MEDIUM = new Block(AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0f, 3.0f).sound(SoundType.STONE).setLightLevel((state) -> 15)).setRegistryName("medium_rubber_mat");
			item.getRegistry().register(RUBBER_MAT_MEDIUM);
			RUBBER_MAT_DARK = new Block(AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0f, 3.0f).sound(SoundType.STONE).setLightLevel((state) -> 15)).setRegistryName("dark_rubber_mat");
			item.getRegistry().register(RUBBER_MAT_DARK);
			FUEL_BLOCK = new Block(AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).setLightLevel((state) -> 15)).setRegistryName("fuel_block");
			item.getRegistry().register(FUEL_BLOCK);
			WHITEWASH_LOG = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE).setLightLevel((state) -> 15)).setRegistryName("whitewash_log");
			item.getRegistry().register(WHITEWASH_LOG);
			WHITEWASH_PLANK = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE).setLightLevel((state) -> 15)).setRegistryName("whitewash_plank");
			item.getRegistry().register(WHITEWASH_PLANK);
		}
	}

	@SubscribeEvent
	public static void intializeModItems(RegistryEvent.Register<Item> item) {
		if (ModList.get().isLoaded("swem")) {
			// Register stand alone items.
			//item.getRegistry().register(new MedicalItem(new Item.Properties().group(SWLM.SWLMTAB), 20, 0).setRegistryName("test_item"));

			// Register block items.
			item.getRegistry().register(new BlockItem(RUBBER_MAT_LIGHT, new Item.Properties().group(SWLM.SWLMTAB)).setRegistryName(RUBBER_MAT_LIGHT.getRegistryName()));
			item.getRegistry().register(new BlockItem(RUBBER_MAT_MEDIUM, new Item.Properties().group(SWLM.SWLMTAB)).setRegistryName(RUBBER_MAT_MEDIUM.getRegistryName()));
			item.getRegistry().register(new BlockItem(RUBBER_MAT_DARK, new Item.Properties().group(SWLM.SWLMTAB)).setRegistryName(RUBBER_MAT_DARK.getRegistryName()));
			item.getRegistry().register(new BlockItem(FUEL_BLOCK, new Item.Properties().group(SWLM.SWLMTAB)).setRegistryName(FUEL_BLOCK.getRegistryName()));
			item.getRegistry().register(new BlockItem(WHITEWASH_LOG, new Item.Properties().group(SWLM.SWLMTAB)).setRegistryName(WHITEWASH_LOG.getRegistryName()));
			item.getRegistry().register(new BlockItem(WHITEWASH_PLANK, new Item.Properties().group(SWLM.SWLMTAB)).setRegistryName(WHITEWASH_PLANK.getRegistryName()));

		}
	}


}
