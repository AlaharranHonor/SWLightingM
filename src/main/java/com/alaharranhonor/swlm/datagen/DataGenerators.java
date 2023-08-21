package com.alaharranhonor.swlm.datagen;

import com.alaharranhonor.swlm.ModRef;
import com.alaharranhonor.swlm.datagen.client.BlockStateGen;
import com.alaharranhonor.swlm.datagen.client.EnUsLangGen;
import com.alaharranhonor.swlm.datagen.client.ItemModelGen;
import com.alaharranhonor.swlm.datagen.server.LootTableGen;
import com.alaharranhonor.swlm.datagen.server.RecipeGen;
import com.alaharranhonor.swlm.datagen.server.WorldGenGen;
import com.alaharranhonor.swlm.datagen.server.tags.BlockTagGen;
import com.alaharranhonor.swlm.datagen.server.tags.ItemTagGen;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collections;
import java.util.List;

@Mod.EventBusSubscriber(modid = ModRef.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator dataGen = event.getGenerator();

        // Client Gens
        dataGen.addProvider(
            event.includeClient(),
            (DataProvider.Factory<BlockStateGen>) output -> new BlockStateGen(output, ModRef.ID, event.getExistingFileHelper())
        );

        dataGen.addProvider(
            event.includeClient(),
            (DataProvider.Factory<ItemModelGen>) output -> new ItemModelGen(output, ModRef.ID, event.getExistingFileHelper())
        );

        dataGen.addProvider(
            event.includeClient(),
            (DataProvider.Factory<EnUsLangGen>) output -> new EnUsLangGen(output, ModRef.ID)
        );

        // Server Gens
        dataGen.addProvider(
            event.includeServer(),
            (DataProvider.Factory<RecipeGen>) RecipeGen::new
        );

        BlockTagGen blockTags = dataGen.addProvider(
            event.includeServer(),
            (DataProvider.Factory<BlockTagGen>) output -> new BlockTagGen(output, event.getLookupProvider(), ModRef.ID, event.getExistingFileHelper())
        );

        dataGen.addProvider(
            event.includeServer(),
            (DataProvider.Factory<ItemTagGen>) output -> new ItemTagGen(output, event.getLookupProvider(), blockTags.contentsGetter(), ModRef.ID, event.getExistingFileHelper())
        );

        event.getGenerator().addProvider(
            event.includeServer(),
            (DataProvider.Factory<LootTableGen>) output -> new LootTableGen(
                output,
                Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(LootTableGen.AutoGenLoot::new, LootContextParamSets.EMPTY))
            )
        );

        event.getGenerator().addProvider(
            event.includeServer(),
            (DataProvider.Factory<WorldGenGen>) output -> new WorldGenGen(
                output,
                event.getLookupProvider()
            )
        );
    }
}
