package com.advancedmods.testing.utilities;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.client.Minecraft;

/**
 * This will move to AMCore!
 * Created by Dennisbonke on 2-3-2015.
 *
 * @author Dennis Bonke
 * @since 1.0
 */
public class ServerChecker {

    public static Object ServerType;

    public void CheckServerType() {

        if (Minecraft.getMinecraft().isSingleplayer()) {

            ServerType = EnumServerType.INTEGRATED;

        }
        else if (!Minecraft.getMinecraft().isSingleplayer()) {

            ServerType = EnumServerType.DEDICATED;

        }
        else {

            ServerType = EnumServerType.UNKNOWN;
            FMLLog.bigWarning("Could not determine which server you are on!");

        }

    }

}
