package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ModRef.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWEMInit {

    public static RegistryObject<Block> RUBBER_MAT_LIGHT;
    public static RegistryObject<Block> RUBBER_MAT_MEDIUM;
    public static RegistryObject<Block> RUBBER_MAT_DARK;
    public static RegistryObject<Block> CANTAZARITE_BLOCK;

    public static void init() {
        RUBBER_MAT_LIGHT = BlockSetup.registerAddonBlock("swem", "light_rubber_mat", () -> new Block(Block.Properties.of().strength(1.0f, 3.0f).sound(SoundType.STONE).lightLevel((state) -> 15)));
        RUBBER_MAT_MEDIUM = BlockSetup.registerAddonBlock("swem", "medium_rubber_mat", () -> new Block(Block.Properties.of().strength(1.0f, 3.0f).sound(SoundType.STONE).lightLevel((state) -> 15)));
        RUBBER_MAT_DARK = BlockSetup.registerAddonBlock("swem", "dark_rubber_mat", () -> new Block(Block.Properties.of().strength(1.0f, 3.0f).sound(SoundType.STONE).lightLevel((state) -> 15)));

        CANTAZARITE_BLOCK = BlockSetup.registerAddonBlock("swem", "cantazarite_block", () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 6.0f).sound(SoundType.STONE).lightLevel(state -> 15)));
    }
}
