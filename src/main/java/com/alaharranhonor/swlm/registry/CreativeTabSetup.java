package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabSetup {

    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModRef.ID);

    public static final RegistryObject<CreativeModeTab> TAB = REGISTRY.register("main", () -> CreativeModeTab.builder()
        .title(Component.translatable("item_group." + ModRef.ID + ".main"))
        .icon(() -> new ItemStack(ItemSetup.STAR_WORM.get()))
        .displayItems((params, output) -> {
            ItemSetup.REGISTRY.getEntries().forEach(item -> {
                output.accept(item.get());
            });
        })
        .build()
    );

    public static void init() {
        REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
