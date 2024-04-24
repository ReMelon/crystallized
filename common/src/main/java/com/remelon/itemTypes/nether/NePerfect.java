package com.remelon.itemTypes.nether;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class NePerfect extends Item {

    public NePerfect(Properties properties) {
        super(properties);
    }



    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        pTooltipComponents.add(Component.translatable("item.crystallized.nether.tooltip").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("item.crystallized.perfect.tooltip2").withStyle(ChatFormatting.DARK_GRAY));
    }
}
