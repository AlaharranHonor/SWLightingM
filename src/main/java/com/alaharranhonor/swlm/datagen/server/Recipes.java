package com.alaharranhonor.swlm.datagen.server;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.util.SWLMTags;
import com.alaharranhonor.swlm.util.registry.SWLMBlocks;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapelessRecipeBuilder.shapeless(SWLMBlocks.STAR_WORM_MOTH.get())
            .requires(SWLMTags.Items.STAR_WORM)
            .requires(Items.LANTERN)
            .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM).build()))
            .save(pFinishedRecipeConsumer);

        for (RegistryObject<Block> swlmBlock : SWLMBlocks.BLOCKS.getEntries()) {
            if (shouldSkip(swlmBlock.get())) {
                continue;
            }

            ShapelessRecipeBuilder.shapeless(swlmBlock.get())
                .requires(SWLMTags.Items.STAR_WORM_GOOP)
                .requires(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", swlmBlock.getId().getPath())))
                .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                .save(pFinishedRecipeConsumer);

            Pattern pattern = Pattern.compile("(stripped_)?(?<woodtype>acacia|oak|spruce|birch|jungle|dark_oak|crimson|warped)_(?<logtype>wood|log|hyphae|stem)");
            Matcher matcher = pattern.matcher(swlmBlock.getId().getPath());
            if (matcher.find()) {
                ShapelessRecipeBuilder.shapeless(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", matcher.group("woodtype") + "_planks")), 4)
                    .requires(swlmBlock.get())
                    .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                    .save(pFinishedRecipeConsumer, new ResourceLocation(SWLM.MOD_ID, "no_glow_" + (swlmBlock.getId().getPath().contains("stripped") ? "stripped_" : "") + matcher.group("woodtype") + "_" + matcher.group("logtype") + "_planks"));
            }
        }
    }

    private boolean shouldSkip(Block block) {
        return List.of("star_worm_cobble").contains(block.getRegistryName().getPath());
    }
}
