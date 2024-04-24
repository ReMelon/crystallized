package com.remelon;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class GroupRegister {
    public static final TabInfo CRYSTAL_GROUP = register("Crystallized",
            () -> FabricItemGroup.builder()
                    .title(Component.translatable("crystallized.itemtab"))
                    .icon(() -> new ItemStack(ItemRegistrate.NETHER_CRYSTAL))
                    .displayItems((displayContext, entries) -> {
                    })
                    .build());




    private static TabInfo register(String name, Supplier<CreativeModeTab> supplier) {
        ResourceLocation id = new ResourceLocation("crystallized", "itemtab");
        ResourceKey<CreativeModeTab> key = ResourceKey.create(Registries.CREATIVE_MODE_TAB, id);
        CreativeModeTab tab = supplier.get();
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, tab);
        return new TabInfo(key, tab);
    }

    public record TabInfo(ResourceKey<CreativeModeTab> key, CreativeModeTab tab) {
    }

    public static void init() {
    }
}
