package com.alaharranhonor.swlm;

import com.alaharranhonor.swlm.config.BlockConfigList;
import com.alaharranhonor.swlm.config.ConfigHolder;
import com.alaharranhonor.swlm.registry.*;
import com.alaharranhonor.swlm.worldgen.SWLMOreGen;
import com.google.common.collect.Maps;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

@Mod("swlm")
public class SWLM {
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "swlm";

    public static ResourceLocation res(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

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

        if (ModList.get().isLoaded("swdm")) {
            //SWDMInit.init();
        }
        if (ModList.get().isLoaded("swem")) {
            SWEMInit.init();
        }
        if (ModList.get().isLoaded("swpm")) {
            SWPMInit.init();
        }
    }

    private void setup(final FMLLoadCompleteEvent event) {

    }

    public static final CreativeModeTab TAB = new CreativeModeTab("swlm") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SWLMBlocks.STAR_WORM.get());
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> pItems) {
            HashMap<ResourceLocation, Item> allEntries = ForgeRegistries.ITEMS.getEntries().stream().collect(HashMap::new, (map, entry) -> {
               map.put(entry.getKey().getRegistryName(), entry.getValue());
            }, HashMap::putAll);

            for(RegistryObject<Item> item : SWLMBlocks.ITEMS.getEntries()) {
                item.get().fillItemCategory(this, pItems);
                allEntries.remove(item.getId());
            }

            for(Item item : BlockConfigList.REGISTERED_ITEMS.values()) {
                item.fillItemCategory(this, pItems);
                allEntries.remove(item.getRegistryName());
            }

            for (Item item : allEntries.values()) {
                item.fillItemCategory(this, pItems);
            }
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }.setBackgroundImage(new ResourceLocation("minecraft", "textures/gui/container/creative_inventory/tab_item_search.png"));
}
