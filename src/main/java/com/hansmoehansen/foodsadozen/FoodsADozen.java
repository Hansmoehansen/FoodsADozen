package com.hansmoehansen.foodsadozen;

import com.hansmoehansen.foodsadozen.init.*;
import com.hansmoehansen.foodsadozen.proxy.IProxy;
import com.hansmoehansen.foodsadozen.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class FoodsADozen {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static FoodsADozen instance;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        LogHandler.info("Config Loaded");

        FADBlocks.init();
        LogHandler.info("Blocks Initialzied");

        FADItems.init();
        LogHandler.info("Items Initalized");

        RecipieHandler.init();
        LogHandler.info("Recipies Initialized");
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHandler.info("Initalization Finished");
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}