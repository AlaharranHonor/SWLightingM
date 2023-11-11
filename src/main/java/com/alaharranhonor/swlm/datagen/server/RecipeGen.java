package com.alaharranhonor.swlm.datagen.server;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.BlockSetup;
import com.alaharranhonor.swlm.registry.ItemSetup;
import com.alaharranhonor.swlm.util.SWLMTags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecipeGen extends RecipeProvider {

    public RecipeGen(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> builder) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemSetup.STAR_WORM_MOTH.get())
            .requires(SWLMTags.Items.STAR_WORM)
            .requires(Items.LANTERN)
            .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM).build()))
            .save(builder);

        for (RegistryObject<Block> swlmBlock : BlockSetup.REGISTRY.getEntries()) {
            if (!ForgeRegistries.BLOCKS.containsKey(BlockConfigList.BLOCK_EQUIVALENCE.inverse().get(swlmBlock.getId()))) {
                continue;
            }

            ResourceLocation baseId = BlockConfigList.BLOCK_EQUIVALENCE.inverse().get(swlmBlock.getId());
            Block baseBlock = ForgeRegistries.BLOCKS.getValue(baseId);
            ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(baseId.getNamespace()))
                .addRecipe(writer -> {
                    ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, swlmBlock.get())
                        .requires(SWLMTags.Items.STAR_WORM_GOOP)
                        .requires(baseBlock)
                        .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                        .save(writer);
                })
                .build(builder, swlmBlock.getId());


            Pattern pattern = Pattern.compile("(stripped_)?(?<woodtype>acacia|oak|spruce|birch|jungle|dark_oak|crimson|warped)_(?<logtype>wood|log|hyphae|stem)");
            Matcher matcher = pattern.matcher(swlmBlock.getId().getPath());
            if (matcher.find()) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", matcher.group("woodtype") + "_planks")), 4)
                    .requires(swlmBlock.get())
                    .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                    .save(builder, new ResourceLocation(ModRef.ID, "no_glow_" + (swlmBlock.getId().getPath().contains("stripped") ? "stripped_" : "") + matcher.group("woodtype") + "_" + matcher.group("logtype") + "_planks"));
            }
        }

        for (DyeColor resultColor : DyeColor.values()) {
            // Wool
            Item resultWool = ForgeRegistries.ITEMS.getValue(ModRef.res(resultColor.getName() + "_wool"));
            ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, resultWool)
                .requires(SWLMTags.Items.WOOL)
                .requires(resultColor.getTag())
                .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                .save(builder, ModRef.res("color_wool_to_" + resultColor.getName()));


            // Glass
            Item resultGlass = ForgeRegistries.ITEMS.getValue(ModRef.res(resultColor.getName() + "_stained_glass"));
            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, resultGlass, 8)
                .pattern("GGG")
                .pattern("GDG")
                .pattern("GGG")
                .define('G', SWLMTags.Items.GLASS)
                .define('D', resultColor.getTag())
                .unlockedBy("has_star_worm", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(SWLMTags.Items.STAR_WORM_GOOP).build()))
                .save(builder, ModRef.res("color_glass_to_" + resultColor.getName()));
        }

        BlockConfigList.REGISTERED_BLOCKS.forEach((baseId, block) -> {
            Block baseBlock = ForgeRegistries.BLOCKS.getValue(baseId);
            ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(baseId.getNamespace()))
                .addRecipe(writer -> {
                    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, block)
                        .requires(SWLMTags.Items.STAR_WORM_GOOP)
                        .requires(baseBlock)
                        .unlockedBy("has_block", has(block))
                        .save(writer);
                })
                .generateAdvancement()
                .build(builder, ModRef.res(baseId.getPath()));
        });
    }
}
