package com.hansmoehansen.foodsadozen.items.base_ingredients;

import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;

public class ItemButter extends ItemFAD
{
    public ItemButter()
    {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":butter");
        this.setUnlocalizedName("butter");
    }
}
