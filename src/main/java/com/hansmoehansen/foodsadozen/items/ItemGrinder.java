package com.hansmoehansen.foodsadozen.items;

import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;

public class ItemGrinder extends ItemFAD
{
    public ItemGrinder()
    {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":grinder");
        this.setUnlocalizedName("grinder");
    }
}
