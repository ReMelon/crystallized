package com.remelon;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Crystallized {
    public static final String MOD_ID = "crystallized";
    public static final String NAME = "Create: Crystallized";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);



    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, ExampleExpectPlatform.platformName());
        ItemRegistrate.init();
        GroupRegister.init();
        // ResourcePack.init();
        FluidRegistrate.init();
    }

    public static ResourceLocation GenI(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
