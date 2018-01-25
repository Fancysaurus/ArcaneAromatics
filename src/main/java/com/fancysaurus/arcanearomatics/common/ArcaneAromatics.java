package com.fancysaurus.arcanearomatics.common;

import com.fancysaurus.arcanearomatics.common.core.proxy.CommonProxy;
import com.fancysaurus.arcanearomatics.common.lib.LibMisc;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = LibMisc.MOD_ID, name = LibMisc.MOD_ID, version = LibMisc.VERSION)
public class ArcaneAromatics
{
    @Mod.Instance(LibMisc.MOD_ID)
    public static ArcaneAromatics instance;

    @SidedProxy(serverSide = LibMisc.PROXY_COMMON, clientSide = LibMisc.PROXY_CLIENT, modId = LibMisc.MOD_ID)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.PreInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.Init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.PostInit(event);
    }
}
