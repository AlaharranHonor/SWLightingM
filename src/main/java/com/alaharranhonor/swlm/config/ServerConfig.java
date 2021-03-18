package com.alaharranhonor.swlm.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {

	final ForgeConfigSpec.BooleanValue serverEnableSWLMCobbleOre;
	final ForgeConfigSpec.IntValue serverSWLMCobbleVeinSize;
	final ForgeConfigSpec.IntValue serverSWLMCobbleVeinCount;
	final ForgeConfigSpec.IntValue serverSWLMCobbleBottomHeight;
	final ForgeConfigSpec.IntValue serverSWLMCobbleMaxHeight;

	ServerConfig(ForgeConfigSpec.Builder builder) {

		builder.push("SWLMOreGen");
		this.serverEnableSWLMCobbleOre = builder.comment("Enable SWLMCobble ore generation?").translation("swem.config.enableSWLMCobbleOre").define("EnableSWLMCobbleOre", true);
		this.serverSWLMCobbleVeinSize = builder.comment("SWLMCobble ore vein size").translation("swem.config.serverSWLMCobbleVeinSize").defineInRange("SWLMCobbleVeinSize", 7, 1, 2147483647);
		this.serverSWLMCobbleVeinCount = builder.comment("SWLMCobble ore vein count per chunk").translation("swem.config.serverSWLMCobbleVeinCount").defineInRange("SWLMCobbleVeinCount", 12, 1, 2147483647);
		this.serverSWLMCobbleBottomHeight = builder.comment("SWLMCobble ore minimum height").translation("swem.config.serverSWLMCobbleBottomHeight").defineInRange("SWLMCobbleBottomHeight", 50, 1, 2147483647);
		this.serverSWLMCobbleMaxHeight = builder.comment("SWLMCobble ore maximum height").translation("swem.config.serverSWLMCobbleMaxHeight").defineInRange("SWLMCobbleMaxHeight", 128, 1, 2147483647);
		builder.pop();

	}
}
