package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.block.HangingStarWormsBlock;
import com.alaharranhonor.swlm.config.BlockConfigList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;


public class BlockSetup {

    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ModRef.ID);

    public static void init() {
        REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //HAHA WORM ROCKS
    public static final RegistryObject<Block> STAR_WORM_COBBLE = register("star_worm_cobble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).lightLevel((state) -> 7)));
    public static final RegistryObject<Block> HANGING_STAR_WORMS = registerNoItem("hanging_star_worms", () -> new HangingStarWormsBlock(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS).lightLevel((state) -> 7)));

    //1.18 UPDATE BLOCKS
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerAddonBlock("minecraft", "amethyst_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> AZALEA_LEAVES = registerAddonBlock("minecraft", "azalea_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CALCITE = registerAddonBlock("minecraft", "calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE = registerAddonBlock("minecraft", "chiseled_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE = registerAddonBlock("minecraft", "cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS = registerAddonBlock("minecraft", "cracked_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES = registerAddonBlock("minecraft", "cracked_deepslate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COPPER_BLOCK = registerAddonBlock("minecraft", "copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CUT_COPPER = registerAddonBlock("minecraft", "cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEEPSLATE = registerAddonBlock("minecraft", "deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEEPSLATE_TILES = registerAddonBlock("minecraft", "deepslate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK = registerAddonBlock("minecraft", "dripstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EXPOSED_COPPER = registerAddonBlock("minecraft", "exposed_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER = registerAddonBlock("minecraft", "exposed_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES = registerAddonBlock("minecraft", "flowering_azalea_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MOSS_BLOCK = registerAddonBlock("minecraft", "moss_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OXIDIZED_COPPER = registerAddonBlock("minecraft", "oxidized_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER = registerAddonBlock("minecraft", "oxidized_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE = registerAddonBlock("minecraft", "polished_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK = registerAddonBlock("minecraft", "raw_copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK = registerAddonBlock("minecraft", "raw_gold_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RAW_IRON_BLOCK = registerAddonBlock("minecraft", "raw_iron_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ROOTED_DIRT = registerAddonBlock("minecraft", "rooted_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_BASALT = registerAddonBlock("minecraft", "smooth_basalt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> TINTED_GLASS = registerAddonBlock("minecraft", "tinted_glass", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> TUFF = registerAddonBlock("minecraft", "tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WEATHERED_COPPER = registerAddonBlock("minecraft", "weathered_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER = registerAddonBlock("minecraft", "weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_COPPER_BLOCK = registerAddonBlock("minecraft", "waxed_copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_CUT_COPPER = registerAddonBlock("minecraft", "waxed_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER = registerAddonBlock("minecraft", "waxed_oxidized_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_CUT_COPPER = registerAddonBlock("minecraft", "waxed_oxidized_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER = registerAddonBlock("minecraft", "waxed_exposed_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_EXPOSED_CUT_COPPER = registerAddonBlock("minecraft", "waxed_exposed_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER = registerAddonBlock("minecraft", "waxed_weathered_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WAXED_WEATHERED_CUT_COPPER = registerAddonBlock("minecraft", "waxed_weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DEEPSLATE_BRICKS = registerAddonBlock("minecraft", "deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).lightLevel((state) -> 15)));


    //1.16 UPDATE BLOCKS
    public static final RegistryObject<Block> BEDROCK = registerAddonBlock("minecraft", "bedrock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_NYLIUM = registerAddonBlock("minecraft", "crimson_nylium", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRYING_OBSIDIAN = registerAddonBlock("minecraft", "crying_obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS = registerAddonBlock("minecraft", "polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_NYLIUM = registerAddonBlock("minecraft", "warped_nylium", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).lightLevel((state) -> 15)));

    //WOOD, BAYBEEE!
    public static final RegistryObject<Block> ACACIA_LOG = registerAddonBlock("minecraft", "acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_LOG = registerAddonBlock("minecraft", "birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_LOG = registerAddonBlock("minecraft", "dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_LOG = registerAddonBlock("minecraft", "jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_LOG = registerAddonBlock("minecraft", "oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_LOG = registerAddonBlock("minecraft", "spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_WOOD = registerAddonBlock("minecraft", "acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_WOOD = registerAddonBlock("minecraft", "birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_WOOD = registerAddonBlock("minecraft", "dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_WOOD = registerAddonBlock("minecraft", "jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_WOOD = registerAddonBlock("minecraft", "oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_WOOD = registerAddonBlock("minecraft", "spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_PLANKS = registerAddonBlock("minecraft", "acacia_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_PLANKS = registerAddonBlock("minecraft", "birch_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_PLANKS = registerAddonBlock("minecraft", "dark_oak_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_PLANKS = registerAddonBlock("minecraft", "jungle_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_PLANKS = registerAddonBlock("minecraft", "oak_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_PLANKS = registerAddonBlock("minecraft", "spruce_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).lightLevel((state) -> 15)));

    //ROCKS!
    public static final RegistryObject<Block> STONE = registerAddonBlock("minecraft", "stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_STONE = registerAddonBlock("minecraft", "smooth_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLESTONE = registerAddonBlock("minecraft", "cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE = registerAddonBlock("minecraft", "mossy_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ANDESITE = registerAddonBlock("minecraft", "andesite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_ANDESITE = registerAddonBlock("minecraft", "polished_andesite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIORITE = registerAddonBlock("minecraft", "diorite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_DIORITE = registerAddonBlock("minecraft", "polished_diorite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRANITE = registerAddonBlock("minecraft", "granite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_GRANITE = registerAddonBlock("minecraft", "polished_granite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STONE_BRICKS = registerAddonBlock("minecraft", "stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICKS = registerAddonBlock("minecraft", "cracked_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS = registerAddonBlock("minecraft", "mossy_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS = registerAddonBlock("minecraft", "chiseled_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).lightLevel((state) -> 15)));

    //CONDENSED ORE BLOCKS
    public static final RegistryObject<Block> COAL_BLOCK = registerAddonBlock("minecraft", "coal_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> IRON_BLOCK = registerAddonBlock("minecraft", "iron_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GOLD_BLOCK = registerAddonBlock("minecraft", "gold_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIAMOND_BLOCK = registerAddonBlock("minecraft", "diamond_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> EMERALD_BLOCK = registerAddonBlock("minecraft", "emerald_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> REDSTONE_BLOCK = registerAddonBlock("minecraft", "redstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LAPIS_BLOCK = registerAddonBlock("minecraft", "lapis_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHERITE_BLOCK = registerAddonBlock("minecraft", "netherite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).lightLevel((state) -> 15)));

    //DESERT SPECIFIC (+ GRAVEL I GUESS?)
    public static final RegistryObject<Block> BONE_BLOCK = registerAddonBlock("minecraft", "bone_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAVEL = registerAddonBlock("minecraft", "gravel", () -> new GravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CLAY = registerAddonBlock("minecraft", "clay", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BRICKS = registerAddonBlock("minecraft", "bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SAND = registerAddonBlock("minecraft", "sand", () -> new SandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SANDSTONE = registerAddonBlock("minecraft", "sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CUT_SANDSTONE = registerAddonBlock("minecraft", "cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE = registerAddonBlock("minecraft", "smooth_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_SANDSTONE = registerAddonBlock("minecraft", "chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_SAND = registerAddonBlock("minecraft", "red_sand", () -> new SandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_SANDSTONE = registerAddonBlock("minecraft", "red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE = registerAddonBlock("minecraft", "cut_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE = registerAddonBlock("minecraft", "smooth_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE = registerAddonBlock("minecraft", "chiseled_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).lightLevel((state) -> 15)));

    //OCEAN
    public static final RegistryObject<Block> PRISMARINE = registerAddonBlock("minecraft", "prismarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PRISMARINE_BRICKS = registerAddonBlock("minecraft", "prismarine_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_PRISMARINE = registerAddonBlock("minecraft", "dark_prismarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DRIED_KELP = registerAddonBlock("minecraft", "dried_kelp_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIED_KELP_BLOCK).lightLevel((state) -> 15)));

    //NETHER DIMENSION
    public static final RegistryObject<Block> OBSIDIAN = registerAddonBlock("minecraft", "obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHERRACK = registerAddonBlock("minecraft", "netherrack", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS = registerAddonBlock("minecraft", "chiseled_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS = registerAddonBlock("minecraft", "cracked_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHER_BRICKS = registerAddonBlock("minecraft", "nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_NETHER_BRICKS = registerAddonBlock("minecraft", "red_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACKSTONE = registerAddonBlock("minecraft", "blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE = registerAddonBlock("minecraft", "polished_blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS = registerAddonBlock("minecraft", "cracked_polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE = registerAddonBlock("minecraft", "chiseled_polished_blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE = registerAddonBlock("minecraft", "gilded_blackstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> NETHER_WART = registerAddonBlock("minecraft", "nether_wart_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_STEM = registerAddonBlock("minecraft", "crimson_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM = registerAddonBlock("minecraft", "stripped_crimson_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_HYPHAE = registerAddonBlock("minecraft", "crimson_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE = registerAddonBlock("minecraft", "stripped_crimson_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_PLANKS = registerAddonBlock("minecraft", "crimson_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_WART_BLOCK = registerAddonBlock("minecraft", "warped_wart_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_STEM = registerAddonBlock("minecraft", "warped_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_WARPED_STEM = registerAddonBlock("minecraft", "stripped_warped_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_STEM).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_HYPHAE = registerAddonBlock("minecraft", "warped_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE = registerAddonBlock("minecraft", "stripped_warped_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_PLANKS = registerAddonBlock("minecraft", "warped_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SOUL_SAND = registerAddonBlock("minecraft", "soul_sand", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SOUL_SOIL = registerAddonBlock("minecraft", "soul_soil", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> QUARTZ_BLOCK = registerAddonBlock("minecraft", "quartz_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> QUARTZ_PILLAR = registerAddonBlock("minecraft", "quartz_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHISELED_QUARTZ = registerAddonBlock("minecraft", "chiseled_quartz_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SMOOTH_QUARTZ = registerAddonBlock("minecraft", "smooth_quartz", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> QUARTZ_BRICKS = registerAddonBlock("minecraft", "quartz_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BASALT = registerAddonBlock("minecraft", "basalt", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> POLISHED_BASALT = registerAddonBlock("minecraft", "polished_basalt", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT).lightLevel((state) -> 15)));

    //END DIMENSION
    public static final RegistryObject<Block> END_STONE = registerAddonBlock("minecraft", "end_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> END_STONE_BRICKS = registerAddonBlock("minecraft", "end_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPUR = registerAddonBlock("minecraft", "purpur_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPUR_PILLAR = registerAddonBlock("minecraft", "purpur_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).lightLevel((state) -> 15)));

    //NATURAL... EDIBLES?? (MISC)
    public static final RegistryObject<Block> BROWN_MUSHROOM = registerAddonBlock("minecraft", "brown_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_MUSHROOM = registerAddonBlock("minecraft", "red_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SNOW_BLOCK = registerAddonBlock("minecraft", "snow_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).lightLevel((state) -> 11)));
    public static final RegistryObject<Block> ICE = registerAddonBlock("minecraft", "ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PACKED_ICE = registerAddonBlock("minecraft", "packed_ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_ICE = registerAddonBlock("minecraft", "blue_ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HONEYCOMB = registerAddonBlock("minecraft", "honeycomb_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK).lightLevel((state) -> 15)));

    //DYEABLE BLOCKS
    //TERRACOTTA
    public static final RegistryObject<Block> TERRACOTTA = registerAddonBlock("minecraft", "terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA = registerAddonBlock("minecraft", "black_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA = registerAddonBlock("minecraft", "blue_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA = registerAddonBlock("minecraft", "brown_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA = registerAddonBlock("minecraft", "cyan_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA = registerAddonBlock("minecraft", "gray_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA = registerAddonBlock("minecraft", "green_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA = registerAddonBlock("minecraft", "light_blue_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA = registerAddonBlock("minecraft", "light_gray_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_TERRACOTTA = registerAddonBlock("minecraft", "lime_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA = registerAddonBlock("minecraft", "magenta_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA = registerAddonBlock("minecraft", "orange_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_TERRACOTTA = registerAddonBlock("minecraft", "pink_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA = registerAddonBlock("minecraft", "purple_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_TERRACOTTA = registerAddonBlock("minecraft", "red_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA = registerAddonBlock("minecraft", "white_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA = registerAddonBlock("minecraft", "yellow_terracotta", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "black_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "blue_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "brown_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "cyan_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "gray_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "green_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "light_blue_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "light_gray_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "lime_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "magenta_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "orange_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "pink_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "purple_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "red_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "white_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "yellow_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));

    //CONCRETE
    public static final RegistryObject<Block> BLACK_CONCRETE_POWDER = registerAddonBlock("minecraft", "black_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_CONCRETE_POWDER = registerAddonBlock("minecraft", "blue_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_CONCRETE_POWDER = registerAddonBlock("minecraft", "brown_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_CONCRETE_POWDER = registerAddonBlock("minecraft", "cyan_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_CONCRETE_POWDER = registerAddonBlock("minecraft", "gray_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_CONCRETE_POWDER = registerAddonBlock("minecraft", "green_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_POWDER = registerAddonBlock("minecraft", "light_blue_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_POWDER = registerAddonBlock("minecraft", "light_gray_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_CONCRETE_POWDER = registerAddonBlock("minecraft", "lime_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_POWDER = registerAddonBlock("minecraft", "magenta_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_POWDER = registerAddonBlock("minecraft", "orange_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_CONCRETE_POWDER = registerAddonBlock("minecraft", "pink_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_POWDER = registerAddonBlock("minecraft", "purple_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_CONCRETE_POWDER = registerAddonBlock("minecraft", "red_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_CONCRETE_POWDER = registerAddonBlock("minecraft", "white_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_POWDER = registerAddonBlock("minecraft", "yellow_concrete_powder", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_CONCRETE = registerAddonBlock("minecraft", "black_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_CONCRETE = registerAddonBlock("minecraft", "blue_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_CONCRETE = registerAddonBlock("minecraft", "brown_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_CONCRETE = registerAddonBlock("minecraft", "cyan_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_CONCRETE = registerAddonBlock("minecraft", "gray_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_CONCRETE = registerAddonBlock("minecraft", "green_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_CONCRETE = registerAddonBlock("minecraft", "lime_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE = registerAddonBlock("minecraft", "light_blue_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE = registerAddonBlock("minecraft", "light_gray_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE = registerAddonBlock("minecraft", "magenta_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_CONCRETE = registerAddonBlock("minecraft", "orange_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_CONCRETE = registerAddonBlock("minecraft", "pink_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_CONCRETE= registerAddonBlock("minecraft", "purple_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_CONCRETE = registerAddonBlock("minecraft", "red_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_CONCRETE = registerAddonBlock("minecraft", "white_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_CONCRETE = registerAddonBlock("minecraft", "yellow_concrete", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_WOOL = registerAddonBlock("minecraft", "black_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_WOOL = registerAddonBlock("minecraft", "blue_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_WOOL = registerAddonBlock("minecraft", "brown_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_WOOL = registerAddonBlock("minecraft", "cyan_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_WOOL = registerAddonBlock("minecraft", "gray_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_WOOL = registerAddonBlock("minecraft", "green_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL = registerAddonBlock("minecraft", "light_blue_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL = registerAddonBlock("minecraft", "light_gray_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_WOOL = registerAddonBlock("minecraft", "lime_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_WOOL = registerAddonBlock("minecraft", "magenta_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_WOOL = registerAddonBlock("minecraft", "orange_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_WOOL = registerAddonBlock("minecraft", "pink_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_WOOL = registerAddonBlock("minecraft", "purple_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_WOOL = registerAddonBlock("minecraft", "red_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_WOOL = registerAddonBlock("minecraft", "white_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_WOOL = registerAddonBlock("minecraft", "yellow_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).lightLevel((state) -> 15)));

    //LEAVES
    public static final RegistryObject<Block> ACACIA_LEAVES = registerAddonBlock("minecraft", "acacia_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_LEAVES = registerAddonBlock("minecraft", "birch_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_LEAVES = registerAddonBlock("minecraft", "dark_oak_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_LEAVES = registerAddonBlock("minecraft", "jungle_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> OAK_LEAVES = registerAddonBlock("minecraft", "oak_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_LEAVES = registerAddonBlock("minecraft", "spruce_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES).lightLevel((state) -> 15)));

    //DIRT
    public static final RegistryObject<Block> GRASS_BLOCK = registerAddonBlock("minecraft", "grass_block", () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COARSE_DIRT = registerAddonBlock("minecraft", "coarse_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DIRT = registerAddonBlock("minecraft", "dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PODZOL = registerAddonBlock("minecraft", "podzol", () -> new SnowyDirtBlock(BlockBehaviour.Properties.copy(Blocks.PODZOL).lightLevel((state) -> 15)));

    //GLASS
    public static final RegistryObject<Block> GLASS = registerAddonBlock("minecraft", "glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLACK_STAINED_GLASS = registerAddonBlock("minecraft", "black_stained_glass", () -> new StainedGlassBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BLUE_STAINED_GLASS = registerAddonBlock("minecraft", "blue_stained_glass", () -> new StainedGlassBlock(DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BROWN_STAINED_GLASS = registerAddonBlock("minecraft", "brown_stained_glass", () -> new StainedGlassBlock(DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CYAN_STAINED_GLASS = registerAddonBlock("minecraft", "cyan_stained_glass", () -> new StainedGlassBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GRAY_STAINED_GLASS = registerAddonBlock("minecraft", "gray_stained_glass", () -> new StainedGlassBlock(DyeColor.GRAY, BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> GREEN_STAINED_GLASS = registerAddonBlock("minecraft", "green_stained_glass", () -> new StainedGlassBlock(DyeColor.GREEN, BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS = registerAddonBlock("minecraft", "light_blue_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS = registerAddonBlock("minecraft", "light_gray_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIME_STAINED_GLASS = registerAddonBlock("minecraft", "lime_stained_glass", () -> new StainedGlassBlock(DyeColor.LIME, BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS = registerAddonBlock("minecraft", "magenta_stained_glass", () -> new StainedGlassBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS = registerAddonBlock("minecraft", "orange_stained_glass", () -> new StainedGlassBlock(DyeColor.ORANGE, BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PINK_STAINED_GLASS = registerAddonBlock("minecraft", "pink_stained_glass", () -> new StainedGlassBlock(DyeColor.PINK, BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS = registerAddonBlock("minecraft", "purple_stained_glass", () -> new StainedGlassBlock(DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> RED_STAINED_GLASS = registerAddonBlock("minecraft", "red_stained_glass", () -> new StainedGlassBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WHITE_STAINED_GLASS = registerAddonBlock("minecraft", "white_stained_glass", () -> new StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS = registerAddonBlock("minecraft", "yellow_stained_glass", () -> new StainedGlassBlock(DyeColor.YELLOW, BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS).lightLevel((state) -> 15)));

    public static final RegistryObject<Block> DEAD_TUBE_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_tube_coral_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_brain_coral_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_bubble_coral_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> DEAD_FIRE_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_fire_coral_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> DEAD_HORN_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_horn_coral_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final RegistryObject<Block> TUBE_CORAL_BLOCK = registerAddonBlock("minecraft", "tube_coral_block", () -> new CoralBlock(DEAD_TUBE_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final RegistryObject<Block> BRAIN_CORAL_BLOCK = registerAddonBlock("minecraft", "brain_coral_block", () -> new CoralBlock(DEAD_BRAIN_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final RegistryObject<Block> BUBBLE_CORAL_BLOCK = registerAddonBlock("minecraft", "bubble_coral_block", () -> new CoralBlock(DEAD_BUBBLE_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final RegistryObject<Block> FIRE_CORAL_BLOCK = registerAddonBlock("minecraft", "fire_coral_block", () -> new CoralBlock(DEAD_FIRE_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final RegistryObject<Block> HORN_CORAL_BLOCK = registerAddonBlock("minecraft", "horn_coral_block", () -> new CoralBlock(DEAD_HORN_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    //** ITEMS START HERE**//

    public static <T extends Block> RegistryObject<T> registerAddonBlock(String addon, String name, Supplier<? extends T> sup) {
        RegistryObject<T> block = register(name, sup);
        BlockConfigList.BLOCK_EQUIVALENCE.put(new ResourceLocation(addon, name), block.getId());
        return block;
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, BlockSetup::itemDefault);
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        ItemSetup.REGISTRY.register(name, itemCreator.apply(ret));
        return ret;
    }

    public static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return REGISTRY.register(name, sup);
    }

    public static Supplier<BlockItem> itemDefault(final RegistryObject<? extends Block> block) {
        return () -> new BlockItem(block.get(), new Item.Properties());
    }

}


