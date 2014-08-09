package com.hansmoehansen.foodsadozen.init;

import com.hansmoehansen.foodsadozen.items.base_ingredients.ItemFlour;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class EventHandler {
    public class CraftingHandler {

        @SubscribeEvent
        public void onItemCraftedEvent(PlayerEvent.ItemCraftedEvent event, EntityPlayer player)
        {
            if (event.crafting.getItem() == FADItems.flour)
            {
                player.inventory.addItemStackToInventory(new ItemStack(FADItems.grinder)) ;
            }
        }
    }
}

