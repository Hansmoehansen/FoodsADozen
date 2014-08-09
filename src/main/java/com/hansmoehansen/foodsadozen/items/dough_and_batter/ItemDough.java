package com.hansmoehansen.foodsadozen.items.dough_and_batter;

import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;

public class ItemDough extends ItemFAD
{
    public ItemDough()
    {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":dough_raw");
        this.setUnlocalizedName("raw_dough");
    }
}
