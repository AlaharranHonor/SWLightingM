package com.alaharranhonor.swlm.util.registry;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.block.HangingStarWormsBlock;
import com.alaharranhonor.swlm.items.GlowMothItem;
import com.alaharranhonor.swlm.items.PestleMortarItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;


public class SWLMBlocks {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SWLM.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SWLM.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //HAHA WORM ROCKS
    public static final RegistryObject<Block> STAR_WORM_COBBLE = register("star_worm_cobble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).lightLevel((state) -> 7)));
    public static final RegistryObject<Block> HANGING_STAR_WORMS = register("hanging_star_worms", () -> new HangingStarWormsBlock(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS).lightLevel((state) -> 7)));
    //public static final RegistryObject<Block> STAR_WORM_VINES = registerNoItem("star_worm_vines", () -> new StarWormVinesBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().lightLevel(CaveVines.emission(14)).instabreak().sound(SoundType.CAVE_VINES)));
    //public static final RegistryObject<Block> STAR_WORM_VINES_PLANT = registerNoItem("star_worm_vines_plant", () -> new StarWormVinesPlantBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().lightLevel(CaveVines.emission(14)).instabreak().sound(SoundType.CAVE_VINES)));


    //1.18 UPDATE BLOCKS
    public static final RegistryObject<Block> AMETHYST_BLOCK = register("amethyst_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> AZALEA_LEAVES = register("azalea_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CALCITE = register("calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE = register("chiseled_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE = register("cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS = register("cracked_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES = register("cracked_deepslate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COPPER_BLOCK = register("copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CUT_COPPER = register("cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEEPSLATE = register("deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEEPSLATE_TILES = register("deepslate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK = register("dripstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EXPOSED_COPPER = register("exposed_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER = register("exposed_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES = register("flowering_azalea_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MOSS_BLOCK = register("moss_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OXIDIZED_COPPER = register("oxidized_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER = register("oxidized_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE = register("polished_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK = register("raw_copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK = register("raw_gold_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RAW_IRON_BLOCK = register("raw_iron_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ROOTED_DIRT = register("rooted_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_BASALT = register("smooth_basalt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> TINTED_GLASS = register("tinted_glass", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> TUFF = register("tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WEATHERED_COPPER = register("weathered_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER = register("weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_COPPER_BLOCK = register("waxed_copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_CUT_COPPER = register("waxed_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER = register("waxed_oxidized_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_CUT_COPPER = register("waxed_oxidized_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER = register("waxed_exposed_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_EXPOSED_CUT_COPPER = register("waxed_exposed_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER = register("waxed_weathered_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_WEATHERED_CUT_COPPER = register("waxed_weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEEPSLATE_BRICKS = register("deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).lightLevel((state) -> 15)));


    //1.16 UPDATE BLOCKS
    public static final RegistryObject<Block> BEDROCK = register("bedrock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_NYLIUM = register("crimson_nylium", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRYING_OBSIDIAN = register("crying_obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS = register("polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_NYLIUM = register("warped_nylium", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).lightLevel((state) -> 15)));

    //WOOD, BAYBEEE!
    public static final RegistryObject<Block> ACACIA_LOG = register("acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_LOG = register("birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_LOG = register("dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_LOG = register("jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_LOG = register("oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_LOG = register("spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_STRIPPED_LOG = register("stripped_acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_STRIPPED_LOG = register("stripped_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_STRIPPED_LOG = register("stripped_dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_STRIPPED_LOG = register("stripped_jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_STRIPPED_LOG = register("stripped_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_STRIPPED_LOG = register("stripped_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_WOOD = register("acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_WOOD = register("birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_WOOD = register("dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_WOOD = register("jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_WOOD = register("oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_WOOD = register("spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_STRIPPED_WOOD = register("stripped_acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_STRIPPED_WOOD = register("stripped_birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_STRIPPED_WOOD = register("stripped_dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_STRIPPED_WOOD = register("stripped_jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_STRIPPED_WOOD = register("stripped_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_STRIPPED_WOOD = register("stripped_spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_PLANKS = register("acacia_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_PLANKS = register("birch_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_PLANKS = register("dark_oak_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_PLANKS = register("jungle_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_PLANKS = register("oak_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_PLANKS = register("spruce_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).lightLevel((state) -> 15)));

    //ROCKS!
    public static final RegistryObject<Block> STONE = register("stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_STONE = register("smooth_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLESTONE = register("cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE = register("mossy_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ANDESITE = register("andesite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_ANDESITE = register("polished_andesite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIORITE = register("diorite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_DIORITE = register("polished_diorite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRANITE = register("granite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_GRANITE = register("polished_granite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STONE_BRICKS = register("stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICKS = register("cracked_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS = register("mossy_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS = register("chiseled_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).lightLevel((state) -> 15)));

    //CONDENSED ORE BLOCKS
    public static final RegistryObject<Block> COAL_BLOCK = register("coal_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> IRON_BLOCK = register("iron_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GOLD_BLOCK = register("gold_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIAMOND_BLOCK = register("diamond_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EMERALD_BLOCK = register("emerald_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> REDSTONE_BLOCK = register("redstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LAPIS_BLOCK = register("lapis_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHERITE_BLOCK = register("netherite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).lightLevel((state) -> 15)));

    //DESERT SPECIFIC (+ GRAVEL I GUESS?)
    public static final RegistryObject<Block> BONE_BLOCK = register("bone_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAVEL = register("gravel", () -> new GravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CLAY = register("clay", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BRICKS = register("bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SAND = register("sand", () -> new SandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SANDSTONE = register("sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CUT_SANDSTONE = register("cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE = register("smooth_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_SANDSTONE = register("chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_SAND = register("red_sand", () -> new SandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_SANDSTONE = register("red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE = register("cut_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE = register("smooth_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE = register("chiseled_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).lightLevel((state) -> 15)));

    //OCEAN
    public static final RegistryObject<Block> PRISMARINE = register("prismarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PRISMARINE_BRICKS = register("prismarine_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_PRISMARINE = register("dark_prismarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DRIED_KELP = register("dried_kelp", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIED_KELP_BLOCK).lightLevel((state) -> 15)));

    //NETHER DIMENSION
    public static final RegistryObject<Block> OBSIDIAN = register("obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHERRACK = register("netherrack", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS = register("chiseled_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS = register("cracked_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHER_BRICKS = register("nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_NETHER_BRICKS = register("red_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACKSTONE = register("blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE = register("polished_blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS = register("cracked_polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE = register("chiseled_polished_blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE = register("gilded_blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHER_WART = register("nether_wart", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_STEM = register("crimson_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM = register("stripped_crimson_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_HYPHAE = register("crimson_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE = register("stripped_crimson_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_PLANKS = register("crimson_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_WART_BLOCK = register("warped_wart_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_STEM = register("warped_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_WARPED_STEM = register("stripped_warped_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_HYPHAE = register("warped_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE = register("stripped_warped_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_PLANKS = register("warped_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SOUL_SAND = register("soul_sand", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SOUL_SOIL = register("soul_soil", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> QUARTZ_BLOCK = register("quartz_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> QUARTZ_PILLAR = register("quartz_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_QUARTZ = register("chiseled_quartz", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_QUARTZ = register("smooth_quartz", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> QUARTZ_BRICKS = register("quartz_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BASALT = register("basalt", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_BASALT = register("polished_basalt", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT).lightLevel((state) -> 15)));

    //END DIMENSION
    public static final RegistryObject<Block> END_STONE = register("end_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> END_STONE_BRICKS = register("end_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPUR = register("purpur", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPUR_PILLAR = register("purpur_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).lightLevel((state) -> 15)));

    //NATURAL... EDIBLES?? (MISC)
    public static final RegistryObject<Block> BROWN_MUSHROOM = register("brown_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_MUSHROOM = register("red_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SNOW_BLOCK = register("snow_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).lightLevel((state) -> 11)));
    public static final RegistryObject<Block> ICE = register("ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PACKED_ICE = register("packed_ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_ICE = register("blue_ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HONEYCOMB = register("honeycomb", () -> new Block(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK).lightLevel((state) -> 15)));

    //DYEABLE BLOCKS
    //TERRACOTTA
    public static final RegistryObject<Block> TERRACOTTA = register("terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA = register("black_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA = register("blue_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA = register("brown_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA = register("cyan_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA = register("gray_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA = register("green_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA = register("light_blue_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA = register("light_gray_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_TERRACOTTA = register("lime_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA = register("magenta_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA = register("orange_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_TERRACOTTA = register("pink_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA = register("purple_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_TERRACOTTA = register("red_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA = register("white_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA = register("yellow_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA = register("black_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA = register("blue_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA = register("brown_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA = register("cyan_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA = register("gray_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA = register("green_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA = register("light_blue_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA = register("light_gray_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA = register("lime_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA = register("magenta_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA = register("orange_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA = register("pink_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA = register("purple_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA = register("red_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA = register("white_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA = register("yellow_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));

    //CONCRETE
    public static final RegistryObject<Block> BLACK_CONCRETE_POWDER = register("black_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_CONCRETE_POWDER = register("blue_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_CONCRETE_POWDER = register("brown_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_CONCRETE_POWDER = register("cyan_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_CONCRETE_POWDER = register("gray_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_CONCRETE_POWDER = register("green_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_POWDER = register("light_blue_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_POWDER = register("light_gray_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_CONCRETE_POWDER = register("lime_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_POWDER = register("magenta_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_POWDER = register("orange_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_CONCRETE_POWDER = register("pink_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_POWDER = register("purple_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_CONCRETE_POWDER = register("red_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_CONCRETE_POWDER = register("white_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_POWDER = register("yellow_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_CONCRETE = register("black_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_CONCRETE = register("blue_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_CONCRETE = register("brown_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_CONCRETE = register("cyan_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_CONCRETE = register("gray_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_CONCRETE = register("green_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_CONCRETE = register("lime_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE = register("light_blue_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE = register("light_gray_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE = register("magenta_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_CONCRETE = register("orange_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_CONCRETE = register("pink_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_CONCRETE= register("purple_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_CONCRETE = register("red_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_CONCRETE = register("white_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_CONCRETE = register("yellow_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_WOOL = register("black_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_WOOL = register("blue_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_WOOL = register("brown_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_WOOL = register("cyan_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_WOOL = register("gray_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_WOOL = register("green_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL = register("light_blue_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL = register("light_gray_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_WOOL = register("lime_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_WOOL = register("magenta_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_WOOL = register("orange_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_WOOL = register("pink_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_WOOL = register("purple_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_WOOL = register("red_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_WOOL = register("white_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_WOOL = register("yellow_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).lightLevel((state) -> 15)));

    //LEAVES
    public static final RegistryObject<Block> ACACIA_LEAVES = register("acacia_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_LEAVES = register("birch_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_LEAVES = register("dark_oak_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_LEAVES = register("jungle_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_LEAVES = register("oak_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_LEAVES = register("spruce_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES).lightLevel((state) -> 15)));

    //DIRT
    public static final RegistryObject<Block> GRASS_BLOCK = register("grass_block", () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COARSE_DIRT = register("coarse_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIRT = register("dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PODZOL = register("podzol", () -> new SnowyDirtBlock(BlockBehaviour.Properties.copy(Blocks.PODZOL).lightLevel((state) -> 15)));

    //GLASS
    public static final RegistryObject<Block> GLASS = register("glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_STAINED_GLASS = register("black_stained_glass", () -> new StainedGlassBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_STAINED_GLASS = register("blue_stained_glass", () -> new StainedGlassBlock(DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_STAINED_GLASS = register("brown_stained_glass", () -> new StainedGlassBlock(DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_STAINED_GLASS = register("cyan_stained_glass", () -> new StainedGlassBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_STAINED_GLASS = register("gray_stained_glass", () -> new StainedGlassBlock(DyeColor.GRAY, BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_STAINED_GLASS = register("green_stained_glass", () -> new StainedGlassBlock(DyeColor.GREEN, BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS = register("light_blue_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS = register("light_gray_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_STAINED_GLASS = register("lime_stained_glass", () -> new StainedGlassBlock(DyeColor.LIME, BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS = register("magenta_stained_glass", () -> new StainedGlassBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS = register("orange_stained_glass", () -> new StainedGlassBlock(DyeColor.ORANGE, BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_STAINED_GLASS = register("pink_stained_glass", () -> new StainedGlassBlock(DyeColor.PINK, BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS = register("purple_stained_glass", () -> new StainedGlassBlock(DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_STAINED_GLASS = register("red_stained_glass", () -> new StainedGlassBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_STAINED_GLASS = register("white_stained_glass", () -> new StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS = register("yellow_stained_glass", () -> new StainedGlassBlock(DyeColor.YELLOW, BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS).lightLevel((state) -> 15)));

    public static final RegistryObject<Block> DEAD_TUBE_CORAL_BLOCK = register("dead_tube_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL_BLOCK = register("dead_brain_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL_BLOCK = register("dead_bubble_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> DEAD_FIRE_CORAL_BLOCK = register("dead_fire_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> DEAD_HORN_CORAL_BLOCK = register("dead_horn_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> TUBE_CORAL_BLOCK = register("tube_coral_block", () -> new CoralBlock(DEAD_TUBE_CORAL_BLOCK.get(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final RegistryObject<Block> BRAIN_CORAL_BLOCK = register("brain_coral_block", () -> new CoralBlock(DEAD_BRAIN_CORAL_BLOCK.get(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final RegistryObject<Block> BUBBLE_CORAL_BLOCK = register("bubble_coral_block", () -> new CoralBlock(DEAD_BUBBLE_CORAL_BLOCK.get(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final RegistryObject<Block> FIRE_CORAL_BLOCK = register("fire_coral_block", () -> new CoralBlock(DEAD_FIRE_CORAL_BLOCK.get(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final RegistryObject<Block> HORN_CORAL_BLOCK = register("horn_coral_block", () -> new CoralBlock(DEAD_HORN_CORAL_BLOCK.get(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    //** ITEMS START HERE**//

    //AAH! A MOTH!
    public static final RegistryObject<Item> STAR_WORM_MOTH = ITEMS.register("star_worm_moth", () -> new GlowMothItem(new Item.Properties().stacksTo(1).tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> STAR_WORM = ITEMS.register("star_worm", () -> new Item(new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> STAR_WORM_GOOP = ITEMS.register("star_worm_goop", () -> new Item(new Item.Properties().tab(SWLM.SWLMTAB)));
    public static final RegistryObject<Item> PESTLE_MORTAR = ITEMS.register("pestle_mortar", () -> new PestleMortarItem(new Item.Properties().stacksTo(1).tab(SWLM.SWLMTAB)));
    

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, SWLMBlocks::itemDefault);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        ITEMS.register(name, itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> itemDefault(final RegistryObject<? extends Block> block) {
        return item(block, SWLM.SWLMTAB);
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final CreativeModeTab itemGroup) {
        return () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup));
    }

}


