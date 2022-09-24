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


    //1.18 UPDATE BLOCKS
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> AZALEA_LEAVES = BLOCKS.register("azalea_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CALCITE = BLOCKS.register("calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE = BLOCKS.register("chiseled_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE = BLOCKS.register("cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS = BLOCKS.register("cracked_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES = BLOCKS.register("cracked_deepslate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CUT_COPPER = BLOCKS.register("cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEEPSLATE = BLOCKS.register("deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEEPSLATE_TILES = BLOCKS.register("deepslate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK = BLOCKS.register("dripstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EXPOSED_COPPER = BLOCKS.register("exposed_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER = BLOCKS.register("exposed_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES = BLOCKS.register("flowering_azalea_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MOSS_BLOCK = BLOCKS.register("moss_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OXIDIZED_COPPER = BLOCKS.register("oxidized_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER = BLOCKS.register("oxidized_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE = BLOCKS.register("polished_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK = BLOCKS.register("raw_copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK = BLOCKS.register("raw_gold_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RAW_IRON_BLOCK = BLOCKS.register("raw_iron_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ROOTED_DIRT = BLOCKS.register("rooted_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_BASALT = BLOCKS.register("smooth_basalt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> TINTED_GLASS = BLOCKS.register("tinted_glass", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> TUFF = BLOCKS.register("tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WEATHERED_COPPER = BLOCKS.register("weathered_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER = BLOCKS.register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_COPPER_BLOCK = BLOCKS.register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_CUT_COPPER = BLOCKS.register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER = BLOCKS.register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_CUT_COPPER = BLOCKS.register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER = BLOCKS.register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_EXPOSED_CUT_COPPER = BLOCKS.register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER = BLOCKS.register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_WEATHERED_CUT_COPPER = BLOCKS.register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).lightLevel((state) -> 15)));

    //1.16 UPDATE BLOCKS
    public static final RegistryObject<Block> BEDROCK = BLOCKS.register("bedrock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_NYLIUM = BLOCKS.register("crimson_nylium", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRYING_OBSIDIAN = BLOCKS.register("crying_obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_NYLIUM = BLOCKS.register("warped_nylium", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).lightLevel((state) -> 15)));

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
    public static final RegistryObject<Block> COAL_BLOCK = BLOCKS.register("coal_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> IRON_BLOCK = BLOCKS.register("iron_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GOLD_BLOCK = BLOCKS.register("gold_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIAMOND_BLOCK = BLOCKS.register("diamond_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EMERALD_BLOCK = BLOCKS.register("emerald_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> REDSTONE_BLOCK = BLOCKS.register("redstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LAPIS_BLOCK = BLOCKS.register("lapis_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHERITE_BLOCK = BLOCKS.register("netherite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).lightLevel((state) -> 15)));

    //DESERT SPECIFIC (+ GRAVEL I GUESS?)
    public static final RegistryObject<Block> BONE_BLOCK = BLOCKS.register("bone_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).lightLevel((state) -> 15)));
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
    public static final RegistryObject<Block> QUARTZ_BLOCK = BLOCKS.register("quartz_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).lightLevel((state) -> 15)));
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
    public static final RegistryObject<Block> SNOW_BLOCK = BLOCKS.register("snow_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ICE = BLOCKS.register("ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PACKED_ICE = BLOCKS.register("packed_ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_ICE = BLOCKS.register("blue_ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HONEYCOMB = BLOCKS.register("honeycomb", () -> new Block(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK).lightLevel((state) -> 15)));

    //DYEABLE BLOCKS
    //TERRACOTTA
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

    //CONCRETE
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

    //1.18 UPDATE ITEMS
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ITEMS.register("amethyst_block", () -> new BlockItem(AMETHYST_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> AZALEA_LEAVES_ITEM = ITEMS.register("azalea_leaves", () -> new BlockItem(AZALEA_LEAVES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CALCITE_ITEM = ITEMS.register("calcite", () -> new BlockItem(CALCITE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CHISELED_DEEPSLATE_ITEM = ITEMS.register("chiseled_deepslate", () -> new BlockItem(CHISELED_DEEPSLATE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_ITEM = ITEMS.register("cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRACKED_DEEPSLATE_BRICKS_ITEM = ITEMS.register("cracked_deepslate_bricks", () -> new BlockItem(CRACKED_DEEPSLATE_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRACKED_DEEPSLATE_TILES_ITEM = ITEMS.register("cracked_deepslate_tiles", () -> new BlockItem(CRACKED_DEEPSLATE_TILES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItem(COPPER_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CUT_COPPER_ITEM = ITEMS.register("cut_copper", () -> new BlockItem(CUT_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DEEPSLATE_ITEM = ITEMS.register("deepslate", () -> new BlockItem(DEEPSLATE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DEEPSLATE_TILES_ITEM = ITEMS.register("deepslate_tiles", () -> new BlockItem(DEEPSLATE_TILES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DRIPSTONE_BLOCK_ITEM = ITEMS.register("dripstone_block", () -> new BlockItem(DRIPSTONE_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> EXPOSED_COPPER_ITEM = ITEMS.register("exposed_copper", () -> new BlockItem(EXPOSED_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> EXPOSED_CUT_COPPER_ITEM = ITEMS.register("exposed_cut_copper", () -> new BlockItem(EXPOSED_CUT_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> FLOWERING_AZALEA_LEAVES_ITEM = ITEMS.register("flowering_azalea_leaves", () -> new BlockItem(FLOWERING_AZALEA_LEAVES.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> MOSS_BLOCK_ITEM = ITEMS.register("moss_block", () -> new BlockItem(MOSS_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> OXIDIZED_COPPER_ITEM = ITEMS.register("oxidized_copper", () -> new BlockItem(OXIDIZED_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> OXIDIZED_CUT_COPPER_ITEM = ITEMS.register("oxidized_cut_copper", () -> new BlockItem(OXIDIZED_CUT_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> POLISHED_DEEPSLATE_ITEM = ITEMS.register("polished_deepslate", () -> new BlockItem(POLISHED_DEEPSLATE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_ITEM = ITEMS.register("raw_copper_block", () -> new BlockItem(RAW_COPPER_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_ITEM = ITEMS.register("raw_gold_block", () -> new BlockItem(RAW_GOLD_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_ITEM = ITEMS.register("raw_iron_block", () -> new BlockItem(RAW_IRON_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ROOTED_DIRT_ITEM = ITEMS.register("rooted_dirt", () -> new BlockItem(ROOTED_DIRT.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> SMOOTH_BASALT_ITEM = ITEMS.register("smooth_basalt", () -> new BlockItem(SMOOTH_BASALT.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> TINTED_GLASS_ITEM = ITEMS.register("tinted_glass", () -> new BlockItem(TINTED_GLASS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> TUFF_ITEM = ITEMS.register("tuff", () -> new BlockItem(TUFF.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WAXED_COPPER_BLOCK_ITEM = ITEMS.register("waxed_copper_block", () -> new BlockItem(WAXED_COPPER_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WAXED_CUT_COPPER_ITEM = ITEMS.register("waxed_cut_copper", () -> new BlockItem(WAXED_CUT_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_ITEM = ITEMS.register("waxed_exposed_copper", () -> new BlockItem(WAXED_EXPOSED_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WAXED_EXPOSED_CUT_COPPER_ITEM = ITEMS.register("waxed_exposed_cut_copper", () -> new BlockItem(WAXED_EXPOSED_CUT_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_ITEM = ITEMS.register("waxed_oxidized_copper", () -> new BlockItem(WAXED_OXIDIZED_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WAXED_OXIDIZED_CUT_COPPER_ITEM = ITEMS.register("waxed_oxidized_cut_copper", () -> new BlockItem(WAXED_OXIDIZED_CUT_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_ITEM = ITEMS.register("waxed_weathered_copper", () -> new BlockItem(WAXED_WEATHERED_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WAXED_WEATHERED_CUT_COPPER_ITEM = ITEMS.register("waxed_weathered_cut_copper", () -> new BlockItem(WAXED_WEATHERED_CUT_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WEATHERED_COPPER_ITEM = ITEMS.register("weathered_copper", () -> new BlockItem(WEATHERED_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WEATHERED_CUT_COPPER_ITEM = ITEMS.register("weathered_cut_copper", () -> new BlockItem(WEATHERED_CUT_COPPER.get(), new Item.Properties().tab(SWLM.SWLMTAB)));


    //1.16 UPDATE ITEMS
    public static final RegistryObject<Item> BEDROCK_ITEM = ITEMS.register("bedrock", () -> new BlockItem(BEDROCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_ITEM = ITEMS.register("crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_ITEM = ITEMS.register("crying_obsidian", () -> new BlockItem(CRYING_OBSIDIAN.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICKS_ITEM = ITEMS.register("polished_blackstone_bricks", () -> new BlockItem(POLISHED_BLACKSTONE_BRICKS.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> WARPED_NYLIUM_ITEM = ITEMS.register("warped_nylium", () -> new BlockItem(WARPED_NYLIUM.get(), new Item.Properties().tab(SWLM.SWLMTAB)));


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
    public static final RegistryObject<Item> COAL_BLOCK_ITEM = ITEMS.register("coal_block", () -> new BlockItem(COAL_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> IRON_BLOCK_ITEM = ITEMS.register("iron_block", () -> new BlockItem(IRON_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> GOLD_BLOCK_ITEM = ITEMS.register("gold_block", () -> new BlockItem(GOLD_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> DIAMOND_BLOCK_ITEM = ITEMS.register("diamond_block", () -> new BlockItem(DIAMOND_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> EMERALD_BLOCK_ITEM = ITEMS.register("emerald_block", () -> new BlockItem(EMERALD_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> REDSTONE_BLOCK_ITEM = ITEMS.register("redstone_block", () -> new BlockItem(REDSTONE_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> LAPIS_BLOCK_ITEM = ITEMS.register("lapis_block", () -> new BlockItem(LAPIS_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> NETHERITE_BLOCK_ITEM = ITEMS.register("netherite_block", () -> new BlockItem(NETHERITE_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

   //DESERT SPECIFIC ITEMS
    public static final RegistryObject<Item> BONE_BLOCK_ITEM = ITEMS.register("bone_block", () -> new  BlockItem(BONE_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
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

   //NETHER DIMENSION ITEMS
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
    public static final RegistryObject<Item> QUARTZ_BLOCK_ITEM = ITEMS.register("quartz_block", () -> new BlockItem(QUARTZ_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
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
    public static final RegistryObject<Item> SNOW_BLOCK_ITEM = ITEMS.register("snow_block", () -> new BlockItem(SNOW_BLOCK.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> ICE_ITEM = ITEMS.register("ice", () -> new BlockItem(ICE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PACKED_ICE_ITEM = ITEMS.register("packed_ice", () -> new BlockItem(PACKED_ICE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> BLUE_ICE_ITEM = ITEMS.register("blue_ice", () -> new BlockItem(BLUE_ICE.get(), new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> HONEYCOMB_ITEM = ITEMS.register("honeycomb", () -> new BlockItem(HONEYCOMB.get(), new Item.Properties().tab(SWLM.SWLMTAB)));

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


