package com.alaharranhonor.swlm.datagen.client;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.block.HangingStarWormsBlock;
import com.alaharranhonor.swlm.util.registry.SWLMBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {

    public BlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.getVariantBuilder(SWLMBlocks.HANGING_STAR_WORMS.get())
            .forAllStates(state -> {
                boolean isEnd = state.getValue(HangingStarWormsBlock.END);
                String name = isEnd ? "hanging_star_worms_end" : "hanging_star_worms";
                return ConfiguredModel.builder().modelFile(this.models().cross(name, SWLM.res("blocks/" + name))).build();
            });
    }
}
