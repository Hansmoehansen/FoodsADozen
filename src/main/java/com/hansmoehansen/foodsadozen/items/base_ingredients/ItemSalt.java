package com.hansmoehansen.foodsadozen.items.base_ingredients;

import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;

public class ItemSalt extends ItemFAD
{
    public ItemSalt()
    {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":salt");
        this.setUnlocalizedName("salt");
    }
}
