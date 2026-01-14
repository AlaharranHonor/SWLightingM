package com.alaharranhonor.swlm.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

public class SWPMInit {

	public static DeferredBlock<Block> CHARCOAL_BLOCK;
	public static DeferredBlock<Block> FUEL_BLOCK;

	public static void init() {
		CHARCOAL_BLOCK = BlockSetup.registerAddonBlock("swpm", "charcoal_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(5.0F, 6.0F).lightLevel(state -> 15)));
		FUEL_BLOCK = BlockSetup.registerAddonBlock("swem", "fuel_block", () -> new Block(Block.Properties.of().strength(2.0f, 6.0f).sound(SoundType.STONE).lightLevel((state) -> 15)));
	}
}
