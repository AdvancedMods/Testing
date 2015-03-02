package com.advancedmods.testing;

import com.advancedmods.testing.events.CommonPlayerTracker;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerAboutToStartEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main class for AMTesting
 * Created by Dennisbonke on 28-2-2015.
 *
 * @author Dennis Bonke
 * @since 1.0
 */
@Mod(name = Testing.name, modid = Testing.modid, version = Testing.version, modLanguage = "java", canBeDeactivated = false)
public class Testing {

    public static final String name = "Testing";
    public static final String modid = "testing";
    public static final String version = "1.0";
    public static Logger log = LogManager.getLogger("AMTesting");
    @SidedProxy(clientSide = "com.advancedmods.testing.ClientProxy", serverSide = "com.advancedmods.testing.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        log.info("Starting PreInit...");
        log.info("Loading Trackers...");
        FMLCommonHandler.instance().bus().register(new CommonPlayerTracker());
        proxy.loadTracker();
        log.info("Trackers loaded");
        log.info("PreInit complete");

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {

        log.info("Starting Init...");
        log.info("Init complete");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        log.info("Starting PostInit...");
        log.info("PostInit complete");

    }

    @Mod.EventHandler
    public void serverStarting(FMLServerAboutToStartEvent event) {

        if (event.getSide().isClient()) {
            log.info("Integrated Server");
        } else {
            log.info("Dedicated Server");
        }

    }

}
