package com.alaharranhonor.swlm.items;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.config.BlockConfigList;
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
import net.minecraft.world.level.block.Block;
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
     * @param ctx
     */
    @Override
    public InteractionResult useOn(UseOnContext ctx) {
        if (ctx.getLevel().isClientSide()) return InteractionResult.PASS;
        if (ctx.getItemInHand().getItem() != SWLMBlocks.STAR_WORM_MOTH.get()) return InteractionResult.PASS;

        BlockState targetState = getGlowing(ctx.getLevel().getBlockState(ctx.getClickedPos()));
        if (targetState == null) return InteractionResult.PASS;

        ctx.getLevel().setBlockAndUpdate(ctx.getClickedPos(), targetState);

        return InteractionResult.SUCCESS;
    }

    private static BlockState getGlowing(BlockState fromState) {
        ResourceLocation targetId = BlockConfigList.BLOCK_EQUIVALENCE.inverse().get(fromState.getBlock().getRegistryName());
        if (targetId == null) return null;
        Block target = ForgeRegistries.BLOCKS.getValue(targetId);

        BlockState targetState = target.defaultBlockState();
        for (ImmutableMap.Entry<Property<?>, Comparable<?>> entry : fromState.getValues().entrySet()) {
            targetState = targetState.setValue((Property) entry.getKey(), (Comparable) entry.getValue());
        }

        return targetState;
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

