package com.advancedmods.testing.events;

import com.advancedmods.testing.Testing;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.MinecraftForge;

/**
 * Common tracker for AMTesting
 * Created by Dennisbonke on 28-2-2015.
 *
 * @author Dennis Bonke
 * @since 1.0
 */
public class CommonPlayerTracker {

    public CommonPlayerTracker()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerLoginEvent(PlayerLoggedInEvent event) {

        onPlayerLogin(event.player);

    }

    public void onPlayerLogin(EntityPlayer player) {

        onPlayerLoginChat(player);
        onPlayerLoginSideCheck(player);
        onPlayerLoginPlayerCheck(player);

    }

    public void onPlayerLoginChat(EntityPlayer player) {

        player.addChatComponentMessage(new ChatComponentText("Hello " + player.getDisplayName() + "!"));

    }

    public void onPlayerLoginSideCheck(EntityPlayer player) {

        if (!player.worldObj.isRemote) {
            Testing.log.info("Integrated Server");
        } else {
            Testing.log.info("Dedicated Server");
        }

    }

    public void onPlayerLoginPlayerCheck(EntityPlayer player) {

        Testing.log.info("[SERVER] Someone is logging on.");
        if (player.getGameProfile().getName().equals("Direwolf20")) {
            Testing.log.info("Direwolf20 logged in!");
        }
        else if (player.getGameProfile().getName().equals("Dennisbonke")) {
            Testing.log.info("Member Dennisbonke of Advanced Mods logged in!");
        }
        else if (player.getGameProfile().getName().equals("Zandor300")) {
            Testing.log.info("Member Zandor300 of Advanced Mods logged in!");
        }
        else {
            Testing.log.warn("Not specified / Errored");
        }

    }

    @SubscribeEvent
    public void onPlayerLogoutEvent(PlayerLoggedOutEvent event) {

    }

    @SubscribeEvent
    public void onPlayerDimChangedEvent(PlayerChangedDimensionEvent event) {

    }

    @SubscribeEvent
    public void onPlayerRespawnEvent(PlayerRespawnEvent event) {

    }

}