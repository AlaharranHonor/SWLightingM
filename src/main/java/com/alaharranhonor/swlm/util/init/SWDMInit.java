package com.alaharranhonor.swlm.util.init;

import com.alaharranhonor.swlm.SWLM;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWDMInit {


	public static Block MOSSY_STONE;
	public static Block MORE_MOSSY_STONE;
	public static Block MOSSY_ANDESITE;
	public static Block MORE_MOSSY_ANDESITE;


	/* Blocks are intialized first.
	* Store the reference to the block, and then in the item initialization register the items and block items.
	 */
	@SubscribeEvent
	public static void intializeModBlocks(RegistryEvent.Register<Block> item) {
		if (ModList.get().isLoaded("swem")) {

			MOSSY_STONE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_stone");
			item.getRegistry().register(MOSSY_STONE);
			MORE_MOSSY_STONE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_stone");
			item.getRegistry().register(MORE_MOSSY_STONE);
			MOSSY_ANDESITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_andesite");
			item.getRegistry().register(MOSSY_ANDESITE);
			MORE_MOSSY_ANDESITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_andesite");
			item.getRegistry().register(MORE_MOSSY_ANDESITE);
		}
	}

	@SubscribeEvent
	public static void intializeModItems(RegistryEvent.Register<Item> item) {
		if (ModList.get().isLoaded("swem")) {
			// Register stand alone items.
			//item.getRegistry().register(new MedicalItem(new Item.Properties().tab(SWLM.SWLMTAB), 20, 0).setRegistryName("test_item"));

			// Register block items.
			item.getRegistry().register(new BlockItem(MOSSY_STONE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MOSSY_STONE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MORE_MOSSY_STONE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MORE_MOSSY_STONE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MOSSY_ANDESITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MOSSY_ANDESITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MORE_MOSSY_ANDESITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MORE_MOSSY_ANDESITE.getRegistryName()));

		}
	}


}
