package com.fancysaurus.arcanearomatics.common.block;

import com.fancysaurus.arcanearomatics.common.interf.IArcAroBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import vazkii.arl.block.BlockMod;

public class BlockKettle extends BlockMod implements IArcAroBlock {

    public BlockKettle()
    {
        super("kettle", Material.ANVIL);

        setCreativeTab(CreativeTabs.BREWING);
    }
}
