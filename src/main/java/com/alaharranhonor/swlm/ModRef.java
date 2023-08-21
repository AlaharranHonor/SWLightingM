package com.alaharranhonor.swlm;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModRef {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String ID = "swlm";

    public static ResourceLocation res(String name) {
        return new ResourceLocation(ID, name);
    }

}
