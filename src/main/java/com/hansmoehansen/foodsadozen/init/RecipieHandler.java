package com.hansmoehansen.foodsadozen.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipieHandler
{
    public static void init()
    {
        //Standard crafting
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FADItems.flour), new ItemStack(FADItems.grinder), "cropWheat") );
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FADItems.butter), Items.milk_bucket));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FADItems.dough), new ItemStack(FADItems.yeast), Items.water_bucket, new ItemStack(FADItems.flour)));

        //Furnace
        GameRegistry.addSmelting(FADItems.dough, new ItemStack(Items.bread), 1.0F);
    }
}
