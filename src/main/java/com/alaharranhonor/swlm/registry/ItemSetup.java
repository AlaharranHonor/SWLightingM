package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.items.GlowMothItem;
import com.alaharranhonor.swlm.items.PestleMortarItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemSetup {

    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModRef.ID);

    //AAH! A MOTH!
    public static final RegistryObject<Item> STAR_WORM = REGISTRY.register("star_worm", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PESTLE_MORTAR = REGISTRY.register("pestle_mortar", () -> new PestleMortarItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STAR_WORM_GOOP = REGISTRY.register("star_worm_goop", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAR_WORM_MOTH = REGISTRY.register("star_worm_moth", () -> new GlowMothItem(new Item.Properties().stacksTo(1)));

    public static void init() {
        REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
