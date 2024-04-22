package com.remelon.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import com.remelon.Crystallized;
import net.fabricmc.api.ModInitializer;

public class CrystallizedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Crystallized.init();
        Crystallized.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), Crystallized.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        Crystallized.CREGISTRATE.register();
    }
}
