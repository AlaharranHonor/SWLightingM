package com.alaharranhonor.swlm.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class PestleMortarItem extends Item {

    public PestleMortarItem(final Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return stack.copy();
    }
}