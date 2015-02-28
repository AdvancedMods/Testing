package com.advancedmods.testing;

import com.advancedmods.testing.events.PlayerTracker;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Dennisbonke on 28-2-2015.
 */
@Mod(name = Testing.name, modid = Testing.modid, version = Testing.version, modLanguage = "java", canBeDeactivated = false)
public class Testing {

    public static final String name = "Testing";
    public static final String modid = "testing";
    public static final String version = "1.0";
    public EntityPlayer player;
    public static Logger log = LogManager.getLogger("AMTesting");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        log.info("Starting PreInit...");
        log.info("PreInit complete");

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {

        log.info("Starting Init...");
        log.info("Registering events...");
        MinecraftForge.EVENT_BUS.register(new PlayerTracker(player));
        log.info("Events registered");
        log.info("Init complete");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        log.info("Starting PostInit...");
        log.info("PostInit complete");

    }

}
