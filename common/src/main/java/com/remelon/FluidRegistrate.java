package com.remelon;

import com.tterrag.registrate.fabric.SimpleFlowableFluid;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.EmptyItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.FullItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;

import static com.remelon.ItemRegistrate.CREGISTRATE;
import static net.minecraft.world.item.Items.BUCKET;

public class FluidRegistrate {
    public static final ResourceLocation CRYSTAL_STILL_GEN = Crystallized.GenI("fluid/liquid_crystal_still");
    public static final ResourceLocation CRYSTAL_FLOW_GEN = Crystallized.GenI("fluid/liquid_crystal_flow");

    public static final FluidEntry<SimpleFlowableFluid.Flowing> CRYSTALFLUID = CREGISTRATE
            .fluid("liquid_crystal", CRYSTAL_STILL_GEN, CRYSTAL_FLOW_GEN)
            .lang("Liquid Crystal")
            .fluidProperties(p -> p.levelDecreasePerBlock(2)
                    .tickRate(25)
                    .flowSpeed(4)
                    .blastResistance(100f))
            .fluidAttributes(()->new FluidVariantAttributeHandler(){
                @Override
                public Component getName(FluidVariant fluidVariant) {
                    return Component.translatable("fluid.crystallized.crystal");
                }
                @Override
                public boolean isLighterThanAir(FluidVariant variant) {
                    return false;
                }
            })
            .source(SimpleFlowableFluid.Source::new)
            .bucket()
            .tab(GroupRegister.CRYSTAL_GROUP.key())
            .lang("Bucket of Liquid Crystal")
            .build()
            .onRegisterAfter(Registries.ITEM, crystal -> {
                Fluid source = crystal.getSource();
                FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
                        new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));

                FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
                        new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
            })

            .register();


    public static void init() {
    }
}
