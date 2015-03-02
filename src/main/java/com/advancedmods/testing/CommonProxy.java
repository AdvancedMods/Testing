package com.advancedmods.testing;

import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.FMLInjectionData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.io.File;

/**
 * Created by Dennisbonke on 1-3-2015.
 */
public class CommonProxy {

    public void loadTracker() {



    }

    /**
     * Gets if the game is paused
     * @return true if the game is paused
     */
    public boolean isPaused()
    {
        return false;
    }

    /**
     * Gets how far a player can reach
     * @param player
     * @return reach
     */
    public double getReach(EntityPlayer player)
    {
        if(player instanceof EntityPlayerMP)
        {
            return ((EntityPlayerMP)player).theItemInWorldManager.getBlockReachDistance();
        }

        return 0;
    }

    /**
     * Gets the Minecraft base directory.
     * @return base directory
     */
    public File getMinecraftDir()
    {
        return (File) FMLInjectionData.data()[6];
    }

    /**
     * Gets the Player
     * @param context
     * @return the player
     */
    public EntityPlayer getPlayer(MessageContext context)
    {
        return context.getServerHandler().playerEntity;
    }

}
