package com.alaharranhonor.swlm.datagen;

import com.alaharranhonor.swlm.datagen.client.BlockStateGen;
import com.alaharranhonor.swlm.datagen.client.EnUsLangGen;
import com.alaharranhonor.swlm.datagen.client.ItemModelGen;
import com.alaharranhonor.swlm.datagen.server.BlockLootGen;
import com.alaharranhonor.swlm.datagen.server.RecipeGen;
import com.alaharranhonor.swlm.datagen.server.WorldGenGen;
import com.alaharranhonor.swlm.datagen.server.tags.BlockTagGen;
import com.alaharranhonor.swlm.datagen.server.tags.ItemTagGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber
public class DataGenerators {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator dataGen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> registries = event.getLookupProvider();

        // Client Gens
        dataGen.addProvider(
            event.includeClient(),
            (DataProvider.Factory<BlockStateGen>) output -> new BlockStateGen(output, existingFileHelper)
        );

        dataGen.addProvider(
            event.includeClient(),
            (DataProvider.Factory<ItemModelGen>) output -> new ItemModelGen(output, existingFileHelper)
        );

        dataGen.addProvider(
            event.includeClient(),
            (DataProvider.Factory<EnUsLangGen>) EnUsLangGen::new
        );

        // Server Gens
        dataGen.addProvider(
            event.includeServer(),
            (DataProvider.Factory<RecipeGen>) output -> new RecipeGen(output, registries)
        );

        BlockTagGen blockTags = dataGen.addProvider(
            event.includeServer(),
            (DataProvider.Factory<BlockTagGen>) output -> new BlockTagGen(output, registries, existingFileHelper)
        );

        dataGen.addProvider(
            event.includeServer(),
            (DataProvider.Factory<ItemTagGen>) output -> new ItemTagGen(output, registries, blockTags.contentsGetter(), existingFileHelper)
        );

        event.getGenerator().addProvider(
            event.includeServer(),
            (DataProvider.Factory<LootTableProvider>) output -> new LootTableProvider(
                output,
                Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(BlockLootGen::new, LootContextParamSets.BLOCK)),
                registries
            )
        );

        event.getGenerator().addProvider(
            event.includeServer(),
            (DataProvider.Factory<WorldGenGen>) output -> new WorldGenGen(
                output,
                registries
            )
        );
    }
}
