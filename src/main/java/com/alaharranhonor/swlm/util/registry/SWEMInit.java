package com.alaharranhonor.swlm.util.registry;

import com.alaharranhonor.swlm.SWLM;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWEMInit {


	public static Block RUBBER_MAT_LIGHT;
	public static Block RUBBER_MAT_MEDIUM;
	public static Block RUBBER_MAT_DARK;
	public static Block FUEL_BLOCK;
	public static Block WHITEWASH_LOG;
	public static Block WHITEWASH_PLANK;

	public static void init() {
		/*Map<Item, Block> swemBlocks = new HashMap() {{
			put(SWEMInit.FUEL_BLOCK.asItem(), SWEMBlocks.FUEL_BLOCK.get());
			put(SWEMInit.WHITEWASH_PLANK.asItem(), SWEMBlocks.WHITEWASH_PLANK.get());
			put(SWEMInit.WHITEWASH_LOG.asItem(), SWEMBlocks.WHITEWASH_LOG.get());
			put(SWEMInit.RUBBER_MAT_LIGHT.asItem(), SWEMBlocks.LIGHT_RUBBER_MAT.get());
			put(SWEMInit.RUBBER_MAT_MEDIUM.asItem(), SWEMBlocks.MEDIUM_RUBBER_MAT.get());
			put(SWEMInit.RUBBER_MAT_DARK.asItem(), SWEMBlocks.DARK_RUBBER_MAT.get());
		}};
		SWLMUtil.mappings.putAll(swemBlocks);*/
	}

	/* Blocks are intialized first.
	* Store the reference to the block, and then in the item initialization register the items and block items.
	 */
	@SubscribeEvent
	public static void intializeModBlocks(RegistryEvent.Register<Block> item) {
		if (ModList.get().isLoaded("swem")) {

			RUBBER_MAT_LIGHT = new Block(Block.Properties.of(Material.DECORATION).strength(1.0f, 3.0f).sound(SoundType.STONE).lightLevel((state) -> 15)).setRegistryName("light_rubber_mat");
			item.getRegistry().register(RUBBER_MAT_LIGHT);
			RUBBER_MAT_MEDIUM = new Block(Block.Properties.of(Material.DECORATION).strength(1.0f, 3.0f).sound(SoundType.STONE).lightLevel((state) -> 15)).setRegistryName("medium_rubber_mat");
			item.getRegistry().register(RUBBER_MAT_MEDIUM);
			RUBBER_MAT_DARK = new Block(Block.Properties.of(Material.DECORATION).strength(1.0f, 3.0f).sound(SoundType.STONE).lightLevel((state) -> 15)).setRegistryName("dark_rubber_mat");
			item.getRegistry().register(RUBBER_MAT_DARK);
			FUEL_BLOCK = new Block(Block.Properties.of(Material.DECORATION).strength(2.0f, 6.0f).sound(SoundType.STONE).lightLevel((state) -> 15)).setRegistryName("fuel_block"); // .harvestTool(ToolType.PICKAXE).harvestLevel(1)
			item.getRegistry().register(FUEL_BLOCK);
			WHITEWASH_LOG = new RotatedPillarBlock(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F).lightLevel((state) -> 15)).setRegistryName("whitewash_log"); // .harvestTool(ToolType.AXE)
			item.getRegistry().register(WHITEWASH_LOG);
			WHITEWASH_PLANK = new Block(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F).lightLevel((state) -> 15)).setRegistryName("whitewash_plank"); //.harvestTool(ToolType.AXE)
			item.getRegistry().register(WHITEWASH_PLANK);
		}
	}

	@SubscribeEvent
	public static void intializeModItems(RegistryEvent.Register<Item> item) {
		if (ModList.get().isLoaded("swem")) {
			// Register stand alone items.
			//item.getRegistry().register(new MedicalItem(new Item.Properties().tab(SWLM.SWLMTAB), 20, 0).setRegistryName("test_item"));

			// Register block items.
			item.getRegistry().register(new BlockItem(RUBBER_MAT_LIGHT, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(RUBBER_MAT_LIGHT.getRegistryName()));
			item.getRegistry().register(new BlockItem(RUBBER_MAT_MEDIUM, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(RUBBER_MAT_MEDIUM.getRegistryName()));
			item.getRegistry().register(new BlockItem(RUBBER_MAT_DARK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(RUBBER_MAT_DARK.getRegistryName()));
			item.getRegistry().register(new BlockItem(FUEL_BLOCK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(FUEL_BLOCK.getRegistryName()));
			item.getRegistry().register(new BlockItem(WHITEWASH_LOG, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(WHITEWASH_LOG.getRegistryName()));
			item.getRegistry().register(new BlockItem(WHITEWASH_PLANK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(WHITEWASH_PLANK.getRegistryName()));

		}
	}


}