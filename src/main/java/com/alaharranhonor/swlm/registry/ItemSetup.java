package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.items.GlowMothItem;
import com.alaharranhonor.swlm.items.PestleMortarItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemSetup {

    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ModRef.ID);

    //AAH! A MOTH!
    public static final DeferredItem<Item> STAR_WORM = REGISTRY.register("star_worm", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PESTLE_MORTAR = REGISTRY.register("pestle_mortar", () -> new PestleMortarItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> STAR_WORM_GOOP = REGISTRY.register("star_worm_goop", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAR_WORM_MOTH = REGISTRY.register("star_worm_moth", () -> new GlowMothItem(new Item.Properties().stacksTo(1)));

    public static void init(IEventBus modBus) {
        REGISTRY.register(modBus);
    }

}
