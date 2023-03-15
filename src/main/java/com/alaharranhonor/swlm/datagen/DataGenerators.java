package com.alaharranhonor.swlm.datagen;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.datagen.client.BlockModels;
import com.alaharranhonor.swlm.datagen.client.BlockStates;
import com.alaharranhonor.swlm.datagen.client.ItemModels;
import com.alaharranhonor.swlm.datagen.server.Recipes;
import com.alaharranhonor.swlm.datagen.server.tags.BlockTags;
import com.alaharranhonor.swlm.datagen.server.tags.ItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator data = event.getGenerator();

        if (event.includeClient()) {
            data.addProvider(new ItemModels(data, SWLM.MOD_ID, event.getExistingFileHelper()));
            data.addProvider(new BlockModels(data, SWLM.MOD_ID, event.getExistingFileHelper()));
            data.addProvider(new BlockStates(data, SWLM.MOD_ID, event.getExistingFileHelper()));
        }
        if (event.includeServer()) {
            data.addProvider(new Recipes(data));

            BlockTags blockTags = new BlockTags(data, SWLM.MOD_ID, event.getExistingFileHelper());
            data.addProvider(blockTags);
            data.addProvider(new ItemTags(data, blockTags, SWLM.MOD_ID, event.getExistingFileHelper()));
        }
    }
}
