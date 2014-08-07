package com.hansmoehansen.foodsadozen.items;

import com.hansmoehansen.foodsadozen.handlers.ItemFAB;
import com.hansmoehansen.foodsadozen.reference.Reference;
import com.hansmoehansen.foodsadozen.handlers.ItemFAB;
import com.hansmoehansen.foodsadozen.reference.Reference;

public class ItemFlour extends ItemFAB
{
    public ItemFlour()
    {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":flour");
        this.setUnlocalizedName("flour");
    }
}
