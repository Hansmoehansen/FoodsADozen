package com.hansmoehansen.foodsadozen.items.base_ingredients;

import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;

public class ItemsYeast extends ItemFAD
{
    public ItemsYeast()
    {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":yeast");
        this.setUnlocalizedName("yeast");
    }
}
