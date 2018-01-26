package com.fancysaurus.arcanearomatics.common.reg;

import com.fancysaurus.arcanearomatics.common.block.BlockKettle;
import com.fancysaurus.arcanearomatics.common.lib.LibMisc;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;
import vazkii.arl.block.BlockMod;

public class ArcAroBlocks
{
    public static BlockMod kettle;

    public static void preInit()
    {
        kettle = new BlockKettle();
        initTileEntities();
    }

    public static void init()
    {

    }

    private static void initTileEntities()
    {

    }

    private static void registerTileEntity(Class<? extends TileEntity> clazz, String Key)
    {
        GameRegistry.registerTileEntity(clazz, LibMisc.MOD_PREFIX + Key);
    }
}
