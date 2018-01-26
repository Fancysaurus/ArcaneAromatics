package com.fancysaurus.arcanearomatics.common.core.proxy;

import com.fancysaurus.arcanearomatics.common.reg.ArcAroBlocks;
import com.fancysaurus.arcanearomatics.common.reg.ArcAroItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void PreInit(FMLPreInitializationEvent event)
    {
        ArcAroItems.preInit();
        ArcAroBlocks.preInit();
    }

    public void Init(FMLInitializationEvent event)
    {
        ArcAroItems.init();
        ArcAroBlocks.init();
    }

    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
