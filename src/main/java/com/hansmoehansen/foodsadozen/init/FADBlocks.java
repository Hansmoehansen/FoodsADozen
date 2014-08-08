package com.hansmoehansen.foodsadozen.init;

import com.hansmoehansen.foodsadozen.blocks.BlockTomatoCrop;
import com.hansmoehansen.foodsadozen.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class FADBlocks
{
    public static final BlockTomatoCrop tomatoCrop = new BlockTomatoCrop();

    public static void init()
    {
        GameRegistry.registerBlock(tomatoCrop, "tomato_block").setBlockName("tomato_crop").setBlockTextureName(Reference.MOD_ID + ":tomato_crop");

    }
}
