package com.advancedmods.testing.events;

import com.advancedmods.testing.Testing;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Dennisbonke on 28-2-2015.
 */
public class PlayerTracker extends PlayerEvent.PlayerLoggedInEvent {

    public PlayerTracker(EntityPlayer player) {
        super(player);
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

        }
    }

}
