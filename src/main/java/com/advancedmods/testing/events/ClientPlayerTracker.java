package com.advancedmods.testing.events;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;

/**
 * Created by Dennisbonke on 1-3-2015.
 */
@SideOnly(Side.CLIENT)
public class ClientPlayerTracker {

    @SubscribeEvent
    public void onPlayerLoginEvent(PlayerLoggedInEvent event) {

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