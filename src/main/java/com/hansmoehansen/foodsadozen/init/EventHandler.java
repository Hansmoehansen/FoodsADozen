package com.hansmoehansen.foodsadozen.init;

import com.hansmoehansen.foodsadozen.items.base_ingredients.ItemFlour;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class EventHandler {

        EntityPlayer player;
        @SubscribeEvent
        public void onItemCraftedEvent(PlayerEvent.ItemCraftedEvent event)
        {
            if (event.crafting.getItem() instanceof ItemFlour)
            {
                player.closeScreen();
                player.setHealth(0);
                LogHandler.info("Event Registered");
            }
        }
    }

