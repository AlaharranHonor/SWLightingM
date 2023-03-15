package com.alaharranhonor.swlm.util.registry;

import com.alaharranhonor.swlm.SWLM;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SWDMInit {

	/*
	public static final List<String> STONE_TYPES = new ArrayList(Arrays.asList("mossy", "cracked", "more_mossy"));
	public static final List<String> LMD_TYPES = new ArrayList(Arrays.asList("light", "medium", "dark"));
	public static final List<String> CUSTOM_COLORS = new ArrayList<>(Arrays.asList("sage", "golden"));
	public static final List<String> NATURAL_TONES = new ArrayList<>(Arrays.asList("dark_brown", "brown", "muted_brown", "vivid_red", "tuscan", "golden", "pale", "white", "dusted_gray", "light_gray", "blue_gray", "gray", "black"));
	public static final HashMap<String, HashMap<String, Block.Properties>> STONE_SETS = new HashMap() {{
		put("color", new HashMap() {{
			put("dark_prismarine", Block.Properties.copy(Blocks.PRISMARINE_BRICKS).lightLevel(s -> 15));
			put("glass_bricks", Block.Properties.copy(Blocks.GLASS).lightLevel(s -> 15));
			put("concrete", Block.Properties.copy(Blocks.BLACK_CONCRETE).lightLevel(s -> 15));
			put("terracotta", Block.Properties.copy(Blocks.TERRACOTTA).lightLevel(s -> 15));
		}});
		put("color_custom", new HashMap() {{
			put("terracotta", Block.Properties.copy(Blocks.TERRACOTTA).lightLevel(s -> 15));
		}});
		put("standard", new HashMap() {{
			put("stone", Block.Properties.copy(Blocks.STONE).lightLevel(s -> 15));
			put("andesite", Block.Properties.copy(Blocks.ANDESITE).lightLevel(s -> 15));
			put("granite", Block.Properties.copy(Blocks.GRANITE).lightLevel(s -> 15));
			put("diorite", Block.Properties.copy(Blocks.DIORITE).lightLevel(s -> 15));
		}});
		put("lmd", new HashMap() {{
			put("brick", Block.Properties.copy(Blocks.BRICKS).lightLevel(s -> 15));
			put("stone_brick", Block.Properties.copy(Blocks.BRICKS).lightLevel(s -> 15));
		}});
		put("lmd-only", new HashMap() {{
			put("stone", Block.Properties.copy(Blocks.STONE).lightLevel(s -> 15));
		}});
	}};

	public static final HashMap<String, HashMap<String, Block.Properties>> SSW_SETS = new HashMap() {{
		put("color", new HashMap() {{
			put("metal_roof", Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL).lightLevel(s -> 15));
			put("tile_roof", Block.Properties.copy(Blocks.CLAY).lightLevel(s -> 15));
			put("shingle_roof", Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).strength(2.0F, 3.0F).sound(SoundType.STONE).lightLevel(s -> 15));
			put("stained_glass", Block.Properties.copy(Blocks.BLACK_STAINED_GLASS).lightLevel(s -> 15));
			put("wool", Block.Properties.copy(Blocks.BLACK_WOOL).lightLevel(s -> 15));
			put("pastel_wool", Block.Properties.copy(Blocks.BLACK_WOOL).lightLevel(s -> 15));
			put("tinted_wool", Block.Properties.copy(Blocks.BLACK_WOOL).lightLevel(s -> 15));
		}});
		put("wv", new HashMap() {{
			put("log", Block.Properties.copy(Blocks.OAK_SLAB).lightLevel(s -> 15));
			put("stripped_log", Block.Properties.copy(Blocks.OAK_SLAB).lightLevel(s -> 15));
		}});
		put("wv-whitewash", new HashMap() {{
			put("leaves", Block.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn((p_235441_0_, p_235441_1_, p_235441_2_, p_235441_3_) -> p_235441_3_ == EntityType.OCELOT || p_235441_3_ == EntityType.PARROT).isSuffocating((p, p1, p2) -> false).isViewBlocking((p, p1, p2) -> false).lightLevel(s -> 15));
		}});
		put("lmd", new HashMap() {{
			put("screen", Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5.0F, 6.0F).noOcclusion());
		}});
		put("lmd-color", new HashMap() {{
			put("siding", Block.Properties.copy(Blocks.OAK_PLANKS));
		}});
	}};

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SWLM.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SWLM.MOD_ID);

	private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
		return register(name, sup, SWDMInit::itemDefault);
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

	// Stone sets
	// The order is STONE TYPE then STONE.

	// Stone sets 16 colours.
	// Stonem set -> List of the 16 colours
	public static final HashMap<String, HashMap<String, List<RegistryObject<Block>>>> STONE_SET_BLOCKS = new HashMap<>();


	// SSW_SET
	// Type of set -> Map<BlockTypes> -> List<Blocks>'
	public static final HashMap<String, HashMap<String, List<RegistryObject<Block>>>> SSW_SET_BLOCKS = new HashMap<>();

	public static final List<RegistryObject<SandBlock>> SAND_BLOCKS = new ArrayList<>();
	public static final List<RegistryObject<Block>> SANDSTONE_BLOCKS = new ArrayList<>();

	static {
		for (String stoneType : STONE_TYPES) {
			for (Map.Entry<String, Block.Properties> blockType : STONE_SETS.get("standard").entrySet()) {
				HashMap<String, List<RegistryObject<Block>>> blockMap = STONE_SET_BLOCKS.getOrDefault("standard", new HashMap<>());
				List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
				blockList.add(register(stoneType + "_" + blockType.getKey(), () -> new Block(blockType.getValue())));
				blockMap.put(blockType.getKey(), blockList);
				STONE_SET_BLOCKS.put("standard", blockMap);
			}

			for (String lmdType : LMD_TYPES) {
				for (Map.Entry<String, Block.Properties> blockType : STONE_SETS.get("lmd").entrySet()) {
					HashMap<String, List<RegistryObject<Block>>> blockMap = STONE_SET_BLOCKS.getOrDefault("lmd", new HashMap<>());
					List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
					blockList.add(register(stoneType + "_" + lmdType + "_" + blockType.getKey(), () -> new Block(blockType.getValue())));
					blockMap.put(blockType.getKey(), blockList);
				}
			}
		}

		for (String lmdType : LMD_TYPES) {
			for (Map.Entry<String, Block.Properties> blockType : STONE_SETS.get("lmd-only").entrySet()) {
				HashMap<String, List<RegistryObject<Block>>> blockMap = STONE_SET_BLOCKS.getOrDefault("lmd-only", new HashMap<>());
				List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
				blockList.add(register(lmdType + "_" + blockType.getKey(), () -> new Block(blockType.getValue())));
				blockMap.put(blockType.getKey(), blockList);
			}
		}


		for (DyeColor color : DyeColor.values()) {
			for (Map.Entry<String, Block.Properties> blockType : SSW_SETS.get("color").entrySet()) {
				if (!blockType.getKey().equals("wool") && !blockType.getKey().equals("stained_glass")) {

					HashMap<String, List<RegistryObject<Block>>> blockMap = SSW_SET_BLOCKS.getOrDefault("color", new HashMap<>());
					List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
					blockList.add(register(color.getName() + "_" + blockType.getKey(), () -> new Block(blockType.getValue())));
					blockMap.put(blockType.getKey(), blockList);
					SSW_SET_BLOCKS.put("color", blockMap);
				}
			}

			for (Map.Entry<String, Block.Properties> blockType : STONE_SETS.get("color").entrySet()) {

				if (!blockType.getKey().equals("concrete") && !blockType.getKey().equals("terracotta")) {
					HashMap<String, List<RegistryObject<Block>>> blockMap = STONE_SET_BLOCKS.getOrDefault("color", new HashMap<>());
					List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
					blockList.add(register(color.getName() + "_" + blockType.getKey(), () -> new Block(blockType.getValue())));
					blockMap.put(blockType.getKey(), blockList);
					STONE_SET_BLOCKS.put("color", blockMap);
				}
			}

		}

		for (String color : CUSTOM_COLORS) {

			for (Map.Entry<String, Block.Properties> blockType : STONE_SETS.get("color_custom").entrySet()) {
				HashMap<String, List<RegistryObject<Block>>> blockMap = STONE_SET_BLOCKS.getOrDefault("color_custom", new HashMap<>());
				List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
				blockList.add(register(color + "_" + blockType.getKey(), () -> new Block(blockType.getValue())));
				blockMap.put(blockType.getKey(), blockList);
				STONE_SET_BLOCKS.put("color_custom", blockMap);
			}
		}

		WoodType.values().forEach((wood) -> {
			if (!wood.name().equals("crimson") && !wood.name().equals("warped") && !wood.name().contains(":")) { // Vanilla wood types.
				String sanitizedWoodName = wood.name().contains(":") ? wood.name().split(":")[1] : wood.name();
				for (Map.Entry<String, Block.Properties> blockType : SSW_SETS.get("wv").entrySet()) {
					String typeName;
					if (blockType.getKey().equals("stripped_log")) {
						typeName = "stripped_"+sanitizedWoodName+"_log";
					} else {
						typeName = sanitizedWoodName + "_" + blockType.getKey();
					}

					// Skip these wood types. ^^
					if (!blockType.getKey().equals("log") && !blockType.getKey().equals("stripped_log")) {
						HashMap<String, List<RegistryObject<Block>>> blockMap = SSW_SET_BLOCKS.getOrDefault("wv", new HashMap<>());
						List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
						blockList.add(register(typeName, () -> new Block(blockType.getValue())));
						blockMap.put(blockType.getKey(), blockList);
						SSW_SET_BLOCKS.put("wv", blockMap);
					}
				}

				for (Map.Entry<String, Block.Properties> blockType : SSW_SETS.get("wv-whitewash").entrySet()) {
					if (wood.name().contains("swem:")) break;

					Supplier<Block> stairBlock = null;
					if (!blockType.getKey().equals("leaves")) {
						HashMap<String, List<RegistryObject<Block>>> blockMap = SSW_SET_BLOCKS.getOrDefault("wv-whitewash", new HashMap<>());
						List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
						blockList.add(register(wood.name() + "_" + blockType.getKey(), () -> new Block(blockType.getValue())));
						blockMap.put(blockType.getKey(), blockList);
						SSW_SET_BLOCKS.put("wv-whitewash", blockMap);
					}
				}
			}
		});

		LMD_TYPES.forEach((lmdType) -> {
			for (Map.Entry<String, Block.Properties> blockType : SSW_SETS.get("lmd").entrySet()) {
				HashMap<String, List<RegistryObject<Block>>> blockMap = SSW_SET_BLOCKS.getOrDefault("lmd", new HashMap<>());
				List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
				blockList.add(register(lmdType + "_" + blockType.getKey(), () -> new Block(blockType.getValue())));
				blockMap.put(blockType.getKey(), blockList);
				SSW_SET_BLOCKS.put("lmd", blockMap);
			}

			for (Map.Entry<String, Block.Properties> blockType : STONE_SETS.get("lmd").entrySet()) {
				HashMap<String, List<RegistryObject<Block>>> blockMap = STONE_SET_BLOCKS.getOrDefault("lmd", new HashMap<>());
				List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
				blockList.add(register(lmdType + "_" + blockType.getKey(), () -> new Block(blockType.getValue())));
				blockMap.put(blockType.getKey(), blockList);
				STONE_SET_BLOCKS.put("lmd", blockMap);
			}
		});

		for (String natural : NATURAL_TONES) {
			SAND_BLOCKS.add(register("sand_" + natural, () -> new SandBlock(14406560, Block.Properties.copy(Blocks.SAND))));
			SANDSTONE_BLOCKS.add(register("sandstone_" + natural, () -> new Block(Block.Properties.copy(Blocks.SANDSTONE))));
		}

		for (DyeColor color : DyeColor.values()) {
			for (String lmdType : LMD_TYPES) {

				for (Map.Entry<String, Block.Properties> blockType : SSW_SETS.get("lmd-color").entrySet()) {
					HashMap<String, List<RegistryObject<Block>>> blockMap = SSW_SET_BLOCKS.getOrDefault("lmd-color", new HashMap<>());
					List<RegistryObject<Block>> blockList = blockMap.getOrDefault(blockType.getKey(), new ArrayList<>());
					blockList.add(register(blockType.getKey() + "_" + color.getName() + "_" + lmdType, () -> new Block(blockType.getValue())));
					blockMap.put(blockType.getKey(), blockList);
					SSW_SET_BLOCKS.put("lmd-color", blockMap);
				}

			}
		}
	}
	*/
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
	public static Block BLACK_GLASS_BRICKS;
	public static Block BLUE_GLASS_BRICKS;
	public static Block BROWN_GLASS_BRICKS;
	public static Block CYAN_GLASS_BRICKS;
	public static Block GRAY_GLASS_BRICKS;
	public static Block GREEN_GLASS_BRICKS;
	public static Block LIGHT_BLUE_GLASS_BRICKS;
	public static Block LIGHT_GRAY_GLASS_BRICKS;
	public static Block LIME_GLASS_BRICKS;
	public static Block MAGENTA_GLASS_BRICKS;
	public static Block ORANGE_GLASS_BRICKS;
	public static Block PINK_GLASS_BRICKS;
	public static Block PURPLE_GLASS_BRICKS;
	public static Block RED_GLASS_BRICKS;
	public static Block WHITE_GLASS_BRICKS;
	public static Block YELLOW_GLASS_BRICKS;
	public static Block LIGHT_STONE_BRICKS;
	public static Block MEDIUM_STONE_BRICKS;
	public static Block DARK_STONE_BRICKS;
	public static Block LIGHT_BRICKS;
	public static Block MEDIUM_BRICKS;
	public static Block DARK_BRICKS;
	public static Block LIGHT_CLAY_BLOCK;
	public static Block MEDIUM_CLAY_BLOCK;
	public static Block DARK_CLAY_BLOCK;

	public static void init() {
		//ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		//BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		Map<Item, Block> swdmBlocks = new HashMap() {{
			put(SWDMInit.MOSSY_STONE.asItem(), ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "mossy_stone")));
			put(SWDMInit.MORE_MOSSY_STONE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "more_mossy_stone")));
			put(SWDMInit.CRACKED_STONE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "cracked_stone")));
			put(SWDMInit.MOSSY_ANDESITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "mossy_andesite")));
			put(SWDMInit.MORE_MOSSY_ANDESITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "more_mossy_andesite")));
			put(SWDMInit.CRACKED_ANDESITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "cracked_andesite")));
			put(SWDMInit.MOSSY_DIORITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "mossy_diorite")));
			put(SWDMInit.MORE_MOSSY_DIORITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "more_mossy_diorite")));
			put(SWDMInit.CRACKED_DIORITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "cracked_diorite")));
			put(SWDMInit.MOSSY_GRANITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "mossy_granite")));
			put(SWDMInit.MORE_MOSSY_GRANITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "more_mossy_granite")));
			put(SWDMInit.CRACKED_GRANITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "cracked_granite")));
			put(SWDMInit.THATCH_BLOCK.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "thatch_block")));
			put(SWDMInit.BAMBOO_BLOCK.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "bamboo_block")));
			put(SWDMInit.SAND_BLACK.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_black")));
			put(SWDMInit.SAND_BLUE_GRAY.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_blue_gray")));
			put(SWDMInit.SAND_BROWN.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_brown")));
			put(SWDMInit.SAND_DARK_BROWN.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_dark_brown")));
			put(SWDMInit.SAND_DUSTED_GRAY.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_dusted_gray")));
			put(SWDMInit.SAND_GOLDEN.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_golden")));
			put(SWDMInit.SAND_GRAY.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_gray")));
			put(SWDMInit.SAND_LIGHT_GRAY.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_light_gray")));
			put(SWDMInit.SAND_MUTED_BROWN.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_muted_brown")));
			put(SWDMInit.SAND_VIVID_RED.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_vivid_red")));
			put(SWDMInit.SAND_WHITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sand_white")));
			put(SWDMInit.SANDSTONE_BLACK.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sandstone_black")));
			put(SWDMInit.SANDSTONE_BLUE_GRAY.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sandstone_blue_gray")));
			put(SWDMInit.SANDSTONE_BROWN.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sandstone_brown")));
			put(SWDMInit.SANDSTONE_DARK_BROWN.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sandstone_dark_brown")));
			put(SWDMInit.SANDSTONE_DUSTED_GRAY.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "standstone_dusted_gray")));
			put(SWDMInit.SANDSTONE_GOLDEN.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "standstone_golden")));
			put(SWDMInit.SANDSTONE_GRAY.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sandstone_gray")));
			put(SWDMInit.SANDSTONE_LIGHT_GRAY.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sandstone_light_gray")));
			put(SWDMInit.SANDSTONE_MUTED_BROWN.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sandstone_muted_brown")));
			put(SWDMInit.SANDSTONE_VIVID_RED.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sandstone_vivid_rid")));
			put(SWDMInit.SANDSTONE_WHITE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "sandstone_white")));
			put(SWDMInit.BLACK_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "black_dark_prismarine")));
			put(SWDMInit.BLUE_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "blue_dark_prismarine")));
			put(SWDMInit.BROWN_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "brown_dark_prismarine")));
			put(SWDMInit.CYAN_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "cyan_dark_prismarine")));
			put(SWDMInit.GRAY_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "gray_dark_prismarine")));
			put(SWDMInit.GREEN_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "green_dark_prismarine")));
			put(SWDMInit.LIGHT_BLUE_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "light_blue_dark_prismarine")));
			put(SWDMInit.LIGHT_GRAY_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "light_gray_dark_prismarine")));
			put(SWDMInit.LIME_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "lime_dark_prismarine")));
			put(SWDMInit.MAGENTA_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "magenta_dark_prismarine")));
			put(SWDMInit.ORANGE_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "orange_dark_prismarine")));
			put(SWDMInit.PINK_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "pink_dark_prismarine")));
			put(SWDMInit.PURPLE_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "purple_dark_prismarine")));
			put(SWDMInit.RED_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "red_dark_prismarine")));
			put(SWDMInit.WHITE_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "white_dark_prismarine")));
			put(SWDMInit.YELLOW_DARK_PRISMARINE.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "yellow_dark_prismarine")));
			put(SWDMInit.CYAN_GLASS_BRICKS.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "cyan_glass_bricks")));
			put(SWDMInit.LIGHT_STONE_BRICKS.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "light_stone_brick")));
			put(SWDMInit.MEDIUM_STONE_BRICKS.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "medium_stone_brick")));
			put(SWDMInit.DARK_STONE_BRICKS.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "dark_stone_brick")));
			put(SWDMInit.LIGHT_BRICKS.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "light_brick")));
			put(SWDMInit.MEDIUM_BRICKS.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "medium_brick")));
			put(SWDMInit.DARK_BRICKS.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "dark_brick")));
			put(SWDMInit.LIGHT_CLAY_BLOCK.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "light_clay_block")));
			put(SWDMInit.MEDIUM_CLAY_BLOCK.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "medium_clay_block")));
			put(SWDMInit.DARK_CLAY_BLOCK.asItem(),  ForgeRegistries.BLOCKS.getValue(new ResourceLocation("swdm", "dark_clay_block")));
		}};

	}

	/* Blocks are intialized first.
	* Store the reference to the block, and then in the item initialization register the items and block items.
	 */
	@SubscribeEvent
	public static void intializeModBlocks(RegistryEvent.Register<Block> item) {
		if (ModList.get().isLoaded("swdm")) {

			MOSSY_STONE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_stone"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MOSSY_STONE);
			MORE_MOSSY_STONE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_stone"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MORE_MOSSY_STONE);
			CRACKED_STONE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cracked_stone"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(CRACKED_STONE);
			MOSSY_ANDESITE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_andesite"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MOSSY_ANDESITE);
			MORE_MOSSY_ANDESITE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_andesite"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MORE_MOSSY_ANDESITE);
			CRACKED_ANDESITE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cracked_andesite"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(CRACKED_ANDESITE);
			MOSSY_DIORITE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_diorite"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MOSSY_DIORITE);
			MORE_MOSSY_DIORITE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_diorite"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MORE_MOSSY_DIORITE);
			CRACKED_DIORITE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cracked_diorite"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(CRACKED_DIORITE);
			MOSSY_GRANITE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("mossy_granite"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MOSSY_GRANITE);
			MORE_MOSSY_GRANITE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("more_mossy_granite"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MORE_MOSSY_GRANITE);
			CRACKED_GRANITE = new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cracked_granite"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(CRACKED_GRANITE);
			THATCH_BLOCK = new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.WET_GRASS).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("thatch_block"); // .harvestTool(ToolType.HOE)
			item.getRegistry().register(THATCH_BLOCK);
			BAMBOO_BLOCK = new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.BAMBOO).sound(SoundType.BAMBOO).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("bamboo_block");
			item.getRegistry().register(BAMBOO_BLOCK);
			SAND_BLACK = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_black");
			item.getRegistry().register(SAND_BLACK);
			SAND_BLUE_GRAY = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_blue_gray");
			item.getRegistry().register(SAND_BLUE_GRAY);
			SAND_BROWN = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_brown");
			item.getRegistry().register(SAND_BROWN);
			SAND_DARK_BROWN = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_dark_brown");
			item.getRegistry().register(SAND_DARK_BROWN);
			SAND_DUSTED_GRAY = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_dusted_gray");
			item.getRegistry().register(SAND_DUSTED_GRAY);
			SAND_GOLDEN = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_golden");
			item.getRegistry().register(SAND_GOLDEN);
			SAND_GRAY = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_gray");
			item.getRegistry().register(SAND_GRAY);
			SAND_LIGHT_GRAY = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_light_gray");
			item.getRegistry().register(SAND_LIGHT_GRAY);
			SAND_MUTED_BROWN = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_muted_brown");
			item.getRegistry().register(SAND_MUTED_BROWN);
			SAND_VIVID_RED = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_vivid_red");
			item.getRegistry().register(SAND_VIVID_RED);
			SAND_WHITE = new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).lightLevel((state) -> 15)).setRegistryName("sand_white");
			item.getRegistry().register(SAND_WHITE);
			SANDSTONE_BLACK = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_black"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_BLACK);
			SANDSTONE_BLUE_GRAY = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_blue_gray"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_BLUE_GRAY);
			SANDSTONE_BROWN = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_brown"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_BROWN);
			SANDSTONE_DARK_BROWN = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_dark_brown"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_DARK_BROWN);
			SANDSTONE_DUSTED_GRAY = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_dusted_gray"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_DUSTED_GRAY);
			SANDSTONE_GOLDEN = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_golden"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_GOLDEN);
			SANDSTONE_GRAY = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_gray"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_GRAY);
			SANDSTONE_LIGHT_GRAY = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_light_gray"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_LIGHT_GRAY);
			SANDSTONE_MUTED_BROWN = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_muted_brown"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_MUTED_BROWN);
			SANDSTONE_VIVID_RED = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_vivid_red"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_VIVID_RED);
			SANDSTONE_WHITE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("sandstone_white"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(SANDSTONE_WHITE);
			BLACK_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("black_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(BLACK_DARK_PRISMARINE);
			BLUE_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("blue_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(BLUE_DARK_PRISMARINE);
			BROWN_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("brown_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(BROWN_DARK_PRISMARINE);
			CYAN_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cyan_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(CYAN_DARK_PRISMARINE);
			GRAY_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("gray_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(GRAY_DARK_PRISMARINE);
			GREEN_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("green_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(GREEN_DARK_PRISMARINE);
			LIGHT_BLUE_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_blue_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(LIGHT_BLUE_DARK_PRISMARINE);
			LIGHT_GRAY_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_gray_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(LIGHT_GRAY_DARK_PRISMARINE);
			LIME_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("lime_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(LIME_DARK_PRISMARINE);
			MAGENTA_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("magenta_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MAGENTA_DARK_PRISMARINE);
			ORANGE_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("orange_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(ORANGE_DARK_PRISMARINE);
			PINK_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("pink_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(PINK_DARK_PRISMARINE);
			PURPLE_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("purple_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(PURPLE_DARK_PRISMARINE);
			RED_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("red_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(RED_DARK_PRISMARINE);
			WHITE_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("white_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(WHITE_DARK_PRISMARINE);
			YELLOW_DARK_PRISMARINE = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("yellow_dark_prismarine"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(YELLOW_DARK_PRISMARINE);
			BLACK_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("black_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(BLACK_GLASS_BRICKS);
			BLUE_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("blue_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(BLUE_GLASS_BRICKS);
			BROWN_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("brown_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(BROWN_GLASS_BRICKS);
			CYAN_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("cyan_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(CYAN_GLASS_BRICKS);
			GRAY_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("gray_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(GRAY_GLASS_BRICKS);
			GREEN_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("green_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(GREEN_GLASS_BRICKS);
			LIGHT_BLUE_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_blue_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(LIGHT_BLUE_GLASS_BRICKS);
			LIGHT_GRAY_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_gray_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(LIGHT_GRAY_GLASS_BRICKS);
			LIME_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("lime_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(LIME_GLASS_BRICKS);
			MAGENTA_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("magenta_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MAGENTA_GLASS_BRICKS);
			ORANGE_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("orange_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(ORANGE_GLASS_BRICKS);
			PINK_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("pink_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(PINK_GLASS_BRICKS);
			PURPLE_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("purple_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(PURPLE_GLASS_BRICKS);
			RED_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("red_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(RED_GLASS_BRICKS);
			WHITE_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("white_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(WHITE_GLASS_BRICKS);
			YELLOW_GLASS_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("yellow_glass_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(YELLOW_GLASS_BRICKS);
			LIGHT_STONE_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_stone_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(LIGHT_STONE_BRICKS);
			MEDIUM_STONE_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("medium_stone_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MEDIUM_STONE_BRICKS);
			DARK_STONE_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("dark_stone_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(DARK_STONE_BRICKS);
			LIGHT_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(LIGHT_BRICKS);
			MEDIUM_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("medium_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MEDIUM_BRICKS);
			DARK_BRICKS = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("dark_bricks"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(DARK_BRICKS);
			LIGHT_CLAY_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("light_clay_block"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(LIGHT_CLAY_BLOCK);
			MEDIUM_CLAY_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("medium_clay_block"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
			item.getRegistry().register(MEDIUM_CLAY_BLOCK);
			DARK_CLAY_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().lightLevel((state) -> 15)).setRegistryName("dark_clay_block"); // harvestTool(ToolType.PICKAXE).harvestLevel(0)
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
			item.getRegistry().register(new BlockItem(BLACK_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(BLACK_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(BLUE_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(BLUE_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(BROWN_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(BROWN_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(CYAN_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(CYAN_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(GRAY_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(GRAY_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(GREEN_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(GREEN_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(LIGHT_BLUE_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(LIGHT_BLUE_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(LIGHT_GRAY_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(LIGHT_GRAY_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(LIME_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(LIME_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(MAGENTA_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(MAGENTA_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(ORANGE_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(ORANGE_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(PINK_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(PINK_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(PURPLE_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(PURPLE_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(RED_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(RED_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(WHITE_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(WHITE_GLASS_BRICKS.getRegistryName()));
			item.getRegistry().register(new BlockItem(YELLOW_GLASS_BRICKS, new Item.Properties().tab(SWLM.SWLMTAB)).setRegistryName(YELLOW_GLASS_BRICKS.getRegistryName()));
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
