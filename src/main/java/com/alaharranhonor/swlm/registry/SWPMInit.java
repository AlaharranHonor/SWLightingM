package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ModRef.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWPMInit {

	public static RegistryObject<Block> CHARCOAL_BLOCK;
	public static RegistryObject<Block> FUEL_BLOCK;

	public static void init() {
		CHARCOAL_BLOCK = BlockSetup.registerAddonBlock("swpm", "charcoal_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(5.0F, 6.0F).lightLevel(state -> 15)));
		FUEL_BLOCK = BlockSetup.registerAddonBlock("swem", "fuel_block", () -> new Block(Block.Properties.of().strength(2.0f, 6.0f).sound(SoundType.STONE).lightLevel((state) -> 15)));
	}
}
