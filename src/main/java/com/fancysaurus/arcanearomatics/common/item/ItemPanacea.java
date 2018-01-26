package com.fancysaurus.arcanearomatics.common.item;

import com.fancysaurus.arcanearomatics.common.interf.IArcAroItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import vazkii.arl.item.ItemMod;

public class ItemPanacea extends ItemMod implements IArcAroItem
{
    public ItemPanacea()
    {
        super("panacea");
        setCreativeTab(CreativeTabs.BREWING);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.RARE;
    }

    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
