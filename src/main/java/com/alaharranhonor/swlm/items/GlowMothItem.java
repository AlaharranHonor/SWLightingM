package com.alaharranhonor.swlm.items;

import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.registry.BlockSetup;
import com.alaharranhonor.swlm.registry.ItemSetup;
import com.google.common.collect.ImmutableMap;
import net.minecraft.network.chat.Component;
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

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.swlm.star_worm_moth.tooltip"));
    }

    @Override
    public InteractionResult useOn(UseOnContext ctx) {
        if (ctx.getLevel().isClientSide()) return InteractionResult.PASS;
        if (ctx.getItemInHand().getItem() != ItemSetup.STAR_WORM_MOTH.get()) return InteractionResult.PASS;

        BlockState targetState = getGlowing(ctx.getLevel().getBlockState(ctx.getClickedPos()));
        if (targetState == null) return InteractionResult.PASS;

        ctx.getLevel().setBlockAndUpdate(ctx.getClickedPos(), targetState);

        return InteractionResult.SUCCESS;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return stack.copy();
    }

    private static BlockState getGlowing(BlockState fromState) {
        ResourceLocation targetId = BlockConfigList.BLOCK_EQUIVALENCE.inverse().get(ForgeRegistries.BLOCKS.getKey(fromState.getBlock()));
        if (targetId == null) return null;
        Block target = ForgeRegistries.BLOCKS.getValue(targetId);

        BlockState targetState = target.defaultBlockState();
        for (ImmutableMap.Entry<Property<?>, Comparable<?>> entry : fromState.getValues().entrySet()) {
            targetState = targetState.setValue((Property) entry.getKey(), (Comparable) entry.getValue());
        }

        return targetState;
    }
}

