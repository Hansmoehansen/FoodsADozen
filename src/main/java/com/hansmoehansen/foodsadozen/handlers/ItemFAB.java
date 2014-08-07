package com.hansmoehansen.foodsadozen.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemFAB extends Item
{
    public ItemFAB()
    {
        super();
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabFood);
    }
}
