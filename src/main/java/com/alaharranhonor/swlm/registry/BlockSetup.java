package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.block.HangingStarWormsBlock;
import com.alaharranhonor.swlm.block.LightFallingBlock;
import com.alaharranhonor.swlm.config.BlockConfigList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;


public class BlockSetup {

    public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ModRef.ID);

    public static void init(IEventBus modBus) {
        REGISTRY.register(modBus);
    }

    //HAHA WORM ROCKS
    public static final DeferredBlock<Block> STAR_WORM_COBBLE = register("star_worm_cobble", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel((state) -> 7)));
    public static final DeferredBlock<Block> HANGING_STAR_WORMS = registerNoItem("hanging_star_worms", () -> new HangingStarWormsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).lightLevel((state) -> 7)));

    //1.18 UPDATE BLOCKS
    public static final DeferredBlock<Block> AMETHYST_BLOCK = registerAddonBlock("minecraft", "amethyst_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> AZALEA_LEAVES = registerAddonBlock("minecraft", "azalea_leaves", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AZALEA_LEAVES).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CALCITE = registerAddonBlock("minecraft", "calcite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CHISELED_DEEPSLATE = registerAddonBlock("minecraft", "chiseled_deepslate", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> COBBLED_DEEPSLATE = registerAddonBlock("minecraft", "cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_BRICKS = registerAddonBlock("minecraft", "cracked_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_TILES = registerAddonBlock("minecraft", "cracked_deepslate_tiles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> COPPER_BLOCK = registerAddonBlock("minecraft", "copper_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CUT_COPPER = registerAddonBlock("minecraft", "cut_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DEEPSLATE = registerAddonBlock("minecraft", "deepslate", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DEEPSLATE_TILES = registerAddonBlock("minecraft", "deepslate_tiles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DRIPSTONE_BLOCK = registerAddonBlock("minecraft", "dripstone_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> EXPOSED_COPPER = registerAddonBlock("minecraft", "exposed_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> EXPOSED_CUT_COPPER = registerAddonBlock("minecraft", "exposed_cut_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> FLOWERING_AZALEA_LEAVES = registerAddonBlock("minecraft", "flowering_azalea_leaves", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWERING_AZALEA_LEAVES).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> MOSS_BLOCK = registerAddonBlock("minecraft", "moss_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> OXIDIZED_COPPER = registerAddonBlock("minecraft", "oxidized_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> OXIDIZED_CUT_COPPER = registerAddonBlock("minecraft", "oxidized_cut_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> POLISHED_DEEPSLATE = registerAddonBlock("minecraft", "polished_deepslate", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RAW_COPPER_BLOCK = registerAddonBlock("minecraft", "raw_copper_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RAW_GOLD_BLOCK = registerAddonBlock("minecraft", "raw_gold_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_GOLD_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RAW_IRON_BLOCK = registerAddonBlock("minecraft", "raw_iron_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ROOTED_DIRT = registerAddonBlock("minecraft", "rooted_dirt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ROOTED_DIRT).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SMOOTH_BASALT = registerAddonBlock("minecraft", "smooth_basalt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> TINTED_GLASS = registerAddonBlock("minecraft", "tinted_glass", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TINTED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> TUFF = registerAddonBlock("minecraft", "tuff", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WEATHERED_COPPER = registerAddonBlock("minecraft", "weathered_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WEATHERED_CUT_COPPER = registerAddonBlock("minecraft", "weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_COPPER_BLOCK = registerAddonBlock("minecraft", "waxed_copper_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_COPPER_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_CUT_COPPER = registerAddonBlock("minecraft", "waxed_cut_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER = registerAddonBlock("minecraft", "waxed_oxidized_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_CUT_COPPER = registerAddonBlock("minecraft", "waxed_oxidized_cut_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER = registerAddonBlock("minecraft", "waxed_exposed_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_CUT_COPPER = registerAddonBlock("minecraft", "waxed_exposed_cut_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER = registerAddonBlock("minecraft", "waxed_weathered_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_CUT_COPPER = registerAddonBlock("minecraft", "waxed_weathered_cut_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_CUT_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DEEPSLATE_BRICKS = registerAddonBlock("minecraft", "deepslate_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).lightLevel((state) -> 15)));


    //1.16 UPDATE BLOCKS
    public static final DeferredBlock<Block> BEDROCK = registerAddonBlock("minecraft", "bedrock", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRIMSON_NYLIUM = registerAddonBlock("minecraft", "crimson_nylium", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_NYLIUM).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRYING_OBSIDIAN = registerAddonBlock("minecraft", "crying_obsidian", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICKS = registerAddonBlock("minecraft", "polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WARPED_NYLIUM = registerAddonBlock("minecraft", "warped_nylium", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_NYLIUM).lightLevel((state) -> 15)));

    //WOOD, BAYBEEE!
    public static final DeferredBlock<Block> ACACIA_LOG = registerAddonBlock("minecraft", "acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BIRCH_LOG = registerAddonBlock("minecraft", "birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DARK_OAK_LOG = registerAddonBlock("minecraft", "dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> JUNGLE_LOG = registerAddonBlock("minecraft", "jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> OAK_LOG = registerAddonBlock("minecraft", "oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SPRUCE_LOG = registerAddonBlock("minecraft", "spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ACACIA_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_ACACIA_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BIRCH_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_BIRCH_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DARK_OAK_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_DARK_OAK_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> JUNGLE_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_JUNGLE_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> OAK_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SPRUCE_STRIPPED_LOG = registerAddonBlock("minecraft", "stripped_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ACACIA_WOOD = registerAddonBlock("minecraft", "acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BIRCH_WOOD = registerAddonBlock("minecraft", "birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DARK_OAK_WOOD = registerAddonBlock("minecraft", "dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> JUNGLE_WOOD = registerAddonBlock("minecraft", "jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> OAK_WOOD = registerAddonBlock("minecraft", "oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SPRUCE_WOOD = registerAddonBlock("minecraft", "spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ACACIA_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_ACACIA_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BIRCH_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_BIRCH_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DARK_OAK_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_DARK_OAK_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> JUNGLE_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_JUNGLE_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> OAK_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SPRUCE_STRIPPED_WOOD = registerAddonBlock("minecraft", "stripped_spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ACACIA_PLANKS = registerAddonBlock("minecraft", "acacia_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BIRCH_PLANKS = registerAddonBlock("minecraft", "birch_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS = registerAddonBlock("minecraft", "dark_oak_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS = registerAddonBlock("minecraft", "jungle_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> OAK_PLANKS = registerAddonBlock("minecraft", "oak_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS = registerAddonBlock("minecraft", "spruce_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).lightLevel((state) -> 15)));

    //ROCKS!
    public static final DeferredBlock<Block> STONE = registerAddonBlock("minecraft", "stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SMOOTH_STONE = registerAddonBlock("minecraft", "smooth_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> COBBLESTONE = registerAddonBlock("minecraft", "cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> MOSSY_COBBLESTONE = registerAddonBlock("minecraft", "mossy_cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ANDESITE = registerAddonBlock("minecraft", "andesite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> POLISHED_ANDESITE = registerAddonBlock("minecraft", "polished_andesite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DIORITE = registerAddonBlock("minecraft", "diorite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> POLISHED_DIORITE = registerAddonBlock("minecraft", "polished_diorite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GRANITE = registerAddonBlock("minecraft", "granite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> POLISHED_GRANITE = registerAddonBlock("minecraft", "polished_granite", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> STONE_BRICKS = registerAddonBlock("minecraft", "stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRACKED_STONE_BRICKS = registerAddonBlock("minecraft", "cracked_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> MOSSY_STONE_BRICKS = registerAddonBlock("minecraft", "mossy_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CHISELED_STONE_BRICKS = registerAddonBlock("minecraft", "chiseled_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_STONE_BRICKS).lightLevel((state) -> 15)));

    //CONDENSED ORE BLOCKS
    public static final DeferredBlock<Block> COAL_BLOCK = registerAddonBlock("minecraft", "coal_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> IRON_BLOCK = registerAddonBlock("minecraft", "iron_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GOLD_BLOCK = registerAddonBlock("minecraft", "gold_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DIAMOND_BLOCK = registerAddonBlock("minecraft", "diamond_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> EMERALD_BLOCK = registerAddonBlock("minecraft", "emerald_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> REDSTONE_BLOCK = registerAddonBlock("minecraft", "redstone_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LAPIS_BLOCK = registerAddonBlock("minecraft", "lapis_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> NETHERITE_BLOCK = registerAddonBlock("minecraft", "netherite_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).lightLevel((state) -> 15)));

    //DESERT SPECIFIC (+ GRAVEL I GUESS?)
    public static final DeferredBlock<Block> BONE_BLOCK = registerAddonBlock("minecraft", "bone_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GRAVEL = registerAddonBlock("minecraft", "gravel", () -> new ColoredFallingBlock(new ColorRGBA(-8356741), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CLAY = registerAddonBlock("minecraft", "clay", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BRICKS = registerAddonBlock("minecraft", "bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SAND = registerAddonBlock("minecraft", "sand", () -> new ColoredFallingBlock(new ColorRGBA(14406560), BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SANDSTONE = registerAddonBlock("minecraft", "sandstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CUT_SANDSTONE = registerAddonBlock("minecraft", "cut_sandstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SMOOTH_SANDSTONE = registerAddonBlock("minecraft", "smooth_sandstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CHISELED_SANDSTONE = registerAddonBlock("minecraft", "chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_SANDSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_SAND = registerAddonBlock("minecraft", "red_sand", () -> new ColoredFallingBlock(new ColorRGBA(11098145), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SAND).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_SANDSTONE = registerAddonBlock("minecraft", "red_sandstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CUT_RED_SANDSTONE = registerAddonBlock("minecraft", "cut_red_sandstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SMOOTH_RED_SANDSTONE = registerAddonBlock("minecraft", "smooth_red_sandstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CHISELED_RED_SANDSTONE = registerAddonBlock("minecraft", "chiseled_red_sandstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_RED_SANDSTONE).lightLevel((state) -> 15)));

    //OCEAN
    public static final DeferredBlock<Block> PRISMARINE = registerAddonBlock("minecraft", "prismarine", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PRISMARINE_BRICKS = registerAddonBlock("minecraft", "prismarine_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DARK_PRISMARINE = registerAddonBlock("minecraft", "dark_prismarine", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DRIED_KELP = registerAddonBlock("minecraft", "dried_kelp_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIED_KELP_BLOCK).lightLevel((state) -> 15)));

    //NETHER DIMENSION
    public static final DeferredBlock<Block> OBSIDIAN = registerAddonBlock("minecraft", "obsidian", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> NETHERRACK = registerAddonBlock("minecraft", "netherrack", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CHISELED_NETHER_BRICKS = registerAddonBlock("minecraft", "chiseled_nether_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRACKED_NETHER_BRICKS = registerAddonBlock("minecraft", "cracked_nether_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> NETHER_BRICKS = registerAddonBlock("minecraft", "nether_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_NETHER_BRICKS = registerAddonBlock("minecraft", "red_nether_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLACKSTONE = registerAddonBlock("minecraft", "blackstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE = registerAddonBlock("minecraft", "polished_blackstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS = registerAddonBlock("minecraft", "cracked_polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CHISELED_POLISHED_BLACKSTONE = registerAddonBlock("minecraft", "chiseled_polished_blackstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_POLISHED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE = registerAddonBlock("minecraft", "gilded_blackstone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> NETHER_WART = registerAddonBlock("minecraft", "nether_wart_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_WART_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRIMSON_STEM = registerAddonBlock("minecraft", "crimson_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_STEM).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_STEM = registerAddonBlock("minecraft", "stripped_crimson_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CRIMSON_STEM).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRIMSON_HYPHAE = registerAddonBlock("minecraft", "crimson_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_HYPHAE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_HYPHAE = registerAddonBlock("minecraft", "stripped_crimson_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CRIMSON_HYPHAE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS = registerAddonBlock("minecraft", "crimson_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WARPED_WART_BLOCK = registerAddonBlock("minecraft", "warped_wart_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WART_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WARPED_STEM = registerAddonBlock("minecraft", "warped_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_STEM).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> STRIPPED_WARPED_STEM = registerAddonBlock("minecraft", "stripped_warped_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_WARPED_STEM).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WARPED_HYPHAE = registerAddonBlock("minecraft", "warped_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> STRIPPED_WARPED_HYPHAE = registerAddonBlock("minecraft", "stripped_warped_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_WARPED_HYPHAE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WARPED_PLANKS = registerAddonBlock("minecraft", "warped_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SOUL_SAND = registerAddonBlock("minecraft", "soul_sand", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SAND).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SOUL_SOIL = registerAddonBlock("minecraft", "soul_soil", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SOIL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> QUARTZ_BLOCK = registerAddonBlock("minecraft", "quartz_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> QUARTZ_PILLAR = registerAddonBlock("minecraft", "quartz_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CHISELED_QUARTZ = registerAddonBlock("minecraft", "chiseled_quartz_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_QUARTZ_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SMOOTH_QUARTZ = registerAddonBlock("minecraft", "smooth_quartz", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> QUARTZ_BRICKS = registerAddonBlock("minecraft", "quartz_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BASALT = registerAddonBlock("minecraft", "basalt", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> POLISHED_BASALT = registerAddonBlock("minecraft", "polished_basalt", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BASALT).lightLevel((state) -> 15)));

    //END DIMENSION
    public static final DeferredBlock<Block> END_STONE = registerAddonBlock("minecraft", "end_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> END_STONE_BRICKS = registerAddonBlock("minecraft", "end_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PURPUR = registerAddonBlock("minecraft", "purpur_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PURPUR_PILLAR = registerAddonBlock("minecraft", "purpur_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR).lightLevel((state) -> 15)));

    //NATURAL... EDIBLES?? (MISC)
    public static final DeferredBlock<Block> BROWN_MUSHROOM = registerAddonBlock("minecraft", "brown_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_MUSHROOM = registerAddonBlock("minecraft", "red_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_MUSHROOM_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SNOW_BLOCK = registerAddonBlock("minecraft", "snow_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).lightLevel((state) -> 11)));
    public static final DeferredBlock<Block> ICE = registerAddonBlock("minecraft", "ice", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ICE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PACKED_ICE = registerAddonBlock("minecraft", "packed_ice", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLUE_ICE = registerAddonBlock("minecraft", "blue_ice", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> HONEYCOMB = registerAddonBlock("minecraft", "honeycomb_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.HONEYCOMB_BLOCK).lightLevel((state) -> 15)));

    //DYEABLE BLOCKS
    //TERRACOTTA
    public static final DeferredBlock<Block> TERRACOTTA = registerAddonBlock("minecraft", "terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLACK_TERRACOTTA = registerAddonBlock("minecraft", "black_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLUE_TERRACOTTA = registerAddonBlock("minecraft", "blue_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BROWN_TERRACOTTA = registerAddonBlock("minecraft", "brown_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CYAN_TERRACOTTA = registerAddonBlock("minecraft", "cyan_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GRAY_TERRACOTTA = registerAddonBlock("minecraft", "gray_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GREEN_TERRACOTTA = registerAddonBlock("minecraft", "green_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA = registerAddonBlock("minecraft", "light_blue_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA = registerAddonBlock("minecraft", "light_gray_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIME_TERRACOTTA = registerAddonBlock("minecraft", "lime_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> MAGENTA_TERRACOTTA = registerAddonBlock("minecraft", "magenta_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ORANGE_TERRACOTTA = registerAddonBlock("minecraft", "orange_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PINK_TERRACOTTA = registerAddonBlock("minecraft", "pink_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PURPLE_TERRACOTTA = registerAddonBlock("minecraft", "purple_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_TERRACOTTA = registerAddonBlock("minecraft", "red_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WHITE_TERRACOTTA = registerAddonBlock("minecraft", "white_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> YELLOW_TERRACOTTA = registerAddonBlock("minecraft", "yellow_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLACK_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "black_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLUE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "blue_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BROWN_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "brown_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CYAN_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "cyan_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GRAY_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "gray_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GREEN_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "green_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_BLUE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "light_blue_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_GRAY_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "light_gray_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIME_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "lime_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> MAGENTA_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "magenta_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ORANGE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "orange_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PINK_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "pink_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PURPLE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "purple_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "red_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WHITE_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "white_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> YELLOW_GLAZED_TERRACOTTA = registerAddonBlock("minecraft", "yellow_glazed_terracotta", () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA).lightLevel((state) -> 15)));

    //CONCRETE
    public static final DeferredBlock<Block> BLACK_CONCRETE_POWDER = registerAddonBlock("minecraft", "black_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLUE_CONCRETE_POWDER = registerAddonBlock("minecraft", "blue_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BROWN_CONCRETE_POWDER = registerAddonBlock("minecraft", "brown_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CYAN_CONCRETE_POWDER = registerAddonBlock("minecraft", "cyan_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GRAY_CONCRETE_POWDER = registerAddonBlock("minecraft", "gray_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GREEN_CONCRETE_POWDER = registerAddonBlock("minecraft", "green_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_POWDER = registerAddonBlock("minecraft", "light_blue_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_POWDER = registerAddonBlock("minecraft", "light_gray_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIME_CONCRETE_POWDER = registerAddonBlock("minecraft", "lime_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_POWDER = registerAddonBlock("minecraft", "magenta_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ORANGE_CONCRETE_POWDER = registerAddonBlock("minecraft", "orange_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PINK_CONCRETE_POWDER = registerAddonBlock("minecraft", "pink_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PURPLE_CONCRETE_POWDER = registerAddonBlock("minecraft", "purple_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_CONCRETE_POWDER = registerAddonBlock("minecraft", "red_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_POWDER = registerAddonBlock("minecraft", "white_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> YELLOW_CONCRETE_POWDER = registerAddonBlock("minecraft", "yellow_concrete_powder", () -> new LightFallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE_POWDER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLACK_CONCRETE = registerAddonBlock("minecraft", "black_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLUE_CONCRETE = registerAddonBlock("minecraft", "blue_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BROWN_CONCRETE = registerAddonBlock("minecraft", "brown_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CYAN_CONCRETE = registerAddonBlock("minecraft", "cyan_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GRAY_CONCRETE = registerAddonBlock("minecraft", "gray_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GREEN_CONCRETE = registerAddonBlock("minecraft", "green_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIME_CONCRETE = registerAddonBlock("minecraft", "lime_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE = registerAddonBlock("minecraft", "light_blue_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE = registerAddonBlock("minecraft", "light_gray_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> MAGENTA_CONCRETE = registerAddonBlock("minecraft", "magenta_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ORANGE_CONCRETE = registerAddonBlock("minecraft", "orange_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PINK_CONCRETE = registerAddonBlock("minecraft", "pink_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PURPLE_CONCRETE= registerAddonBlock("minecraft", "purple_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_CONCRETE = registerAddonBlock("minecraft", "red_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WHITE_CONCRETE = registerAddonBlock("minecraft", "white_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> YELLOW_CONCRETE = registerAddonBlock("minecraft", "yellow_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLACK_WOOL = registerAddonBlock("minecraft", "black_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLUE_WOOL = registerAddonBlock("minecraft", "blue_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BROWN_WOOL = registerAddonBlock("minecraft", "brown_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CYAN_WOOL = registerAddonBlock("minecraft", "cyan_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GRAY_WOOL = registerAddonBlock("minecraft", "gray_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GREEN_WOOL = registerAddonBlock("minecraft", "green_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_BLUE_WOOL = registerAddonBlock("minecraft", "light_blue_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_GRAY_WOOL = registerAddonBlock("minecraft", "light_gray_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIME_WOOL = registerAddonBlock("minecraft", "lime_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> MAGENTA_WOOL = registerAddonBlock("minecraft", "magenta_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ORANGE_WOOL = registerAddonBlock("minecraft", "orange_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PINK_WOOL = registerAddonBlock("minecraft", "pink_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PURPLE_WOOL = registerAddonBlock("minecraft", "purple_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_WOOL = registerAddonBlock("minecraft", "red_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WHITE_WOOL = registerAddonBlock("minecraft", "white_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> YELLOW_WOOL = registerAddonBlock("minecraft", "yellow_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL).lightLevel((state) -> 15)));

    //LEAVES
    public static final DeferredBlock<Block> ACACIA_LEAVES = registerAddonBlock("minecraft", "acacia_leaves", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LEAVES).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BIRCH_LEAVES = registerAddonBlock("minecraft", "birch_leaves", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LEAVES).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DARK_OAK_LEAVES = registerAddonBlock("minecraft", "dark_oak_leaves", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_LEAVES).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> JUNGLE_LEAVES = registerAddonBlock("minecraft", "jungle_leaves", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> OAK_LEAVES = registerAddonBlock("minecraft", "oak_leaves", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> SPRUCE_LEAVES = registerAddonBlock("minecraft", "spruce_leaves", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).lightLevel((state) -> 15)));

    //DIRT
    public static final DeferredBlock<Block> GRASS_BLOCK = registerAddonBlock("minecraft", "grass_block", () -> new GrassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> COARSE_DIRT = registerAddonBlock("minecraft", "coarse_dirt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COARSE_DIRT).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> DIRT = registerAddonBlock("minecraft", "dirt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PODZOL = registerAddonBlock("minecraft", "podzol", () -> new SnowyDirtBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PODZOL).lightLevel((state) -> 15)));

    //GLASS
    public static final DeferredBlock<Block> GLASS = registerAddonBlock("minecraft", "glass", () -> new TransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLACK_STAINED_GLASS = registerAddonBlock("minecraft", "black_stained_glass", () -> new StainedGlassBlock(DyeColor.BLACK, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BLUE_STAINED_GLASS = registerAddonBlock("minecraft", "blue_stained_glass", () -> new StainedGlassBlock(DyeColor.BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> BROWN_STAINED_GLASS = registerAddonBlock("minecraft", "brown_stained_glass", () -> new StainedGlassBlock(DyeColor.BROWN, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CYAN_STAINED_GLASS = registerAddonBlock("minecraft", "cyan_stained_glass", () -> new StainedGlassBlock(DyeColor.CYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GRAY_STAINED_GLASS = registerAddonBlock("minecraft", "gray_stained_glass", () -> new StainedGlassBlock(DyeColor.GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> GREEN_STAINED_GLASS = registerAddonBlock("minecraft", "green_stained_glass", () -> new StainedGlassBlock(DyeColor.GREEN, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_BLUE_STAINED_GLASS = registerAddonBlock("minecraft", "light_blue_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIGHT_GRAY_STAINED_GLASS = registerAddonBlock("minecraft", "light_gray_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> LIME_STAINED_GLASS = registerAddonBlock("minecraft", "lime_stained_glass", () -> new StainedGlassBlock(DyeColor.LIME, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> MAGENTA_STAINED_GLASS = registerAddonBlock("minecraft", "magenta_stained_glass", () -> new StainedGlassBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> ORANGE_STAINED_GLASS = registerAddonBlock("minecraft", "orange_stained_glass", () -> new StainedGlassBlock(DyeColor.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PINK_STAINED_GLASS = registerAddonBlock("minecraft", "pink_stained_glass", () -> new StainedGlassBlock(DyeColor.PINK, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> PURPLE_STAINED_GLASS = registerAddonBlock("minecraft", "purple_stained_glass", () -> new StainedGlassBlock(DyeColor.PURPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> RED_STAINED_GLASS = registerAddonBlock("minecraft", "red_stained_glass", () -> new StainedGlassBlock(DyeColor.RED, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WHITE_STAINED_GLASS = registerAddonBlock("minecraft", "white_stained_glass", () -> new StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> YELLOW_STAINED_GLASS = registerAddonBlock("minecraft", "yellow_stained_glass", () -> new StainedGlassBlock(DyeColor.YELLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS).lightLevel((state) -> 15)));

    public static final DeferredBlock<Block> DEAD_TUBE_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_tube_coral_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_TUBE_CORAL_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> DEAD_BRAIN_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_brain_coral_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> DEAD_BUBBLE_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_bubble_coral_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> DEAD_FIRE_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_fire_coral_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> DEAD_HORN_CORAL_BLOCK = registerAddonBlock("minecraft", "dead_horn_coral_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> TUBE_CORAL_BLOCK = registerAddonBlock("minecraft", "tube_coral_block", () -> new CoralBlock(DEAD_TUBE_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> BRAIN_CORAL_BLOCK = registerAddonBlock("minecraft", "brain_coral_block", () -> new CoralBlock(DEAD_BRAIN_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> BUBBLE_CORAL_BLOCK = registerAddonBlock("minecraft", "bubble_coral_block", () -> new CoralBlock(DEAD_BUBBLE_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> FIRE_CORAL_BLOCK = registerAddonBlock("minecraft", "fire_coral_block", () -> new CoralBlock(DEAD_FIRE_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> HORN_CORAL_BLOCK = registerAddonBlock("minecraft", "horn_coral_block", () -> new CoralBlock(DEAD_HORN_CORAL_BLOCK.get(), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CORAL_BLOCK).lightLevel(state -> 15)));

    // 1.21.1
    public static final DeferredBlock<Block> CHISELED_COPPER = registerAddonBlock("minecraft", "chiseled_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_COPPER).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> WEATHERED_CHISELED_COPPER = registerAddonBlock("minecraft", "weathered_chiseled_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_CHISELED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> EXPOSED_CHISELED_COPPER = registerAddonBlock("minecraft", "exposed_chiseled_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_CHISELED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> OXIDIZED_CHISELED_COPPER = registerAddonBlock("minecraft", "oxidized_chiseled_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_CHISELED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_CHISELED_COPPER = registerAddonBlock("minecraft", "waxed_chiseled_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_CHISELED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_CHISELED_COPPER = registerAddonBlock("minecraft", "waxed_oxidized_chiseled_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_CHISELED_COPPER = registerAddonBlock("minecraft", "waxed_exposed_chiseled_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_CHISELED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_CHISELED_COPPER = registerAddonBlock("minecraft", "waxed_weathered_chiseled_copper", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_CHISELED_COPPER).lightLevel((state) -> 15)));
    public static final DeferredBlock<Block> CHISELED_TUFF = registerAddonBlock("minecraft", "chiseled_tuff", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_TUFF).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> CHISELED_TUFF_BRICKS = registerAddonBlock("minecraft", "chiseled_tuff_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_TUFF_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> POLISHED_TUFF = registerAddonBlock("minecraft", "polished_tuff", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_TUFF).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> TUFF_BRICKS = registerAddonBlock("minecraft", "tuff_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).lightLevel(state -> 15)));

    //** ITEMS START HERE**//

    public static <T extends Block> DeferredBlock<T> registerAddonBlock(String addon, String name, Supplier<? extends T> sup) {
        DeferredBlock<T> block = register(name, sup);
        BlockConfigList.BLOCK_EQUIVALENCE.put(ResourceLocation.fromNamespaceAndPath(addon, name), block.getId());
        return block;
    }

    public static <T extends Block> DeferredBlock<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, BlockSetup::itemDefault);
    }

    public static <T extends Block> DeferredBlock<T> register(String name, Supplier<? extends T> sup, Function<DeferredBlock<T>, Supplier<? extends Item>> itemCreator) {
        DeferredBlock<T> ret = registerNoItem(name, sup);
        ItemSetup.REGISTRY.register(name, itemCreator.apply(ret));
        return ret;
    }

    public static <T extends Block> DeferredBlock<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return REGISTRY.register(name, sup);
    }

    public static Supplier<BlockItem> itemDefault(final DeferredBlock<? extends Block> block) {
        return () -> new BlockItem(block.get(), new Item.Properties());
    }

}


