package com.hansmoehansen.foodsadozen.handlers;

import com.hansmoehansen.foodsadozen.items.ItemFlour;
import com.hansmoehansen.foodsadozen.items.ItemGrinder;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemGrinder grinder = new ItemGrinder();
    public static final ItemFlour flour = new ItemFlour();

    public static void init()
    {
        GameRegistry.registerItem(grinder, "grinder");
        GameRegistry.registerItem(flour, "flour");
    }



}
