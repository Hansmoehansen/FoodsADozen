package com.hansmoehansen.foodsadozen.init;

import com.hansmoehansen.foodsadozen.items.base_ingredients.*;
import com.hansmoehansen.foodsadozen.items.crafting_tools.*;
import com.hansmoehansen.foodsadozen.items.crops.*;
import com.hansmoehansen.foodsadozen.items.dough_and_batter.*;
import com.hansmoehansen.foodsadozen.items.seeds.*;
//import com.hansmoehansen.foodsadozen.items.meals_and_food.*; For future content
import cpw.mods.fml.common.registry.GameRegistry;

public class FADItems
{
    public static final ItemGrinder grinder = new ItemGrinder();
    public static final ItemFlour flour = new ItemFlour();
    public static final ItemDough dough = new ItemDough();
    public static final ItemSalt salt = new ItemSalt();
    public static final ItemsYeast yeast = new ItemsYeast();
    public static final ItemButter butter = new ItemButter();
    public static final ItemPancakeBatter pancake_batter = new ItemPancakeBatter();
    public static final ItemTomato tomato = new ItemTomato();
    public static final ItemTomatoSeed tomato_seed = new ItemTomatoSeed();

    public static void init()
    {
        GameRegistry.registerItem(grinder, "grinder");
        GameRegistry.registerItem(flour, "flour");
        GameRegistry.registerItem(dough, "dough_raw");
        GameRegistry.registerItem(salt, "salt");
        GameRegistry.registerItem(yeast, "yeast");
        GameRegistry.registerItem(butter, "butter");
        GameRegistry.registerItem(pancake_batter, "pancake_batter");
        //GameRegistry.registerItem(tomato_seed, "tomato_seed"); Now uses the tomato as the seed
        GameRegistry.registerItem(tomato, "tomato");
    }



}
