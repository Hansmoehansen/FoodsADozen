package com.hansmoehansen.foodsadozen.items;

import com.hansmoehansen.foodsadozen.init.CreativeTabFAD;
import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;
import net.minecraft.item.ItemFood;

public class ItemTomato extends ItemFood
{
    public ItemTomato()
    {
        super(1, 0.4F, false);
        setUnlocalizedName("tomato");
        setTextureName(Reference.MOD_ID + ":tomato");
        setCreativeTab(CreativeTabFAD.FAD_TAB);
    }
}
