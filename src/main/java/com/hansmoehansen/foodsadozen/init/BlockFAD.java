package com.hansmoehansen.foodsadozen.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFAD extends Block
{
    public BlockFAD()
    {
        super(Material.ground);
        this.setCreativeTab(CreativeTabFAD.FAD_TAB);
    }
}
