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

    public boolean isPaused()
    {
        return false;
    }

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

    public EntityPlayer getPlayer(MessageContext context)
    {
        return context.getServerHandler().playerEntity;
    }

}
