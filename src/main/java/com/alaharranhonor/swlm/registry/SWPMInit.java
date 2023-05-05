package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.SWLM;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWPMInit {

	public static RegistryObject<Block> CHARCOAL_BLOCK;
	public static RegistryObject<Block> FUEL_BLOCK;

	public static void init() {
		CHARCOAL_BLOCK = SWLMBlocks.registerAddonBlock("swpm", "charcoal_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).lightLevel(state -> 15)));
		FUEL_BLOCK = SWLMBlocks.registerAddonBlock("swem", "fuel_block", () -> new Block(Block.Properties.of(Material.STONE).strength(2.0f, 6.0f).sound(SoundType.STONE).lightLevel((state) -> 15)));
	}

	/* Blocks are intialized first.
	* Store the reference to the block, and then in the item initialization register the items and block items.
	 */
	@SubscribeEvent
	public static void intializeModBlocks(RegistryEvent.Register<Block> item) {
		if (ModList.get().isLoaded("swpm")) {
			/*CHARCOAL_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).lightLevel(state -> 15)).setRegistryName("charcoal_block");
			item.getRegistry().register(CHARCOAL_BLOCK);*/
		}
	}

	@SubscribeEvent
	public static void intializeModItems(RegistryEvent.Register<Item> item) {
		if (ModList.get().isLoaded("swpm")) {
			// Register stand alone items.

			// Register block items.
			//item.getRegistry().register(new BlockItem(CHARCOAL_BLOCK, new Item.Properties().tab(SWLM.TAB)).setRegistryName(CHARCOAL_BLOCK.getRegistryName()));
		}
	}


}
