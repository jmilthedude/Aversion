package net.thedudemc.aversion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedudemc.aversion.init.InitConfig;

@Mod(modid = Aversion.MODID, name = Aversion.NAME, version = Aversion.VERSION, serverSideOnly = true, acceptableRemoteVersions = "*")
public class Aversion {

	@Mod.Instance
	private static Aversion INSTANCE;

	public static final String MODID = "aversion";
	public static final String NAME = "Aversion";
	public static final String VERSION = "1.0";

	private static Logger LOG = LogManager.getLogger(Aversion.NAME);

	@Mod.EventHandler
	public void onPreInitialization(FMLPreInitializationEvent event) {
	}

	@Mod.EventHandler
	public void onInitialization(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public void onPostInitialization(FMLPostInitializationEvent event) {
		InitConfig.registerConfigs();
	}

	public static Aversion getInstance() {
		return INSTANCE;
	}

	public static ResourceLocation getResource(String name) {
		return new ResourceLocation(Aversion.MODID, name);
	}
}
