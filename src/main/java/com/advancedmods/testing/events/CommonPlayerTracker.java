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

import java.util.UUID;

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

        try {
            Testing.log.info("[SERVER] Someone is logging on.");
            if (player.getGameProfile().getId().equals(UUID.fromString("bbb87dbe-690f-4205-bdc5-72ffb8ebc29d"))) {
                Testing.log.info("Direwolf20 logged in!");
            } else if (player.getGameProfile().getId().equals(UUID.fromString("70bf2a19-271f-4adb-9ab1-b965fd7eb630"))) {
                Testing.log.info("Owner / Main dev Dennisbonke of Advanced Mods logged in!");
            } else if (player.getGameProfile().getId().equals(UUID.fromString("9cd2a682-d1a1-4b3f-8bf2-162bf6b11852"))) {
                Testing.log.info("Owner / Artist Zandor300 of Advanced Mods logged in!");
            } else {
                Testing.log.info("Not specified");
            }
        } catch (Exception e) {
            Testing.log.error("Errored");
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