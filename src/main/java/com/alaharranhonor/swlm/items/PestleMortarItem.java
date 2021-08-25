package com.alaharranhonor.swlm.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PestleMortarItem extends Item {

    public PestleMortarItem(final Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(itemStack.getItem());
    }

    @Override
    public boolean hasContainerItem() {
        return true;
    }
}