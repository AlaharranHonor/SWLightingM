package com.alaharranhonor.swlm.datagen;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.datagen.client.BlockStateGen;
import com.alaharranhonor.swlm.datagen.client.ItemModelGen;
import com.alaharranhonor.swlm.datagen.client.EnUsLangGen;
import com.alaharranhonor.swlm.datagen.server.LootTableGen;
import com.alaharranhonor.swlm.datagen.server.RecipeGen;
import com.alaharranhonor.swlm.datagen.server.tags.BlockTagGen;
import com.alaharranhonor.swlm.datagen.server.tags.ItemTagGen;
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
            data.addProvider(new ItemModelGen(data, SWLM.MOD_ID, event.getExistingFileHelper()));
            data.addProvider(new EnUsLangGen(data, SWLM.MOD_ID));
            data.addProvider(new BlockStateGen(data, SWLM.MOD_ID, event.getExistingFileHelper()));
        }
        if (event.includeServer()) {
            data.addProvider(new RecipeGen(data));
            data.addProvider(new LootTableGen(data));

            BlockTagGen blockTags = new BlockTagGen(data, SWLM.MOD_ID, event.getExistingFileHelper());
            data.addProvider(blockTags);
            data.addProvider(new ItemTagGen(data, blockTags, SWLM.MOD_ID, event.getExistingFileHelper()));
        }
    }
}
