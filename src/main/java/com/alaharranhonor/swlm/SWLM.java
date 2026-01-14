package com.alaharranhonor.swlm;

import com.alaharranhonor.swlm.registry.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

@Mod(ModRef.ID)
public class SWLM {

    public SWLM(ModContainer container, IEventBus modBus) {
        BlockSetup.init(modBus);
        ItemSetup.init(modBus);
        CreativeTabSetup.init(modBus);

        //container.registerConfig(ModConfig.Type.SERVER, ConfigHolder.SERVER_SPEC);

        if (ModList.get().isLoaded("swem")) {
            SWEMInit.init();
        }

        if (ModList.get().isLoaded("swpm")) {
            SWPMInit.init();
        }
    }
}
