package com.hansmoehansen.foodsadozen;

import com.hansmoehansen.foodsadozen.init.*;
import com.hansmoehansen.foodsadozen.proxy.IProxy;
import com.hansmoehansen.foodsadozen.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class FoodsADozen {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static FoodsADozen instance;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile()); //Init config file
        LogHandler.info("Config Loaded");

        FADBlocks.init(); //Init blocks
        LogHandler.info("Blocks Initialzied");

        FADItems.init(); //Init items
        LogHandler.info("Items Initalized");

        RecipieHandler.init(); //Init recipies
        LogHandler.info("Recipies Initialized");
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Init EventHandler (onItemCrafted)
        FMLCommonHandler.instance().bus().register(new EventHandler());
        LogHandler.info("EventHandler Registered");

        LogHandler.info("Initalization Finished");
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}