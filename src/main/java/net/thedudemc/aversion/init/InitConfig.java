package net.thedudemc.aversion.init;

import net.thedudemc.aversion.config.ConfigPlayers;

public class InitConfig {

	public static ConfigPlayers CONFIG_PLAYERS = null;

	public static void registerConfigs() {
		CONFIG_PLAYERS = (ConfigPlayers) new ConfigPlayers().readConfig();
	}

}
