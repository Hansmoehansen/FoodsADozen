package com.hansmoehansen.foodsadozen.init;

import net.minecraft.item.Item;

public class ItemFAD extends Item
{
    public ItemFAD()
    {
        super();
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabFAD.FAD_TAB);
    }
}
