package com.alaharranhonor.swlm.items;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.registry.SWLMBlocks;
import com.google.common.collect.ImmutableMap;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;

public class GlowMothItem extends Item {

    public GlowMothItem(final Properties properties) {
        super(properties);
    }

    /**
     * Called when this item is used when targetting a Block
     *
     * @param pContext
     */
    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()) return InteractionResult.PASS;
        if (pContext.getItemInHand().getItem() != SWLMBlocks.STAR_WORM_MOTH.get()) return InteractionResult.PASS;

        if (!pContext.getLevel().getBlockState(pContext.getClickedPos()).getBlock().getRegistryName().getNamespace().equals(SWLM.MOD_ID)) return InteractionResult.PASS;

        pContext.getLevel().setBlockAndUpdate(pContext.getClickedPos(), getGlowing(pContext.getLevel().getBlockState(pContext.getClickedPos())));

        return InteractionResult.SUCCESS;
    }


    private static BlockState getGlowing(BlockState swlmState) {
        BlockState vanillaState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", swlmState.getBlock().getRegistryName().getPath())).defaultBlockState();
        for (ImmutableMap.Entry<Property<?>, Comparable<?>> entry : swlmState.getValues().entrySet()) {
            vanillaState.setValue((Property) entry.getKey(), (Comparable) entry.getValue());
        }
        return vanillaState;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(itemStack.getItem());
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }


    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.swlm.star_worm_moth.tooltip"));
        }
    }

