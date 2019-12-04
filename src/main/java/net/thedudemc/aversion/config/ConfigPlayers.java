package net.thedudemc.aversion.config;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class ConfigPlayers extends Config {

	@Expose
	public List<String> PLAYERS = new ArrayList<String>();

	@Override
	public String getLocation() {
		return "players.json";
	}

	@Override
	protected void resetConfig() {
		this.PLAYERS.add("jmilthedude");
	}

}
