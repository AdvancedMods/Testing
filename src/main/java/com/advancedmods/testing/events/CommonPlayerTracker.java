package com.advancedmods.testing.events;

import com.advancedmods.testing.Testing;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Dennisbonke on 28-2-2015.
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

        Testing.log.info("[SERVER] Someone is logging on.");
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
        }

    }

    @SubscribeEvent
    public void onPlayerLogoutEvent(PlayerLoggedOutEvent event) {

    }

    @SubscribeEvent
    public void onPlayerDimChangedEvent(PlayerChangedDimensionEvent event) {

    }

}

    /*@SubscribeEvent
    public void onPlayerLoginEvent(PlayerLoggedInEvent event)
    {
        onPlayerLogin(event.player);
    }

    public void onPlayerLogin(EntityPlayer player)
    {
        Testing.log.info("[SERVER] Someone is logging on.");
    }

    @Override
    public void onPlayerLogin(EntityPlayer player) {

        Testing.log.info("[SERVER] Someone is logging on.");
        /*Testing.log.info("Login...");
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
        }*/


    /*@Override
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

    }*/


