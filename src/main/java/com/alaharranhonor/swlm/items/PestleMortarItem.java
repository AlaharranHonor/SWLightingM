package com.alaharranhonor.swlm.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class PestleMortarItem extends Item {

    public PestleMortarItem(final Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(itemStack.getItem());
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}