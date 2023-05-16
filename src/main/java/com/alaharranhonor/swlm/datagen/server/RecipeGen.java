package com.alaharranhonor.swlm.datagen.server;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.util.SWLMTags;
import com.alaharranhonor.swlm.registry.SWLMBlocks;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecipeGen extends RecipeProvider {
    public RecipeGen(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> builder) {
        ShapelessRecipeBuilder.shapeless(SWLMBlocks.STAR_WORM_MOTH.get())
            .requires(SWLMTags.Items.STAR_WORM)
            .requires(Items.LANTERN)
            .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM).build()))
            .save(builder);

        for (RegistryObject<Block> swlmBlock : SWLMBlocks.BLOCKS.getEntries()) {
            if (!ForgeRegistries.BLOCKS.containsKey(BlockConfigList.BLOCK_EQUIVALENCE.inverse().get(swlmBlock.getId()))) {
                continue;
            }

            Block baseBlock = ForgeRegistries.BLOCKS.getValue(BlockConfigList.BLOCK_EQUIVALENCE.inverse().get(swlmBlock.getId()));
            ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(baseBlock.getRegistryName().getNamespace()))
                .addRecipe(writer -> {
                    ShapelessRecipeBuilder.shapeless(swlmBlock.get())
                        .requires(SWLMTags.Items.STAR_WORM_GOOP)
                        .requires(baseBlock)
                        .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                        .save(writer);
                })
                .build(builder, swlmBlock.getId());


            Pattern pattern = Pattern.compile("(stripped_)?(?<woodtype>acacia|oak|spruce|birch|jungle|dark_oak|crimson|warped)_(?<logtype>wood|log|hyphae|stem)");
            Matcher matcher = pattern.matcher(swlmBlock.getId().getPath());
            if (matcher.find()) {
                ShapelessRecipeBuilder.shapeless(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", matcher.group("woodtype") + "_planks")), 4)
                    .requires(swlmBlock.get())
                    .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                    .save(builder, new ResourceLocation(SWLM.MOD_ID, "no_glow_" + (swlmBlock.getId().getPath().contains("stripped") ? "stripped_" : "") + matcher.group("woodtype") + "_" + matcher.group("logtype") + "_planks"));
            }
        }

        for (DyeColor resultColor : DyeColor.values()) {
            // Wool
            Item resultWool = ForgeRegistries.ITEMS.getValue(SWLM.res(resultColor.getName() + "_wool"));
            ShapelessRecipeBuilder.shapeless(resultWool)
                .requires(SWLMTags.Items.WOOL)
                .requires(resultColor.getTag())
                .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                .save(builder, SWLM.res("color_wool_to_" + resultColor.getName()));


            // Glass
            Item resultGlass = ForgeRegistries.ITEMS.getValue(SWLM.res(resultColor.getName() + "_stained_glass"));
            ShapedRecipeBuilder.shaped(resultGlass, 8)
                .pattern("GGG")
                .pattern("GDG")
                .pattern("GGG")
                .define('G', SWLMTags.Items.GLASS)
                .define('D', resultColor.getTag())
                .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                .save(builder, SWLM.res("color_glass_to_" + resultColor.getName()));
        }

        BlockConfigList.REGISTERED_BLOCKS.forEach((baseId, block) -> {
            Block baseBlock = ForgeRegistries.BLOCKS.getValue(baseId);
            ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(baseId.getNamespace()))
                .addRecipe(writer -> {
                    ShapelessRecipeBuilder.shapeless(block)
                        .requires(SWLMTags.Items.STAR_WORM_GOOP)
                        .requires(baseBlock)
                        .unlockedBy("has_block", has(block))
                        .save(writer);
                })
                .build(builder, block.getRegistryName());

        });
    }

    private boolean shouldSkip(Block block) {
        return List.of("star_worm_cobble", "star_worm_vines", "hanging_star_worms").contains(block.getRegistryName().getPath());
    }
}
