package com.alaharranhonor.swlm.util.init;

import com.alaharranhonor.swlm.SWLM;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWDMInit {

	public static Block MOSSY_STONE;
	public static Block MORE_MOSSY_STONE;
	public static Block CRACKED_STONE;
	public static Block MOSSY_ANDESITE;
	public static Block MORE_MOSSY_ANDESITE;
	public static Block CRACKED_ANDESITE;
	public static Block MOSSY_DIORITE;
	public static Block MORE_MOSSY_DIORITE;
	public static Block CRACKED_DIORITE;
	public static Block MOSSY_GRANITE;
	public static Block MORE_MOSSY_GRANITE;
	public static Block CRACKED_GRANITE;
	public static Block THATCH_BLOCK;
	public static Block BAMBOO_BLOCK;
	public static Block SAND_BLACK;
	public static Block SAND_BLUE_GRAY;
	public static Block SAND_BROWN;
	public static Block SAND_DARK_BROWN;
	public static Block SAND_DUSTED_GRAY;
	public static Block SAND_GOLDEN;
	public static Block SAND_GRAY;
	public static Block SAND_LIGHT_GRAY;
	public static Block SAND_MUTED_BROWN;
	public static Block SAND_VIVID_RED;
	public static Block SAND_WHITE;
	public static Block SANDSTONE_BLACK;
	public static Block SANDSTONE_BLUE_GRAY;
	public static Block SANDSTONE_BROWN;
	public static Block SANDSTONE_DARK_BROWN;
	public static Block SANDSTONE_DUSTED_GRAY;
	public static Block SANDSTONE_GOLDEN;
	public static Block SANDSTONE_GRAY;
	public static Block SANDSTONE_LIGHT_GRAY;
	public static Block SANDSTONE_MUTED_BROWN;
	public static Block SANDSTONE_VIVID_RED;
	public static Block SANDSTONE_WHITE;
	public static Block BLACK_DARK_PRISMARINE;
	public static Block BLUE_DARK_PRISMARINE;
	public static Block BROWN_DARK_PRISMARINE;
	public static Block CYAN_DARK_PRISMARINE;
	public static Block GRAY_DARK_PRISMARINE;
	public static Block GREEN_DARK_PRISMARINE;
	public static Block LIGHT_BLUE_DARK_PRISMARINE;
	public static Block LIGHT_GRAY_DARK_PRISMARINE;
	public static Block LIME_DARK_PRISMARINE;
	public static Block MAGENTA_DARK_PRISMARINE;
	public static Block ORANGE_DARK_PRISMARINE;
	public static Block PINK_DARK_PRISMARINE;
	public static Block PURPLE_DARK_PRISMARINE;
	public static Block RED_DARK_PRISMARINE;
	public static Block WHITE_DARK_PRISMARINE;
	public static Block YELLOW_DARK_PRISMARINE;
	public static Block CYAN_PRISMARINE_GLASS_BRICKS;
	public static Block LIGHT_STONE_BRICKS;
	public static Block MEDIUM_STONE_BRICKS;
	public static Block DARK_STONE_BRICKS;
	public static Block LIGHT_BRICKS;
	public static Block MEDIUM_BRICKS;
	public static Block DARK_BRICKS;
	public static Block LIGHT_CLAY_BLOCK;
	public static Block MEDIUM_CLAY_BLOCK;
	public static Block DARK_CLAY_BLOCK;


	/* Blocks are intialized first.
	* Store the reference to the block, and then in the item initialization register the items and block items.
	 */
	@SubscribeEvent
	public static void intializeModBlocks(RegistryEvent.Register<Block> item) {
		if (ModList.get().isLoaded("swdm")) {

			MOSSY_STONE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_stone");
			item.getRegistry().register(MOSSY_STONE);
			MORE_MOSSY_STONE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_stone");
			item.getRegistry().register(MORE_MOSSY_STONE);
			CRACKED_STONE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cracked_stone");
			item.getRegistry().register(CRACKED_STONE);
			MOSSY_ANDESITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_andesite");
			item.getRegistry().register(MOSSY_ANDESITE);
			MORE_MOSSY_ANDESITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_andesite");
			item.getRegistry().register(MORE_MOSSY_ANDESITE);
			CRACKED_ANDESITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cracked_andesite");
			item.getRegistry().register(CRACKED_ANDESITE);
			MOSSY_DIORITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_diorite");
			item.getRegistry().register(MOSSY_DIORITE);
			MORE_MOSSY_DIORITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_diorite");
			item.getRegistry().register(MORE_MOSSY_DIORITE);
			CRACKED_DIORITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cracked_diorite");
			item.getRegistry().register(CRACKED_DIORITE);
			MOSSY_GRANITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_granite");
			item.getRegistry().register(MOSSY_GRANITE);
			MORE_MOSSY_GRANITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_granite");
			item.getRegistry().register(MORE_MOSSY_GRANITE);
			CRACKED_GRANITE = new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cracked_granite");
			item.getRegistry().register(CRACKED_GRANITE);
			THATCH_BLOCK = new RotatedPillarBlock(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.WET_GRASS).strength(0.5F).harvestTool(ToolType.HOE).lightLevel((state) -> 15)).setRegistryName("thatch_block");
			item.getRegistry().register(THATCH_BLOCK);
			BAMBOO_BLOCK = new RotatedPillarBlock(AbstractBlock.Properties.of(Material.BAMBOO).sound(SoundType.BAMBOO).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("bamboo_block");
			item.getRegistry().register(BAMBOO_BLOCK);
			SAND_BLACK = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_black");
			item.getRegistry().register(SAND_BLACK);
			SAND_BLUE_GRAY = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_blue_gray");
			item.getRegistry().register(SAND_BLUE_GRAY);
			SAND_BROWN = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_brown");
			item.getRegistry().register(SAND_BROWN);
			SAND_DARK_BROWN = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_dark_brown");
			item.getRegistry().register(SAND_DARK_BROWN);
			SAND_DUSTED_GRAY = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_dusted_gray");
			item.getRegistry().register(SAND_DUSTED_GRAY);
			SAND_GOLDEN = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_golden");
			item.getRegistry().register(SAND_GOLDEN);
			SAND_GRAY = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_gray");
			item.getRegistry().register(SAND_GRAY);
			SAND_LIGHT_GRAY = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_light_gray");
			item.getRegistry().register(SAND_LIGHT_GRAY);
			SAND_MUTED_BROWN = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_muted_brown");
			item.getRegistry().register(SAND_MUTED_BROWN);
			SAND_VIVID_RED = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_vivid_red");
			item.getRegistry().register(SAND_VIVID_RED);
			SAND_WHITE = new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_white");
			item.getRegistry().register(SAND_WHITE);
			SANDSTONE_BLACK = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_black");
			item.getRegistry().register(SANDSTONE_BLACK);
			SANDSTONE_BLUE_GRAY = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_blue_gray");
			item.getRegistry().register(SANDSTONE_BLUE_GRAY);
			SANDSTONE_BROWN = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_brown");
			item.getRegistry().register(SANDSTONE_BROWN);
			SANDSTONE_DARK_BROWN = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_dark_brown");
			item.getRegistry().register(SANDSTONE_DARK_BROWN);
			SANDSTONE_DUSTED_GRAY = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_dusted_gray");
			item.getRegistry().register(SANDSTONE_DUSTED_GRAY);
			SANDSTONE_GOLDEN = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_golden");
			item.getRegistry().register(SANDSTONE_GOLDEN);
			SANDSTONE_GRAY = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_gray");
			item.getRegistry().register(SANDSTONE_GRAY);
			SANDSTONE_LIGHT_GRAY = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_light_gray");
			item.getRegistry().register(SANDSTONE_LIGHT_GRAY);
			SANDSTONE_MUTED_BROWN = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_muted_brown");
			item.getRegistry().register(SANDSTONE_MUTED_BROWN);
			SANDSTONE_VIVID_RED = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_vivid_red");
			item.getRegistry().register(SANDSTONE_VIVID_RED);
			SANDSTONE_WHITE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_white");
			item.getRegistry().register(SANDSTONE_WHITE);
			BLACK_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("black_dark_prismarine");
			item.getRegistry().register(BLACK_DARK_PRISMARINE);
			BLUE_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("blue_dark_prismarine");
			item.getRegistry().register(BLUE_DARK_PRISMARINE);
			BROWN_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("brown_dark_prismarine");
			item.getRegistry().register(BROWN_DARK_PRISMARINE);
			CYAN_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cyan_dark_prismarine");
			item.getRegistry().register(CYAN_DARK_PRISMARINE);
			GRAY_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("gray_dark_prismarine");
			item.getRegistry().register(GRAY_DARK_PRISMARINE);
			GREEN_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("green_dark_prismarine");
			item.getRegistry().register(GREEN_DARK_PRISMARINE);
			LIGHT_BLUE_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_blue_dark_prismarine");
			item.getRegistry().register(LIGHT_BLUE_DARK_PRISMARINE);
			LIGHT_GRAY_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_gray_dark_prismarine");
			item.getRegistry().register(LIGHT_GRAY_DARK_PRISMARINE);
			LIME_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("lime_dark_prismarine");
			item.getRegistry().register(LIME_DARK_PRISMARINE);
			MAGENTA_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("magenta_dark_prismarine");
			item.getRegistry().register(MAGENTA_DARK_PRISMARINE);
			ORANGE_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("orange_dark_prismarine");
			item.getRegistry().register(ORANGE_DARK_PRISMARINE);
			PINK_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("pink_dark_prismarine");
			item.getRegistry().register(PINK_DARK_PRISMARINE);
			PURPLE_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("purple_dark_prismarine");
			item.getRegistry().register(PURPLE_DARK_PRISMARINE);
			RED_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("red_dark_prismarine");
			item.getRegistry().register(RED_DARK_PRISMARINE);
			WHITE_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("white_dark_prismarine");
			item.getRegistry().register(WHITE_DARK_PRISMARINE);
			YELLOW_DARK_PRISMARINE = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("yellow_dark_prismarine");
			item.getRegistry().register(YELLOW_DARK_PRISMARINE);
			CYAN_PRISMARINE_GLASS_BRICKS = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cyan_prismarine_glass_bricks");
			item.getRegistry().register(CYAN_PRISMARINE_GLASS_BRICKS);
			LIGHT_STONE_BRICKS = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_stone_bricks");
			item.getRegistry().register(LIGHT_STONE_BRICKS);
			MEDIUM_STONE_BRICKS = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("medium_stone_bricks");
			item.getRegistry().register(MEDIUM_STONE_BRICKS);
			DARK_STONE_BRICKS = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("dark_stone_bricks");
			item.getRegistry().register(DARK_STONE_BRICKS);
			LIGHT_BRICKS = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_bricks");
			item.getRegistry().register(LIGHT_BRICKS);
			MEDIUM_BRICKS = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("medium_bricks");
			item.getRegistry().register(MEDIUM_BRICKS);
			DARK_BRICKS = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("dark_bricks");
			item.getRegistry().register(DARK_BRICKS);
			LIGHT_CLAY_BLOCK = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_clay_block");
			item.getRegistry().register(LIGHT_CLAY_BLOCK);
			MEDIUM_CLAY_BLOCK = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("medium_clay_block");
			item.getRegistry().register(MEDIUM_CLAY_BLOCK);
			DARK_CLAY_BLOCK = new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("dark_clay_block");
			item.getRegistry().register(DARK_CLAY_BLOCK);
		}
	}

	@SubscribeEvent
	public static void intializeModItems(RegistryEvent.Register<Item> item) {
		if (ModList.get().isLoaded("swdm")) {
			// Register stand alone items.
			//item.getRegistry().register(new MedicalItem(new Item.Properties().tab(SWLM.SWLMTAB), 20, 0).setRegistryName("test_item"));

			// Register block items.
			item.getRegistry().register(new BlockItem(MOSSY_STONE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MOSSY_STONE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MORE_MOSSY_STONE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MORE_MOSSY_STONE.getRegistryName()));
			item.getRegistry().register(new BlockItem(CRACKED_STONE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(CRACKED_STONE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MOSSY_ANDESITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MOSSY_ANDESITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MORE_MOSSY_ANDESITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MORE_MOSSY_ANDESITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(CRACKED_ANDESITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(CRACKED_ANDESITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MOSSY_DIORITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MOSSY_DIORITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MORE_MOSSY_DIORITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MORE_MOSSY_DIORITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(CRACKED_DIORITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(CRACKED_DIORITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MOSSY_GRANITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MOSSY_GRANITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MORE_MOSSY_GRANITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MORE_MOSSY_GRANITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(CRACKED_GRANITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(CRACKED_GRANITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(THATCH_BLOCK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(THATCH_BLOCK.getRegistryName()));
			item.getRegistry().register(new BlockItem(BAMBOO_BLOCK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(BAMBOO_BLOCK.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_BLACK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_BLACK.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_BLUE_GRAY, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_BLUE_GRAY.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_BROWN, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_BROWN.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_DARK_BROWN, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_DARK_BROWN.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_DUSTED_GRAY, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_DUSTED_GRAY.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_GOLDEN, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_GOLDEN.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_GRAY, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_GRAY.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_LIGHT_GRAY, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_LIGHT_GRAY.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_MUTED_BROWN, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_MUTED_BROWN.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_VIVID_RED, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_VIVID_RED.getRegistryName()));
			item.getRegistry().register(new BlockItem(SAND_WHITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SAND_WHITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_BLACK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_BLACK.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_BLUE_GRAY, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_BLUE_GRAY.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_BROWN, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_BROWN.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_DARK_BROWN, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_DARK_BROWN.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_DUSTED_GRAY, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_DUSTED_GRAY.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_GOLDEN, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_GOLDEN.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_GRAY, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_GRAY.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_LIGHT_GRAY, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_LIGHT_GRAY.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_MUTED_BROWN, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_MUTED_BROWN.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_VIVID_RED, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_VIVID_RED.getRegistryName()));
			item.getRegistry().register(new BlockItem(SANDSTONE_WHITE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(SANDSTONE_WHITE.getRegistryName()));
			item.getRegistry().register(new BlockItem(BLACK_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(BLACK_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(BLUE_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(BLUE_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(BROWN_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(BROWN_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(CYAN_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(CYAN_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(GRAY_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(GRAY_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(GREEN_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(GREEN_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(LIGHT_BLUE_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(LIGHT_BLUE_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(LIGHT_GRAY_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(LIGHT_GRAY_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(LIME_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(LIME_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(MAGENTA_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MAGENTA_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(ORANGE_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(ORANGE_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(PINK_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(PINK_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(PURPLE_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(PURPLE_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(RED_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(RED_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(WHITE_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(WHITE_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(YELLOW_DARK_PRISMARINE, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(YELLOW_DARK_PRISMARINE.getRegistryName()));
			item.getRegistry().register(new BlockItem(CYAN_PRISMARINE_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(CYAN_PRISMARINE_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(LIGHT_STONE_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(LIGHT_STONE_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(MEDIUM_STONE_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MEDIUM_STONE_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(DARK_STONE_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(DARK_STONE_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(LIGHT_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(LIGHT_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(MEDIUM_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MEDIUM_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(DARK_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(DARK_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(LIGHT_CLAY_BLOCK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(LIGHT_CLAY_BLOCK.getRegistryName()));
			item.getRegistry().register(new BlockItem(MEDIUM_CLAY_BLOCK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MEDIUM_CLAY_BLOCK.getRegistryName()));
			item.getRegistry().register(new BlockItem(DARK_CLAY_BLOCK, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(DARK_CLAY_BLOCK.getRegistryName()));
		}
	}


}
