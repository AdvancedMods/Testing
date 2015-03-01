package com.advancedmods.testing.events;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;

/**
 * Created by Dennisbonke on 1-3-2015.
 */
@SideOnly(Side.CLIENT)
public class ClientPlayerTracker {

    @SubscribeEvent
    public void onPlayerLoginEvent(PlayerLoggedInEvent event)
    {

    }

    @SubscribeEvent
    public void onPlayerLogoutEvent(PlayerLoggedOutEvent event)
    {

    }

    @SubscribeEvent
    public void onPlayerDimChangedEvent(PlayerChangedDimensionEvent event)
    {

    }

}
    /*@Override
    public void onPlayerLogin(EntityPlayer player) {

        Testing.log.info("[CLIENT] Login...");
        FMLLog.severe("Login...");
        if (player.getGameProfile().getName().equals("Direwolf20")) {
            Testing.log.info("Direwolf20 detected!");
        }
        else if (player.getGameProfile().getName().equals("Dennisbonke")) {
            Testing.log.info("Member Dennisbonke of Advanced Mods detected!");
        }
        else if (player.getGameProfile().getName().equals("Zandor300")) {
            Testing.log.info("Member Zandor300 of Advanced Mods detected!");
        }
        else {
            Testing.log.warn("Not specified / Errored");
            FMLLog.severe("Not specified / Errored");
        }

    }

    @Override
    public void onPlayerLogout(EntityPlayer player) {



    }

    @Override
    public void onPlayerChangedDimension(EntityPlayer player) {



    }

    @Override
    public void onPlayerRespawn(EntityPlayer player) {

        if (player.getGameProfile().getName().equals("Direwolf20")) {
            Testing.log.info("Direwolf20 detected!");
        }
        else if (player.getGameProfile().getName().equals("Dennisbonke")) {
            Testing.log.info("Member Dennisbonke of Advanced Mods detected!");
        }
        else if (player.getGameProfile().getName().equals("Zandor300")) {
            Testing.log.info("Member Zandor300 of Advanced Mods detected!");
        }
        else {
            Testing.log.warn("Not specified / Errored");
            FMLLog.severe("Not specified / Errored");
        }

    }

    /*@SubscribeEvent
    public void onPlayerLoginEvent(PlayerLoggedInEvent event)
    {
        onPlayerLogin(event.player);
    }

    public void onPlayerLogin(EntityPlayer player)
    {
        Testing.log.info("[CLIENT] Login...");
    }*/