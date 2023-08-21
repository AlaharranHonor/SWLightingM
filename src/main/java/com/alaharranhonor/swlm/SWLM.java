package com.alaharranhonor.swlm;

import com.alaharranhonor.swlm.config.ConfigHolder;
import com.alaharranhonor.swlm.registry.*;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(modid = ModRef.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@Mod(ModRef.ID)
public class SWLM {

    public SWLM() {
        BlockSetup.init();
        ItemSetup.init();
        CreativeTabSetup.init();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ConfigHolder.SERVER_SPEC);

        if (ModList.get().isLoaded("swem")) {
            SWEMInit.init();
        }

        if (ModList.get().isLoaded("swpm")) {
            SWPMInit.init();
        }
    }
}
