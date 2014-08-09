package com.hansmoehansen.foodsadozen.items.dough_and_batter;

import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;

public class ItemPancakeBatter extends ItemFAD
{
    public ItemPancakeBatter()
    {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":batter_pancake");
        this.setUnlocalizedName("pancake_batter");
    }
}
