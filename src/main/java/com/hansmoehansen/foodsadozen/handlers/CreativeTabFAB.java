package com.hansmoehansen.foodsadozen.handlers;

import com.hansmoehansen.foodsadozen.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabFAB
{
    public static final CreativeTabs FAD_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
    public Item getTabIconItem()
        {
            return null;
        }
    }
}
