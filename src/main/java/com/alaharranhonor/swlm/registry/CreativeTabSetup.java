package com.alaharranhonor.swlm.registry;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.config.BlockConfigList;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabSetup {

    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModRef.ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = REGISTRY.register("main", () -> CreativeModeTab.builder()
        .title(Component.translatable("item_group." + ModRef.ID + ".main"))
        .icon(() -> new ItemStack(ItemSetup.STAR_WORM.get()))
        .withSearchBar()
        .displayItems((params, output) -> {
            ItemSetup.REGISTRY.getEntries().forEach(item -> {
                output.accept(item.get());
            });
            BlockConfigList.REGISTERED_ITEMS.values().forEach(output::accept);
        })
        .build()
    );

    public static void init(IEventBus modBus) {
        REGISTRY.register(modBus);
    }

}
