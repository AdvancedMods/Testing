package com.advancedmods.testing.utilities;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;

/**
 * This will move to AMCore!
 * Created by Dennisbonke on 2-3-2015.
 *
 * @author Dennis Bonke
 * @since 1.0
 */
public class SideChecker {

    public void CheckSide() {

        Side side;
        if (Minecraft.getMinecraft().isSingleplayer()) {

            side = Side.CLIENT;

        } else if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {

            side = Side.CLIENT;

        } else if (FMLCommonHandler.instance().getSide() == Side.SERVER) {

            side = Side.SERVER;

        } else {

            side = Side.SERVER;

        }

    }

}
