package com.alaharranhonor.swlm.server.events;

import com.alaharranhonor.swlm.SWLM;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EdibleLightCheckEvent {
    @SubscribeEvent
    public static void addRightClickFunctions(RegistryEvent.Register<Block> event) {
        makeMaps();
    }

    public static void makeMaps() {
        for (int i = 0; i < MoreRightClickFunctionsConfig.COMMON_CONFIG.crackables_input.get().size(); i++) {
            Block input = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MoreRightClickFunctionsConfig.COMMON_CONFIG.crackables_input.get().get(i)));
            Block output = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MoreRightClickFunctionsConfig.COMMON_CONFIG.crackables_output.get().get(i)));
            if (input == null) {
                MoreRightClickFunctionsMod.LOGGER.debug("Warning! Crackables is broken and the game will crash!");
            }
            if (output == null) {
                MoreRightClickFunctionsMod.LOGGER.debug("Warning! Crackables is broken and the game will crash!");
            }
            MoreRightClickFunctionsMaps.CRACKABLES.put(input, output);