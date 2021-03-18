package com.alaharranhonor.swlm.util;

import com.alaharranhonor.swlm.SWLM;
import com.alaharranhonor.swlm.config.ConfigHelper;
import com.alaharranhonor.swlm.config.ConfigHolder;
import com.alaharranhonor.swlm.util.init.BlockInit;
import com.alaharranhonor.swlm.world.gen.OreGenUtils;
import com.alaharranhonor.swlm.world.gen.SWLMOreGen;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod.EventBusSubscriber(modid = SWLM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber {

	@SubscribeEvent
	public static void onModConfigEvent(ModConfig.ModConfigEvent event) {

		ModConfig config = event.getConfig();
		if (config.getModId().equals(SWLM.MOD_ID)) {
			if (config.getSpec() == ConfigHolder.SERVER_SPEC) {
				if (SWLMOreGen.SWLM_COBBLE_ORE == null) {
					SWLMOreGen.SWLM_COBBLE_ORE = OreGenUtils.buildOverWorldFeature(BlockInit.STAR_WORM_COBBLE.get().getDefaultState());
				}
				ConfigHelper.bakeServer(config);
			}
		}
	}
}
