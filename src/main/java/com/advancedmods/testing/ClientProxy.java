package com.advancedmods.testing;

import com.advancedmods.testing.events.ClientPlayerTracker;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;

import java.io.File;

/**
 * Created by Dennisbonke on 1-3-2015.
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void loadTracker() {

        super.loadTracker();
        FMLCommonHandler.instance().bus().register(new ClientPlayerTracker());

    }

    @Override
    public double getReach(EntityPlayer player)
    {
        return Minecraft.getMinecraft().playerController.getBlockReachDistance();
    }

    @Override
    public boolean isPaused()
    {
        if(FMLClientHandler.instance().getClient().isSingleplayer() && !FMLClientHandler.instance().getClient().getIntegratedServer().getPublic())
        {
            GuiScreen screen = FMLClientHandler.instance().getClient().currentScreen;

            if(screen != null && screen.doesGuiPauseGame())
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public File getMinecraftDir()
    {
        return Minecraft.getMinecraft().mcDataDir;
    }

    @Override
    public EntityPlayer getPlayer(MessageContext context)
    {
        if(FMLCommonHandler.instance().getEffectiveSide().isServer())
        {
            return context.getServerHandler().playerEntity;
        }
        else {
            return Minecraft.getMinecraft().thePlayer;
        }
    }

}
