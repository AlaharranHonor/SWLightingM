package com.alaharranhonor.swlm.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.FallingBlock;

public class LightFallingBlock extends FallingBlock {

    public static final MapCodec<LightFallingBlock> CODEC = simpleCodec(LightFallingBlock::new);
    public LightFallingBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }
}
