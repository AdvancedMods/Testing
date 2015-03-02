package com.advancedmods.testing;

import com.advancedmods.testing.events.CommonPlayerTracker;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.LoaderState;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerAboutToStartEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;
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

        log.info(LoaderState.CONSTRUCTING);
        log.info("Starting PreInit...");
        log.info("Loading Trackers...");
        FMLCommonHandler.instance().bus().register(new CommonPlayerTracker());
        proxy.loadTracker();
        log.info("Trackers loaded");
        log.info(LoaderState.PREINITIALIZATION);
        log.info("PreInit complete");

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {

        log.info("Starting Init...");
        log.info(LoaderState.INITIALIZATION);
        log.info("Init complete");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        log.info("Starting PostInit...");
        log.info(LoaderState.POSTINITIALIZATION);
        log.info("PostInit complete");

    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {

        log.info(LoaderState.AVAILABLE);

    }

    @Mod.EventHandler
    public void serverAboutToStart(FMLServerAboutToStartEvent event) {

        log.info(LoaderState.SERVER_ABOUT_TO_START);

    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {

        log.info(LoaderState.SERVER_STARTING);

    }

    @Mod.EventHandler
    public void serverStarted(FMLServerStartedEvent event) {

        log.info(LoaderState.SERVER_STARTED);

    }

    @Mod.EventHandler
    public void serverStopping(FMLServerStoppingEvent event) {

        log.info(LoaderState.SERVER_STOPPING);

    }

    @Mod.EventHandler
    public void serverStopped(FMLServerStoppedEvent event) {

        log.info(LoaderState.SERVER_STOPPED);

    }

}
