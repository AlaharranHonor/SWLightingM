package com.alaharranhonor.swlm;

import com.alaharranhonor.swlm.config.ConfigHolder;
import com.alaharranhonor.swlm.util.registry.*;
import com.alaharranhonor.swlm.worldgen.SWLMOreGen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("swlm")
public class SWLM
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "swlm";

    public SWLM() {
        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        SWLMBlocks.init();
        SWLMConfiguredFeature.CONFIGURED_FEATURES.register(modEventBus);
        SWLMPlacedFeature.PLACED_FEATURES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(SWLMOreGen::onBiomeLoadingEvent);

        modLoadingContext.registerConfig(ModConfig.Type.SERVER, ConfigHolder.SERVER_SPEC);
    }

    private void setup(final FMLLoadCompleteEvent event)
    {
        if (ModList.get().isLoaded("swdm")) {
            SWDMInit.init();
        }
        if (ModList.get().isLoaded("swem")) {
            SWEMInit.init();
        }
        if (ModList.get().isLoaded("swpm")) {
            SWPMInit.init();
        }
    }
    public static final CreativeModeTab SWLMTAB = new CreativeModeTab("swlm") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SWLMBlocks.STAR_WORM.get());
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }.setBackgroundImage(new ResourceLocation("minecraft", "textures/gui/container/creative_inventory/tab_item_search.png"));
}
