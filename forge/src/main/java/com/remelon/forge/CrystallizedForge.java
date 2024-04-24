package com.remelon.forge;

import com.remelon.Crystallized;
import com.remelon.ItemRegistrate;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Crystallized.MOD_ID)
public class CrystallizedForge {
    public CrystallizedForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegistrate.CREGISTRATE.registerEventListeners(eventBus);
        Crystallized.init();
    }
}
