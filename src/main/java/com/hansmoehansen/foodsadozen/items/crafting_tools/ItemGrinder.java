package com.hansmoehansen.foodsadozen.items.crafting_tools;

import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;
import net.minecraft.item.ItemStack;

public class ItemGrinder extends ItemFAD
{
    public ItemGrinder() {
        super();
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":grinder");
        this.setUnlocalizedName("grinder");
    }

        public ItemStack getContainerItem(ItemStack itemStack)
        {
            return new ItemStack(this,itemStack.stackSize);
        }
}

