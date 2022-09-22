package com.alaharranhonor.swlm.util.init;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.items.PestleMortarItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BlockInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SWLM.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SWLM.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //HAHA WORM ROCKS
    public static final RegistryObject<Block> STAR_WORM_COBBLE = BLOCKS.register("star_worm_cobble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).lightLevel((state) -> 7)));

    //WOOD, BAYBEEE!
    public static final RegistryObject<Block> ACACIA_LOG = BLOCKS.register("acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_LOG = BLOCKS.register("birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_LOG = BLOCKS.register("dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_LOG = BLOCKS.register("jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_LOG = BLOCKS.register("oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_LOG = BLOCKS.register("spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_STRIPPED_LOG = BLOCKS.register("stripped_acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_STRIPPED_LOG = BLOCKS.register("stripped_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_STRIPPED_LOG = BLOCKS.register("stripped_dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_STRIPPED_LOG = BLOCKS.register("stripped_jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_STRIPPED_LOG = BLOCKS.register("stripped_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_STRIPPED_LOG = BLOCKS.register("stripped_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_WOOD = BLOCKS.register("acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_WOOD = BLOCKS.register("birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_WOOD = BLOCKS.register("dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_WOOD = BLOCKS.register("jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_WOOD = BLOCKS.register("oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_WOOD = BLOCKS.register("spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_STRIPPED_WOOD = BLOCKS.register("stripped_acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_STRIPPED_WOOD = BLOCKS.register("stripped_birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_STRIPPED_WOOD = BLOCKS.register("stripped_dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_STRIPPED_WOOD = BLOCKS.register("stripped_jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_STRIPPED_WOOD = BLOCKS.register("stripped_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_STRIPPED_WOOD = BLOCKS.register("stripped_spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_PLANKS = BLOCKS.register("acacia_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_PLANKS = BLOCKS.register("birch_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_PLANKS = BLOCKS.register("dark_oak_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_PLANKS = BLOCKS.register("jungle_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_PLANKS = BLOCKS.register("oak_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_PLANKS = BLOCKS.register("spruce_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).lightLevel((state) -> 15)));

    //ROCKS!
    public static final RegistryObject<Block> STONE = BLOCKS.register("stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_STONE = BLOCKS.register("smooth_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLESTONE = BLOCKS.register("cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE = BLOCKS.register("mossy_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ANDESITE = BLOCKS.register("andesite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_ANDESITE = BLOCKS.register("polished_andesite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIORITE = BLOCKS.register("diorite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_DIORITE = BLOCKS.register("polished_diorite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRANITE = BLOCKS.register("granite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_GRANITE = BLOCKS.register("polished_granite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STONE_BRICKS = BLOCKS.register("stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICKS = BLOCKS.register("cracked_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS = BLOCKS.register("mossy_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS = BLOCKS.register("chiseled_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).lightLevel((state) -> 15)));

    //CONDENSED ORE BLOCKS
    public static final RegistryObject<Block> COAL = BLOCKS.register("coal", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> IRON = BLOCKS.register("iron", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GOLD = BLOCKS.register("gold", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIAMOND = BLOCKS.register("diamond", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EMERALD = BLOCKS.register("emerald", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> REDSTONE = BLOCKS.register("redstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LAPIS = BLOCKS.register("lapis", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHERITE = BLOCKS.register("netherite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).lightLevel((state) -> 15)));

    //DESERT SPECIFIC (+ GRAVEL I GUESS?)
    public static final RegistryObject<Block> BONE = BLOCKS.register("bone", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAVEL = BLOCKS.register("gravel", () -> new GravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CLAY = BLOCKS.register("clay", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BRICKS = BLOCKS.register("bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SAND = BLOCKS.register("sand", () -> new SandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SANDSTONE = BLOCKS.register("sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CUT_SANDSTONE = BLOCKS.register("cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE = BLOCKS.register("smooth_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_SANDSTONE = BLOCKS.register("chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_SAND = BLOCKS.register("red_sand", () -> new SandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_SANDSTONE = BLOCKS.register("red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE = BLOCKS.register("cut_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE = BLOCKS.register("smooth_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE = BLOCKS.register("chiseled_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).lightLevel((state) -> 15)));

    //OCEAN
    public static final RegistryObject<Block> PRISMARINE = BLOCKS.register("prismarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PRISMARINE_BRICKS = BLOCKS.register("prismarine_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_PRISMARINE = BLOCKS.register("dark_prismarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DRIED_KELP = BLOCKS.register("dried_kelp", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIED_KELP_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEAD_TUBE_CORAL = BLOCKS.register("dead_tube_coral", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEAD_TUBE_CORAL_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL = BLOCKS.register("dead_brain_coral", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL = BLOCKS.register("dead_bubble_coral", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEAD_FIRE_CORAL = BLOCKS.register("dead_fire_coral", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEAD_FIRE_CORAL_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEAD_HORN_CORAL = BLOCKS.register("dead_horn_coral", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEAD_HORN_CORAL_BLOCK).lightLevel((state) -> 15)));

    //NETHER DIMENSION
    public static final RegistryObject<Block> OBSIDIAN = BLOCKS.register("obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHERRACK = BLOCKS.register("netherrack", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS = BLOCKS.register("chiseled_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS = BLOCKS.register("cracked_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHER_BRICKS = BLOCKS.register("nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_NETHER_BRICKS = BLOCKS.register("red_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACKSTONE = BLOCKS.register("blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE = BLOCKS.register("polished_blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("cracked_polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE = BLOCKS.register("chiseled_polished_blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE = BLOCKS.register("gilded_blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHER_WART = BLOCKS.register("nether_wart", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_STEM = BLOCKS.register("crimson_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM = BLOCKS.register("stripped_crimson_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_HYPHAE = BLOCKS.register("crimson_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE = BLOCKS.register("stripped_crimson_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_PLANKS = BLOCKS.register("crimson_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_WART = BLOCKS.register("warped_wart", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_STEM = BLOCKS.register("warped_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_WARPED_STEM = BLOCKS.register("stripped_warped_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_HYPHAE = BLOCKS.register("warped_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE = BLOCKS.register("stripped_warped_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_PLANKS = BLOCKS.register("warped_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SOUL_SAND = BLOCKS.register("soul_sand", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SOUL_SOIL = BLOCKS.register("soul_soil", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> QUARTZ = BLOCKS.register("quartz", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> QUARTZ_PILLAR = BLOCKS.register("quartz_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_QUARTZ = BLOCKS.register("chiseled_quartz", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_QUARTZ = BLOCKS.register("smooth_quartz", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> QUARTZ_BRICKS = BLOCKS.register("quartz_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BASALT = BLOCKS.register("basalt", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_BASALT = BLOCKS.register("polished_basalt", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT).lightLevel((state) -> 15)));

    //END DIMENSION
    public static final RegistryObject<Block> END_STONE = BLOCKS.register("end_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> END_STONE_BRICKS = BLOCKS.register("end_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPUR = BLOCKS.register("purpur", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPUR_PILLAR = BLOCKS.register("purpur_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).lightLevel((state) -> 15)));

    //NATURAL... EDIBLES?? (MISC)
    public static final RegistryObject<Block> BROWN_MUSHROOM = BLOCKS.register("brown_mushroom", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_MUSHROOM = BLOCKS.register("red_mushroom", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SNOW = BLOCKS.register("snow", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ICE = BLOCKS.register("ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PACKED_ICE = BLOCKS.register("packed_ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_ICE = BLOCKS.register("blue_ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SLIME = BLOCKS.register("slime", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HONEY = BLOCKS.register("honey", () -> new Block(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HONEYCOMB = BLOCKS.register("honeycomb", () -> new Block(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK).lightLevel((state) -> 15)));

    //DYEABLE BLOCKS
    public static final RegistryObject<Block> TERRACOTTA = BLOCKS.register("terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA = BLOCKS.register("black_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA = BLOCKS.register("blue_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA = BLOCKS.register("brown_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA = BLOCKS.register("cyan_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA = BLOCKS.register("gray_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA = BLOCKS.register("green_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA = BLOCKS.register("light_blue_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA = BLOCKS.register("light_gray_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_TERRACOTTA = BLOCKS.register("lime_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA = BLOCKS.register("magenta_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA = BLOCKS.register("orange_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_TERRACOTTA = BLOCKS.register("pink_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA = BLOCKS.register("purple_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_TERRACOTTA = BLOCKS.register("red_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA = BLOCKS.register("white_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA = BLOCKS.register("yellow_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA = BLOCKS.register("black_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA = BLOCKS.register("blue_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA = BLOCKS.register("brown_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA = BLOCKS.register("cyan_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA = BLOCKS.register("gray_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA = BLOCKS.register("green_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("light_blue_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA = BLOCKS.register("light_gray_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA = BLOCKS.register("lime_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA = BLOCKS.register("magenta_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA = BLOCKS.register("orange_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA = BLOCKS.register("pink_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA = BLOCKS.register("purple_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA = BLOCKS.register("red_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA = BLOCKS.register("white_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA = BLOCKS.register("yellow_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_CONCRETE_POWDER = BLOCKS.register("black_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_CONCRETE_POWDER = BLOCKS.register("blue_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_CONCRETE_POWDER = BLOCKS.register("brown_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_CONCRETE_POWDER = BLOCKS.register("cyan_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_CONCRETE_POWDER = BLOCKS.register("gray_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_CONCRETE_POWDER = BLOCKS.register("green_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_POWDER = BLOCKS.register("light_blue_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_POWDER = BLOCKS.register("light_gray_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_CONCRETE_POWDER = BLOCKS.register("lime_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_POWDER = BLOCKS.register("magenta_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_POWDER = BLOCKS.register("orange_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_CONCRETE_POWDER = BLOCKS.register("pink_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_POWDER = BLOCKS.register("purple_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_CONCRETE_POWDER = BLOCKS.register("red_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_CONCRETE_POWDER = BLOCKS.register("white_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_POWDER = BLOCKS.register("yellow_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_CONCRETE = BLOCKS.register("black_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_CONCRETE = BLOCKS.register("blue_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_CONCRETE = BLOCKS.register("brown_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_CONCRETE = BLOCKS.register("cyan_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_CONCRETE = BLOCKS.register("gray_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_CONCRETE = BLOCKS.register("green_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_CONCRETE = BLOCKS.register("lime_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE = BLOCKS.register("light_blue_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE = BLOCKS.register("light_gray_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE = BLOCKS.register("magenta_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_CONCRETE = BLOCKS.register("orange_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_CONCRETE = BLOCKS.register("pink_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_CONCRETE= BLOCKS.register("purple_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_CONCRETE = BLOCKS.register("red_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_CONCRETE = BLOCKS.register("white_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_CONCRETE = BLOCKS.register("yellow_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_WOOL = BLOCKS.register("black_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_WOOL = BLOCKS.register("blue_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_WOOL = BLOCKS.register("brown_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_WOOL = BLOCKS.register("cyan_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_WOOL = BLOCKS.register("gray_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_WOOL = BLOCKS.register("green_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL = BLOCKS.register("light_blue_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL = BLOCKS.register("light_gray_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_WOOL = BLOCKS.register("lime_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_WOOL = BLOCKS.register("magenta_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_WOOL = BLOCKS.register("orange_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_WOOL = BLOCKS.register("pink_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_WOOL = BLOCKS.register("purple_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_WOOL = BLOCKS.register("red_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_WOOL = BLOCKS.register("white_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_WOOL = BLOCKS.register("yellow_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).lightLevel((state) -> 15)));

    //LEAVES
    public static final RegistryObject<Block> ACACIA_LEAVES = BLOCKS.register("acacia_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_LEAVES = BLOCKS.register("birch_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_LEAVES = BLOCKS.register("dark_oak_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_LEAVES = BLOCKS.register("jungle_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_LEAVES = BLOCKS.register("oak_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_LEAVES = BLOCKS.register("spruce_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES).lightLevel((state) -> 15)));

    //DIRT
    public static final RegistryObject<Block> GRASS_BLOCK = BLOCKS.register("grass_block", () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COARSE_DIRT = BLOCKS.register("coarse_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIRT = BLOCKS.register("dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PODZOL = BLOCKS.register("podzol", () -> new SnowyDirtBlock(BlockBehaviour.Properties.copy(Blocks.PODZOL).lightLevel((state) -> 15)));

    //GLASS
    public static final RegistryObject<Block> GLASS = BLOCKS.register("glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_STAINED_GLASS = BLOCKS.register("black_stained_glass", () -> new StainedGlassBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_STAINED_GLASS = BLOCKS.register("blue_stained_glass", () -> new StainedGlassBlock(DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_STAINED_GLASS = BLOCKS.register("brown_stained_glass", () -> new StainedGlassBlock(DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_STAINED_GLASS = BLOCKS.register("cyan_stained_glass", () -> new StainedGlassBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_STAINED_GLASS = BLOCKS.register("gray_stained_glass", () -> new StainedGlassBlock(DyeColor.GRAY, BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_STAINED_GLASS = BLOCKS.register("green_stained_glass", () -> new StainedGlassBlock(DyeColor.GREEN, BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS = BLOCKS.register("light_blue_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS = BLOCKS.register("light_gray_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_STAINED_GLASS = BLOCKS.register("lime_stained_glass", () -> new StainedGlassBlock(DyeColor.LIME, BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS = BLOCKS.register("magenta_stained_glass", () -> new StainedGlassBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS = BLOCKS.register("orange_stained_glass", () -> new StainedGlassBlock(DyeColor.ORANGE, BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_STAINED_GLASS = BLOCKS.register("pink_stained_glass", () -> new StainedGlassBlock(DyeColor.PINK, BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS = BLOCKS.register("purple_stained_glass", () -> new StainedGlassBlock(DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_STAINED_GLASS = BLOCKS.register("red_stained_glass", () -> new StainedGlassBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_STAINED_GLASS = BLOCKS.register("white_stained_glass", () -> new StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS = BLOCKS.register("yellow_stained_glass", () -> new StainedGlassBlock(DyeColor.YELLOW, BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS).lightLevel((state) -> 15)));


    //** ITEMS START HERE**//

    //WORM ITEMS
    public static final RegistryObject<Item> STAR_WORM = ITEMS.register("star_worm", () -> new Item(new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> STAR_WORM_GOOP = ITEMS.register("star_worm_goop", () -> new Item(new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PESTLE_MORTAR = ITEMS.register("pestle_mortar", () -> new PestleMortarItem(new Item.Properties().stacksTo(1).tab(SWLM.SWLMTAB)));

    public static final RegistryObject<Item> STAR_WORM_COBBLE_ITEM = ITEMS.register("star_worm_cobble", () -> new BlockItem(STAR_WORM_COBBLE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

    //WOOD ITEMS
    public static final RegistryObject<Item> ACACIA_LOG_ITEM = ITEMS.register("acacia_log", () -> new BlockItem(ACACIA_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BIRCH_LOG_ITEM = ITEMS.register("birch_log", () -> new BlockItem(BIRCH_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DARK_OAK_LOG_ITEM = ITEMS.register("dark_oak_log", () -> new BlockItem(DARK_OAK_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> JUNGLE_LOG_ITEM = ITEMS.register("jungle_log", () -> new BlockItem(JUNGLE_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> OAK_LOG_ITEM = ITEMS.register("oak_log", () -> new BlockItem(OAK_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SPRUCE_LOG_ITEM = ITEMS.register("spruce_log", () -> new BlockItem(SPRUCE_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ACACIA_STRIPPED_LOG_ITEM = ITEMS.register("stripped_acacia_log", () -> new BlockItem(ACACIA_STRIPPED_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BIRCH_STRIPPED_LOG_ITEM = ITEMS.register("stripped_birch_log", () -> new BlockItem(BIRCH_STRIPPED_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DARK_OAK_STRIPPED_LOG_ITEM = ITEMS.register("stripped_dark_oak_log", () -> new BlockItem(DARK_OAK_STRIPPED_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> JUNGLE_STRIPPED_LOG_ITEM = ITEMS.register("stripped_jungle_log", () -> new BlockItem(JUNGLE_STRIPPED_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> OAK_STRIPPED_LOG_ITEM = ITEMS.register("stripped_oak_log", () -> new BlockItem(OAK_STRIPPED_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SPRUCE_STRIPPED_LOG_ITEM = ITEMS.register("stripped_spruce_log", () -> new BlockItem(SPRUCE_STRIPPED_LOG.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ACACIA_WOOD_ITEM = ITEMS.register("acacia_wood", () -> new BlockItem(ACACIA_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BIRCH_WOOD_ITEM = ITEMS.register("birch_wood", () -> new BlockItem(BIRCH_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DARK_OAK_WOOD_ITEM = ITEMS.register("dark_oak_wood", () -> new BlockItem(DARK_OAK_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> JUNGLE_WOOD_ITEM = ITEMS.register("jungle_wood", () -> new BlockItem(JUNGLE_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> OAK_WOOD_ITEM = ITEMS.register("oak_wood", () -> new BlockItem(OAK_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SPRUCE_WOOD_ITEM = ITEMS.register("spruce_wood", () -> new BlockItem(SPRUCE_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ACACIA_STRIPPED_WOOD_ITEM = ITEMS.register("stripped_acacia_wood", () -> new BlockItem(ACACIA_STRIPPED_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BIRCH_STRIPPED_WOOD_ITEM = ITEMS.register("stripped_birch_wood", () -> new BlockItem(BIRCH_STRIPPED_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DARK_OAK_STRIPPED_WOOD_ITEM = ITEMS.register("stripped_dark_oak_wood", () -> new BlockItem(DARK_OAK_STRIPPED_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> JUNGLE_STRIPPED_WOOD_ITEM = ITEMS.register("stripped_jungle_wood", () -> new BlockItem(JUNGLE_STRIPPED_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> OAK_STRIPPED_WOOD_ITEM = ITEMS.register("stripped_oak_wood", () -> new BlockItem(OAK_STRIPPED_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SPRUCE_STRIPPED_WOOD_ITEM = ITEMS.register("stripped_spruce_wood", () -> new BlockItem(SPRUCE_STRIPPED_WOOD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ACACIA_PLANKS_ITEM = ITEMS.register("acacia_planks", () -> new BlockItem(ACACIA_PLANKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BIRCH_PLANKS_ITEM = ITEMS.register("birch_planks", () -> new BlockItem(BIRCH_PLANKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_ITEM = ITEMS.register("dark_oak_planks", () -> new BlockItem(DARK_OAK_PLANKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> JUNGLE_PLANKS_ITEM = ITEMS.register("jungle_planks", () -> new BlockItem(JUNGLE_PLANKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> OAK_PLANKS_ITEM = ITEMS.register("oak_planks", () -> new BlockItem(OAK_PLANKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SPRUCE_PLANKS_ITEM = ITEMS.register("spruce_planks", () -> new BlockItem(SPRUCE_PLANKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

    //ROCK ITEMS
    public static final RegistryObject<Item> STONE_ITEM = ITEMS.register("stone", () -> new BlockItem(STONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SMOOTH_STONE_ITEM = ITEMS.register("smooth_stone", () -> new BlockItem(SMOOTH_STONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> COBBLESTONE_ITEM = ITEMS.register("cobblestone", () -> new BlockItem(COBBLESTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_ITEM = ITEMS.register("mossy_cobblestone", () -> new BlockItem(MOSSY_COBBLESTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ANDESITE_ITEM = ITEMS.register("andesite", () -> new BlockItem(ANDESITE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> POLISHED_ANDESITE_ITEM = ITEMS.register("polished_andesite", () -> new BlockItem(POLISHED_ANDESITE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DIORITE_ITEM = ITEMS.register("diorite", () -> new BlockItem(DIORITE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> POLISHED_DIORITE_ITEM = ITEMS.register("polished_diorite", () -> new BlockItem(POLISHED_DIORITE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GRANITE_ITEM = ITEMS.register("granite", () -> new BlockItem(GRANITE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> POLISHED_GRANITE_ITEM = ITEMS.register("polished_granite", () -> new BlockItem(POLISHED_GRANITE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> STONE_BRICKS_ITEM = ITEMS.register("stone_bricks", () -> new BlockItem(STONE_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRACKED_STONE_BRICKS_ITEM = ITEMS.register("cracked_stone_bricks", () -> new BlockItem(CRACKED_STONE_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> MOSSY_STONE_BRICKS_ITEM = ITEMS.register("mossy_stone_bricks", () -> new BlockItem(MOSSY_STONE_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CHISELED_STONE_BRICKS_ITEM = ITEMS.register("chiseled_stone_bricks", () -> new BlockItem(CHISELED_STONE_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

    //CONDENSED ORE BLOCK ITEMS
    public static final RegistryObject<Item> COAL_ITEM = ITEMS.register("coal", () -> new BlockItem(COAL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> IRON_ITEM = ITEMS.register("iron", () -> new BlockItem(IRON.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GOLD_ITEM = ITEMS.register("gold", () -> new BlockItem(GOLD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DIAMOND_ITEM = ITEMS.register("diamond", () -> new BlockItem(DIAMOND.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> EMERALD_ITEM = ITEMS.register("emerald", () -> new BlockItem(EMERALD.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> REDSTONE_ITEM = ITEMS.register("redstone", () -> new BlockItem(REDSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LAPIS_ITEM = ITEMS.register("lapis", () -> new BlockItem(LAPIS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> NETHERITE_ITEM = ITEMS.register("netherite", () -> new BlockItem(NETHERITE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

   //DESERT SPECIFIC ITEMS
    public static final RegistryObject<Item> BONE_ITEM = ITEMS.register("bone", () -> new  BlockItem(BONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GRAVEL_ITEM = ITEMS.register("gravel", () -> new BlockItem(GRAVEL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CLAY_ITEM= ITEMS.register("clay", () -> new BlockItem(CLAY.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BRICKS_ITEM = ITEMS.register("bricks", () -> new BlockItem(BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SAND_ITEM = ITEMS.register("sand", () -> new BlockItem(SAND.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SANDSTONE_ITEM = ITEMS.register("sandstone", () -> new BlockItem(SANDSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CUT_SANDSTONE_ITEM = ITEMS.register("cut_sandstone", () -> new BlockItem(CUT_SANDSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SMOOTH_SANDSTONE_ITEM = ITEMS.register("smooth_sandstone", () -> new BlockItem(SMOOTH_SANDSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CHISELED_SANDSTONE_ITEM = ITEMS.register("chiseled_sandstone", () -> new BlockItem(CHISELED_SANDSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_SAND_ITEM = ITEMS.register("red_sand", () -> new BlockItem(RED_SAND.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_SANDSTONE_ITEM = ITEMS.register("red_sandstone", () -> new BlockItem(RED_SANDSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CUT_RED_SANDSTONE_ITEM = ITEMS.register("cut_red_sandstone", () -> new BlockItem(CUT_RED_SANDSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SMOOTH_RED_SANDSTONE_ITEM = ITEMS.register("smooth_red_sandstone", () -> new BlockItem(SMOOTH_RED_SANDSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CHISELED_RED_SANDSTONE_ITEM = ITEMS.register("chiseled_red_sandstone", () -> new BlockItem(CHISELED_RED_SANDSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

    //OCEAN ITEMS
    public static final RegistryObject<Item> PRISMARINE_ITEM = ITEMS.register("prismarine", () -> new BlockItem(PRISMARINE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PRISMARINE_BRICKS_ITEM = ITEMS.register("prismarine_bricks", () -> new BlockItem(PRISMARINE_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DARK_PRISMARINE_ITEM = ITEMS.register("dark_prismarine", () -> new BlockItem(DARK_PRISMARINE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DRIED_KELP_ITEM = ITEMS.register("dried_kelp", () -> new BlockItem(DRIED_KELP.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DEAD_TUBE_CORAL_ITEM = ITEMS.register("dead_tube_coral", () -> new BlockItem(DEAD_TUBE_CORAL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DEAD_BRAIN_CORAL_ITEM = ITEMS.register("dead_brain_coral", () -> new BlockItem(DEAD_BRAIN_CORAL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DEAD_BUBBLE_CORAL_ITEM = ITEMS.register("dead_bubble_coral", () -> new BlockItem(DEAD_BUBBLE_CORAL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DEAD_FIRE_CORAL_ITEM = ITEMS.register("dead_fire_coral", () -> new BlockItem(DEAD_FIRE_CORAL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

   //NETHER DIMENSION ITEMS
    public static final RegistryObject<Item> DEAD_HORN_CORAL_ITEM = ITEMS.register("dead_horn_coral", () -> new BlockItem(DEAD_HORN_CORAL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> OBSIDIAN_ITEM = ITEMS.register("obsidian", () -> new BlockItem(OBSIDIAN.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> NETHERRACK_ITEM = ITEMS.register("netherrack", () -> new BlockItem(NETHERRACK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> NETHER_BRICKS_ITEM = ITEMS.register("nether_bricks", () -> new BlockItem(NETHER_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CHISELED_NETHER_BRICKS_ITEM = ITEMS.register("chiseled_nether_bricks", () -> new BlockItem(CHISELED_NETHER_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRACKED_NETHER_BRICKS_ITEM = ITEMS.register("cracked_nether_bricks", () -> new BlockItem(CRACKED_NETHER_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_ITEM = ITEMS.register("red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLACKSTONE_ITEM = ITEMS.register("blackstone", () -> new BlockItem(BLACKSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_ITEM = ITEMS.register("polished_blackstone", () -> new BlockItem(POLISHED_BLACKSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRACKED_POLISHED_BLACKSTONE_BRICKS_ITEM = ITEMS.register("cracked_polished_blackstone_bricks", () -> new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CHISELED_POLISHED_BLACKSTONE_ITEM = ITEMS.register("chiseled_polished_blackstone", () -> new BlockItem(CHISELED_POLISHED_BLACKSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_ITEM = ITEMS.register("gilded_blackstone", () -> new BlockItem(GILDED_BLACKSTONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> NETHER_WART_ITEM= ITEMS.register("nether_wart", () -> new BlockItem(NETHER_WART.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRIMSON_STEM_ITEM= ITEMS.register("crimson_stem", () -> new BlockItem(CRIMSON_STEM.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> STRIPPED_CRIMSON_STEM_ITEM= ITEMS.register("stripped_crimson_stem", () -> new BlockItem(STRIPPED_CRIMSON_STEM.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRIMSON_HYPHAE_ITEM= ITEMS.register("crimson_hyphae", () -> new BlockItem(CRIMSON_HYPHAE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> STRIPPED_CRIMSON_HYPHAE_ITEM= ITEMS.register("stripped_crimson_hyphae", () -> new BlockItem(STRIPPED_CRIMSON_HYPHAE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRIMSON_PLANKS_ITEM= ITEMS.register("crimson_planks", () -> new BlockItem(CRIMSON_PLANKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WARPED_WART_ITEM= ITEMS.register("warped_wart", () -> new BlockItem(WARPED_WART.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WARPED_STEM_ITEM= ITEMS.register("warped_stem", () -> new BlockItem(WARPED_STEM.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> STRIPPED_WARPED_STEM_ITEM= ITEMS.register("stripped_warped_stem", () -> new BlockItem(STRIPPED_WARPED_STEM.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WARPED_HYPHAE_ITEM= ITEMS.register("warped_hyphae", () -> new BlockItem(WARPED_HYPHAE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> STRIPPED_WARPED_HYPHAE_ITEM= ITEMS.register("stripped_warped_hyphae", () -> new BlockItem(STRIPPED_WARPED_HYPHAE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WARPED_PLANKS_ITEM= ITEMS.register("warped_planks", () -> new BlockItem(WARPED_PLANKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SOUL_SAND_ITEM = ITEMS.register("soul_sand", () -> new BlockItem(SOUL_SAND.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SOUL_SOIL_ITEM = ITEMS.register("soul_soil", () -> new BlockItem(SOUL_SOIL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> QUARTZ_ITEM = ITEMS.register("quartz", () -> new BlockItem(QUARTZ.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> QUARTZ_PILLAR_ITEM = ITEMS.register("quartz_pillar", () -> new  BlockItem(QUARTZ_PILLAR.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CHISELED_QUARTZ_ITEM = ITEMS.register("chiseled_quartz", () -> new BlockItem(CHISELED_QUARTZ.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SMOOTH_QUARTZ_ITEM = ITEMS.register("smooth_quartz", () -> new BlockItem(SMOOTH_QUARTZ.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> QUARTZ_BRICKS_ITEM = ITEMS.register("quartz_bricks", () -> new BlockItem(QUARTZ_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BASALT_ITEM = ITEMS.register("basalt", () -> new BlockItem(BASALT.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> POLISHED_BASALT_ITEM = ITEMS.register("polished_basalt", () -> new BlockItem(POLISHED_BASALT.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

    //END DIMENSION ITEMS
    public static final RegistryObject<Item> END_STONE_ITEM = ITEMS.register("end_stone", () -> new BlockItem(END_STONE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> END_STONE_BRICKS_ITEM = ITEMS.register("end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PURPUR_ITEM = ITEMS.register("purpur", () -> new BlockItem(PURPUR.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PURPUR_PILLAR_ITEM = ITEMS.register("purpur_pillar", () -> new BlockItem(PURPUR_PILLAR.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

    //NATURAL MISC ITEMS
    public static final RegistryObject<Item> BROWN_MUSHROOM_ITEM = ITEMS.register("brown_mushroom", () -> new BlockItem(BROWN_MUSHROOM.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_MUSHROOM_ITEM = ITEMS.register("red_mushroom", () -> new BlockItem(RED_MUSHROOM.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SNOW_ITEM = ITEMS.register("snow", () -> new BlockItem(SNOW.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ICE_ITEM = ITEMS.register("ice", () -> new BlockItem(ICE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PACKED_ICE_ITEM = ITEMS.register("packed_ice", () -> new BlockItem(PACKED_ICE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLUE_ICE_ITEM = ITEMS.register("blue_ice", () -> new BlockItem(BLUE_ICE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> HONEY_ITEM = ITEMS.register("honey", () -> new BlockItem(HONEY.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> HONEYCOMB_ITEM = ITEMS.register("honeycomb", () -> new BlockItem(HONEYCOMB.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SLIME_ITEM = ITEMS.register("slime", () -> new BlockItem(SLIME.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

    //DYEABLE BLOCK ITEMS
    public static final RegistryObject<Item> TERRACOTTA_ITEM = ITEMS.register("terracotta", () -> new BlockItem(TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_ITEM = ITEMS.register("black_terracotta", () -> new BlockItem(BLACK_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_ITEM = ITEMS.register("blue_terracotta", () -> new BlockItem(BLUE_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_ITEM = ITEMS.register("brown_terracotta", () -> new BlockItem(BROWN_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_ITEM = ITEMS.register("cyan_terracotta", () -> new BlockItem(CYAN_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_ITEM = ITEMS.register("gray_terracotta", () -> new BlockItem(GRAY_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_ITEM = ITEMS.register("green_terracotta", () -> new BlockItem(GREEN_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_ITEM = ITEMS.register("light_blue_terracotta", () -> new BlockItem(LIGHT_BLUE_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_ITEM = ITEMS.register("light_gray_terracotta", () -> new BlockItem(LIGHT_GRAY_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIME_TERRACOTTA_ITEM = ITEMS.register("lime_terracotta", () -> new BlockItem(LIME_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_ITEM = ITEMS.register("magenta_terracotta", () -> new BlockItem(MAGENTA_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_ITEM = ITEMS.register("orange_terracotta", () -> new BlockItem(ORANGE_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PINK_TERRACOTTA_ITEM = ITEMS.register("pink_terracotta", () -> new BlockItem(PINK_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_ITEM = ITEMS.register("purple_terracotta", () -> new BlockItem(PURPLE_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_TERRACOTTA_ITEM = ITEMS.register("red_terracotta", () -> new BlockItem(RED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_ITEM = ITEMS.register("white_terracotta", () -> new BlockItem(WHITE_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_ITEM = ITEMS.register("yellow_terracotta", () -> new BlockItem(YELLOW_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLACK_GLAZED_TERRACOTTA_ITEM = ITEMS.register("black_glazed_terracotta", () -> new  BlockItem(BLACK_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLUE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("blue_glazed_terracotta", () -> new  BlockItem(BLUE_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BROWN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("brown_glazed_terracotta", () -> new  BlockItem(BROWN_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CYAN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("cyan_glazed_terracotta", () -> new BlockItem(CYAN_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GRAY_GLAZED_TERRACOTTA_ITEM = ITEMS.register("gray_glazed_terracotta", () -> new BlockItem(GRAY_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GREEN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("green_glazed_terracotta", () -> new BlockItem(GREEN_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("light_blue_glazed_terracotta", () -> new BlockItem(LIGHT_BLUE_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_GLAZED_TERRACOTTA_ITEM = ITEMS.register("light_gray_glazed_terracotta", () -> new BlockItem(LIGHT_GRAY_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIME_GLAZED_TERRACOTTA_ITEM = ITEMS.register("lime_glazed_terracotta", () -> new BlockItem(LIME_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final	RegistryObject<Item> MAGENTA_GLAZED_TERRACOTTA_ITEM = ITEMS.register("magenta_glazed_terracotta", () -> new BlockItem(MAGENTA_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ORANGE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("orange_glazed_terracotta", () -> new BlockItem(ORANGE_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PINK_GLAZED_TERRACOTTA_ITEM = ITEMS.register("pink_glazed_terracotta", () -> new BlockItem(PINK_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PURPLE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("purple_glazed_terracotta", () -> new BlockItem(PURPLE_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_GLAZED_TERRACOTTA_ITEM = ITEMS.register("red_glazed_terracotta", () -> new BlockItem(RED_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WHITE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("white_glazed_terracotta", () -> new BlockItem(WHITE_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> YELLOW_GLAZED_TERRACOTTA_ITEM = ITEMS.register("yellow_glazed_terracotta", () -> new BlockItem(YELLOW_GLAZED_TERRACOTTA.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLACK_CONCRETE_POWDER_ITEM = ITEMS.register("black_concrete_powder", () -> new BlockItem(BLACK_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLUE_CONCRETE_POWDER_ITEM = ITEMS.register("blue_concrete_powder", () -> new BlockItem(BLUE_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BROWN_CONCRETE_POWDER_ITEM = ITEMS.register("brown_concrete_powder", () -> new BlockItem(BROWN_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CYAN_CONCRETE_POWDER_ITEM = ITEMS.register("cyan_concrete_powder", () -> new BlockItem(CYAN_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GRAY_CONCRETE_POWDER_ITEM = ITEMS.register("gray_concrete_powder", () -> new BlockItem(GRAY_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GREEN_CONCRETE_POWDER_ITEM = ITEMS.register("green_concrete_powder", () -> new BlockItem(GREEN_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_POWDER_ITEM = ITEMS.register("light_blue_concrete_powder", () -> new BlockItem(LIGHT_BLUE_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_POWDER_ITEM = ITEMS.register("light_gray_concrete_powder", () -> new BlockItem(LIGHT_GRAY_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIME_CONCRETE_POWDER_ITEM = ITEMS.register("lime_concrete_powder", () -> new BlockItem(LIME_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_POWDER_ITEM = ITEMS.register("magenta_concrete_powder", () -> new BlockItem(MAGENTA_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ORANGE_CONCRETE_POWDER_ITEM= ITEMS.register("orange_concrete_powder", () -> new BlockItem(ORANGE_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PINK_CONCRETE_POWDER_ITEM = ITEMS.register("pink_concrete_powder", () -> new BlockItem(PINK_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PURPLE_CONCRETE_POWDER_ITEM = ITEMS.register("purple_concrete_powder", () -> new BlockItem(PURPLE_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_CONCRETE_POWDER_ITEM = ITEMS.register("red_concrete_powder", () -> new BlockItem(RED_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WHITE_CONCRETE_POWDER_ITEM = ITEMS.register("white_concrete_powder", () -> new BlockItem(WHITE_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> YELLOW_CONCRETE_POWDER_ITEM = ITEMS.register("yellow_concrete_powder", () -> new BlockItem(YELLOW_CONCRETE_POWDER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLACK_CONCRETE_ITEM = ITEMS.register("black_concrete", () -> new BlockItem(BLACK_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLUE_CONCRETE_ITEM = ITEMS.register("blue_concrete", () -> new BlockItem(BLUE_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BROWN_CONCRETE_ITEM = ITEMS.register("brown_concrete", () -> new BlockItem(BROWN_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CYAN_CONCRETE_ITEM = ITEMS.register("cyan_concrete", () -> new BlockItem(CYAN_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GRAY_CONCRETE_ITEM = ITEMS.register("gray_concrete", () -> new BlockItem(GRAY_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GREEN_CONCRETE_ITEM = ITEMS.register("green_concrete", () -> new BlockItem(GREEN_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIME_CONCRETE_ITEM = ITEMS.register("lime_concrete", () -> new BlockItem(LIME_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_ITEM = ITEMS.register("light_blue_concrete", () -> new BlockItem(LIGHT_BLUE_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_ITEM = ITEMS.register("light_gray_concrete", () -> new BlockItem(LIGHT_GRAY_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_ITEM = ITEMS.register("magenta_concrete", () -> new BlockItem(MAGENTA_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ORANGE_CONCRETE_ITEM = ITEMS.register("orange_concrete", () -> new BlockItem(ORANGE_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PINK_CONCRETE_ITEM = ITEMS.register("pink_concrete", () -> new BlockItem(PINK_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PURPLE_CONCRETE_ITEM= ITEMS.register("purple_concrete", () -> new BlockItem(PURPLE_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_CONCRETE_ITEM = ITEMS.register("red_concrete", () -> new BlockItem(RED_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WHITE_CONCRETE_ITEM = ITEMS.register("white_concrete", () -> new BlockItem(WHITE_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> YELLOW_CONCRETE_ITEM = ITEMS.register("yellow_concrete", () -> new BlockItem(YELLOW_CONCRETE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLACK_WOOL_ITEM = ITEMS.register("black_wool", () -> new BlockItem(BLACK_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLUE_WOOL_ITEM = ITEMS.register("blue_wool", () -> new BlockItem(BLUE_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BROWN_WOOL_ITEM = ITEMS.register("brown_wool", () -> new BlockItem(BROWN_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CYAN_WOOL_ITEM = ITEMS.register("cyan_wool", () -> new BlockItem(CYAN_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GRAY_WOOL_ITEM = ITEMS.register("gray_wool", () -> new BlockItem(GRAY_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GREEN_WOOL_ITEM = ITEMS.register("green_wool", () -> new BlockItem(GREEN_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_ITEM = ITEMS.register("light_blue_wool", () -> new BlockItem(LIGHT_BLUE_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_ITEM = ITEMS.register("light_gray_wool", () -> new BlockItem(LIGHT_GRAY_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIME_WOOL_ITEM = ITEMS.register("lime_wool", () -> new BlockItem(LIME_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> MAGENTA_WOOL_ITEM = ITEMS.register("magenta_wool", () -> new BlockItem(MAGENTA_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ORANGE_WOOL_ITEM = ITEMS.register("orange_wool", () -> new BlockItem(ORANGE_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PINK_WOOL_ITEM = ITEMS.register("pink_wool", () -> new BlockItem(PINK_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PURPLE_WOOL_ITEM = ITEMS.register("purple_wool", () -> new BlockItem(PURPLE_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_WOOL_ITEM = ITEMS.register("red_wool", () -> new BlockItem(RED_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WHITE_WOOL_ITEM = ITEMS.register("white_wool", () -> new BlockItem(WHITE_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> YELLOW_WOOL_ITEM = ITEMS.register("yellow_wool", () -> new BlockItem(YELLOW_WOOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

    //DIRT ITEMS
    public static final RegistryObject<Item> GRASS_BLOCK_ITEM = ITEMS.register("grass_block", () -> new BlockItem(GRASS_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DIRT_ITEM = ITEMS.register("dirt", () -> new BlockItem(DIRT.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> COARSE_DIRT_ITEM = ITEMS.register("coarse_dirt", () -> new BlockItem(COARSE_DIRT.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PODZOL_ITEM = ITEMS.register("podzol", () -> new BlockItem(PODZOL.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

   //LEAVES ITEMS
    public static final RegistryObject<Item> ACACIA_LEAVES_ITEM = ITEMS.register("acacia_leaves", () -> new BlockItem(ACACIA_LEAVES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BIRCH_LEAVES_ITEM = ITEMS.register("birch_leaves", () -> new BlockItem(BIRCH_LEAVES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DARK_OAK_LEAVES_ITEM = ITEMS.register("dark_oak_leaves", () -> new BlockItem(DARK_OAK_LEAVES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> JUNGLE_LEAVES_ITEM = ITEMS.register("jungle_leaves", () -> new BlockItem(JUNGLE_LEAVES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> OAK_LEAVES_ITEM = ITEMS.register("oak_leaves", () -> new BlockItem(OAK_LEAVES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SPRUCE_LEAVES_ITEM = ITEMS.register("spruce_leaves", () -> new BlockItem(SPRUCE_LEAVES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

   //GLASS ITEMS
    public static final RegistryObject<Item> GLASS_ITEM = ITEMS.register("glass", () -> new BlockItem(GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLACK_STAINED_GLASS_ITEM = ITEMS.register("black_stained_glass", () -> new BlockItem(BLACK_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLUE_STAINED_GLASS_ITEM = ITEMS.register("blue_stained_glass", () -> new BlockItem(BLUE_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BROWN_STAINED_GLASS_ITEM = ITEMS.register("brown_stained_glass", () -> new BlockItem(BROWN_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CYAN_STAINED_GLASS_ITEM = ITEMS.register("cyan_stained_glass", () -> new BlockItem(CYAN_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GRAY_STAINED_GLASS_ITEM = ITEMS.register("gray_stained_glass", () -> new BlockItem(GRAY_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GREEN_STAINED_GLASS_ITEM = ITEMS.register("green_stained_glass", () -> new BlockItem(GREEN_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_GLASS_ITEM = ITEMS.register("light_blue_stained_glass", () -> new BlockItem(LIGHT_BLUE_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_GLASS_ITEM = ITEMS.register("light_gray_stained_glass", () -> new BlockItem(LIGHT_GRAY_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LIME_STAINED_GLASS_ITEM = ITEMS.register("lime_stained_glass", () -> new BlockItem(LIME_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> MAGENTA_STAINED_GLASS_ITEM = ITEMS.register("magenta_stained_glass", () -> new BlockItem(MAGENTA_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ORANGE_STAINED_GLASS_ITEM = ITEMS.register("orange_stained_glass", () -> new BlockItem(ORANGE_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PINK_STAINED_GLASS_ITEM = ITEMS.register("pink_stained_glass", () -> new BlockItem(PINK_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PURPLE_STAINED_GLASS_ITEM = ITEMS.register("purple_stained_glass", () -> new BlockItem(PURPLE_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RED_STAINED_GLASS_ITEM = ITEMS.register("red_stained_glass", () -> new BlockItem(RED_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WHITE_STAINED_GLASS_ITEM = ITEMS.register("white_stained_glass", () -> new BlockItem(WHITE_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> YELLOW_STAINED_GLASS_ITEM = ITEMS.register("yellow_stained_glass", () -> new BlockItem(YELLOW_STAINED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    
}


