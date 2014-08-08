package com.hansmoehansen.foodsadozen.init;

import com.hansmoehansen.foodsadozen.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CreativeTabFAD
{
    public static final CreativeTabs FAD_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
    public Item getTabIconItem()
        {
            return FADItems.grinder;
        }
    };
}
