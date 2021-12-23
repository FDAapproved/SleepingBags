package ru.npo6ka.sleepingbag;

import ru.npo6ka.sleepingbag.proxy.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import org.apache.logging.log4j.*;

@Mod(modid = "sleepingbag", version = "0.1.1")
public class Core
{
    public static final String MODID = "sleepingbag";
    public static final String VERSION = "GRADLETOKEN_VERSION";
    public static final Logger LOGGER;
    @Mod.Instance
    public static Core INSTANCE;
    @SidedProxy(clientSide = "ru.npo6ka.sleepingbag.proxy.ClientProxy", serverSide = "ru.npo6ka.sleepingbag.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent e) {
        Core.proxy.preInit();
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent e) {
        Core.proxy.init();
    }
    
    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent e) {
        Core.proxy.postInit();
    }
    
    static {
        LOGGER = LogManager.getLogger("sleepingbag");
    }
}
