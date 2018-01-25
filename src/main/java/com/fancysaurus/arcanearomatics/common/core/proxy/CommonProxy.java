package com.fancysaurus.arcanearomatics.common.core.proxy;

import com.fancysaurus.arcanearomatics.common.block.base.ArcAroBlocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void PreInit(FMLPreInitializationEvent event)
    {
        ArcAroBlocks.preInit();
    }

    public void Init(FMLInitializationEvent event)
    {
        ArcAroBlocks.init();
    }

    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
