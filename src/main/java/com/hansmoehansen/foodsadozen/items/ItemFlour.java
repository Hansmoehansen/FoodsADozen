package com.hansmoehansen.foodsadozen.items;

import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;

public class ItemFlour extends ItemFAD
{
    public ItemFlour()
    {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":flour");
        this.setUnlocalizedName("flour");
    }
}
