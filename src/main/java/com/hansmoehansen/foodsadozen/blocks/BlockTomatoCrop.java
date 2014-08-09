package com.hansmoehansen.foodsadozen.blocks;

import com.hansmoehansen.foodsadozen.init.FADItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockTomatoCrop extends BlockCrops
{

    @Override
    protected Item func_149866_i()
    {
        return FADItems.tomato;
    }

    @Override
    protected Item func_149865_P()
    {
        return FADItems.tomato;
    }
}
