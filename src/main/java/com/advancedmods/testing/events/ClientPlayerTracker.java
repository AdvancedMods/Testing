package com.advancedmods.testing.events;

import com.advancedmods.testing.Testing;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Client Tracker for AMTesting
 * Created by Dennisbonke on 1-3-2015.
 *
 * @author Dennis Bonke
 * @since 1.0
 * @see com.advancedmods.testing.events.CommonPlayerTracker
 */
@SideOnly(Side.CLIENT)
public class ClientPlayerTracker {

    @SubscribeEvent
    public void onPlayerLoginEvent(PlayerLoggedInEvent event) {

        onPlayerLoginClient();

    }

    public void onPlayerLoginClient() {

        Testing.log.info("[CLIENT] Logging in....");

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