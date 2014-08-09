package com.hansmoehansen.foodsadozen.items.seeds;

import com.hansmoehansen.foodsadozen.init.CreativeTabFAD;
import com.hansmoehansen.foodsadozen.init.FADBlocks;
import com.hansmoehansen.foodsadozen.reference.Reference;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemTomatoSeed extends ItemSeeds
{
    public ItemTomatoSeed()
    {
        super(FADBlocks.tomatoCrop, Blocks.farmland);
        this.setCreativeTab(CreativeTabFAD.FAD_TAB);
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":tomato_seeds");
        this.setUnlocalizedName("tomato_seed");
    }
}
