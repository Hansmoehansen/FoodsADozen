package com.hansmoehansen.foodsadozen.items;

import com.hansmoehansen.foodsadozen.blocks.BlockTomatoCrop;
import com.hansmoehansen.foodsadozen.init.CreativeTabFAD;
import com.hansmoehansen.foodsadozen.init.FADBlocks;
import com.hansmoehansen.foodsadozen.init.ItemFAD;
import com.hansmoehansen.foodsadozen.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;

public class ItemTomato extends ItemSeedFood
{
    public ItemTomato()
    {
        super(1, 0.2F, FADBlocks.tomatoCrop, Blocks.farmland);
        this.setCreativeTab(CreativeTabFAD.FAD_TAB);
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":tomato");
        this.setUnlocalizedName("tomato");
    }
}
