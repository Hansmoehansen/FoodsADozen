package com.hansmoehansen.foodsadozen.items;

import com.hansmoehansen.foodsadozen.handlers.ItemFAB;
import com.hansmoehansen.foodsadozen.reference.Reference;

public class ItemGrinder extends ItemFAB
{
    public ItemGrinder()
    {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":grinder");
        this.setUnlocalizedName("grinder");
    }
}
