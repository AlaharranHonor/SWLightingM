package com.alaharranhonor.swlm.server.events;


import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.items.GlowMothItem;
import com.alaharranhonor.swlm.server.SWLMBlockMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Optional;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GlowMothUseEvent {
    @SubscribeEvent
    public static void addGlowMothRightClick(PlayerInteractEvent.RightClickBlock event) {
        var itemInHand = event.getItemStack();
        var player = event.getPlayer();
        var level = event.getWorld();
        var pos = event.getPos();
        var blockstate = level.getBlockState(pos);
        var hand = event.getHand();

        if (itemInHand.getItem() instanceof GlowMothItem) {
            Optional<BlockState> edibleLight = Optional.ofNullable(getGlowing(blockstate));
            if (edibleLight.isPresent()) {
                level.setBlockAndUpdate(pos, edibleLight.get());

                player.swing(hand);
                event.setUseBlock(Event.Result.DENY);
            }
        }
    }

    private static BlockState getGlowing(BlockState state) {
        Block block = SWLMBlockMap.GLOWING.build().get(state.getBlock());
        return block != null ? block.defaultBlockState() : null;
    }
}
