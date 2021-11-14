package yingaDeleter.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;

import yingaDeleter.deleter.PlayerDeleter;

public class PlayerConfig {

	private static File ConfigFile = new File("plugins/YingaDeleter","PlayerData.yml");
	private static YamlConfiguration  ConfigCon = YamlConfiguration.loadConfiguration(ConfigFile);
	
	public static void createConfigs() {
		if(!ConfigFile.exists()) {
			ConfigCon.set("players", null);
		}
		try {
			ConfigCon.save(ConfigFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void Load() {
		if(ConfigCon.getList("players") != null) {
			for(Object o :ConfigCon.getList("players")) {
				String[] s = o.toString().split("#");
				new PlayerDeleter(UUID.fromString(s[0]), Integer.valueOf(s[1]), Material.valueOf(s[2]), Material.valueOf(s[3]), Material.valueOf(s[4]), Material.valueOf(s[5]), Material.valueOf(s[6]), Material.valueOf(s[7]), Material.valueOf(s[8]),Material.valueOf(s[9]), Material.valueOf(s[10]));
			}
		}
	}
	public static void save() {
		ArrayList<String> Strings = new ArrayList<>();
		for(PlayerDeleter p : PlayerDeleter.player) {
			String s = p.uuid.toString() + "#" + p.Level + "#" + p.m0.toString()+ "#" + p.m1.toString() + "#" + p.m2.toString() + "#" + p.m3.toString() + "#" + p.m4.toString() + "#" + p.m5.toString() + "#" + p.m6.toString()+ "#" + p.m7.toString() + "#" + p.m8.toString();
			Strings.add(s);
		}
		ConfigCon.set("players", Strings);
		try {
			ConfigCon.save(ConfigFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
