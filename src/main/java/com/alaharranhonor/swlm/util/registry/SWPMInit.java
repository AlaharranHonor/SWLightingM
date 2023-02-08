package com.alaharranhonor.swlm.util.registry;

import com.alaharranhonor.swlm.SWLM;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWPMInit {


	public static Block CHARCOAL_BLOCK;

	public static void init() {

	}

	/* Blocks are intialized first.
	* Store the reference to the block, and then in the item initialization register the items and block items.
	 */
	@SubscribeEvent
	public static void intializeModBlocks(RegistryEvent.Register<Block> item) {
		if (ModList.get().isLoaded("swpm")) {
			CHARCOAL_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).lightLevel(state -> 15)).setRegistryName("charcoal_block");
			item.getRegistry().register(CHARCOAL_BLOCK);
		}
	}

	@SubscribeEvent
	public static void intializeModItems(RegistryEvent.Register<Item> item) {
		if (ModList.get().isLoaded("swpm")) {
			// Register stand alone items.

			// Register block items.
			item.getRegistry().register(new BlockItem(CHARCOAL_BLOCK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(CHARCOAL_BLOCK.getRegistryName()));
		}
	}


}
