package yingaDeleter.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Config {
	private static File ConfigFile = new File("plugins/YingaDeleter","config.yml");
	private static YamlConfiguration  ConfigCon = YamlConfiguration.loadConfiguration(ConfigFile);
	
	public static void createConfigs() {
		if(!ConfigFile.exists()) {
			ConfigCon.set("deleter", null);
			ConfigCon.set("deleter.material*", null);
			ConfigCon.set("deleter.displayname", null);
			ConfigCon.set("deleter.lore", null);
			ConfigCon.set("deleter.customModelData*", null);
			
			ConfigCon.set("blank", null);
			ConfigCon.set("blank.material*", null);
			ConfigCon.set("blank.displayname", null);
			ConfigCon.set("blank.lore", null);
			
			ConfigCon.set("available", null);
			ConfigCon.set("available.material*", null);
			ConfigCon.set("available.displayname", null);
			ConfigCon.set("available.lore", null);
			
			ConfigCon.set("unavailable", null);
			ConfigCon.set("unavailable.material*", null);
			ConfigCon.set("unavailable.displayname", null);
			ConfigCon.set("unavailable.lore", null);

			
			ConfigCon.set("l0", null);
			ConfigCon.set("l0.cost*", null);
			ConfigCon.set("l0.miningLevel*", null);
			
			ConfigCon.set("l1", null);
			ConfigCon.set("l1.cost*", null);
			ConfigCon.set("l1.miningLevel*", null);
			
			ConfigCon.set("l2", null);
			ConfigCon.set("l2.cost*", null);
			ConfigCon.set("l2.miningLevel*", null);
			
			ConfigCon.set("l3", null);
			ConfigCon.set("l3.cost*", null);
			ConfigCon.set("l3.miningLevel*", null);
			
			ConfigCon.set("l4", null);
			ConfigCon.set("l4.cost*", null);
			ConfigCon.set("l4.miningLevel*", null);
			
			ConfigCon.set("l5", null);
			ConfigCon.set("l5.cost*", null);
			ConfigCon.set("l5.miningLevel*", null);
			
			ConfigCon.set("l6", null);
			ConfigCon.set("l6.cost*", null);
			ConfigCon.set("l6.miningLevel*", null);
			
			ConfigCon.set("l7", null);
			ConfigCon.set("l7.cost*", null);
			ConfigCon.set("l7.miningLevel*", null);
			
			ConfigCon.set("l8", null);
			ConfigCon.set("l8.cost*", null);
			ConfigCon.set("l8.miningLevel*", null);
			
			
			ConfigCon.set("itemIgnorList", null);
			
			
			try {
				ConfigCon.save(ConfigFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static ItemStack getDeleter() {
		
		ItemStack item = new ItemStack(Material.valueOf(ConfigCon.getString("deleter.material*")));
		ItemMeta itemMeta = item.getItemMeta();
		
		if(ConfigCon.getString("deleter.displayname") != null) {
			itemMeta.setDisplayName(ConfigCon.getString("deleter.displayname"));
		}
		if(ConfigCon.getList("blank.lore") != null) {
			itemMeta.setDisplayName(ConfigCon.getString("deleter.lore"));
			ArrayList<String> lore = new ArrayList<>();
			for(Object o: ConfigCon.getList("deleter.lore")) {
				lore.add(o.toString());
			}
			itemMeta.setLore(lore);
		}
		
		itemMeta.setCustomModelData(ConfigCon.getInt("deleter.customModelData"));
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getAvailable() {
		
		ItemStack item = new ItemStack(Material.valueOf(ConfigCon.getString("available.material*")));
		ItemMeta itemMeta = item.getItemMeta();
		
		if(ConfigCon.getString("available.displayname") != null) {
			itemMeta.setDisplayName(ConfigCon.getString("available.displayname"));
		}
		
		itemMeta.setCustomModelData(998);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getUnavailable() {
		
		ItemStack item = new ItemStack(Material.valueOf(ConfigCon.getString("unavailable.material*")));
		ItemMeta itemMeta = item.getItemMeta();
		
		if(ConfigCon.getString("unavailable.displayname") != null) {
			itemMeta.setDisplayName(ConfigCon.getString("unavailable.displayname"));
		}
		
		itemMeta.setCustomModelData(999);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack getBlank() {
		
		ItemStack item = new ItemStack(Material.valueOf(ConfigCon.getString("blank.material*")));
		ItemMeta itemMeta = item.getItemMeta();
		
		if(ConfigCon.getString("blank.displayname") != null) {
			itemMeta.setDisplayName(ConfigCon.getString("blank.displayname"));
		}
		if(ConfigCon.getList("blank.lore") != null) {
			itemMeta.setDisplayName(ConfigCon.getString("blank.lore"));
			ArrayList<String> lore = new ArrayList<>();
			for(Object o: ConfigCon.getList("blank.lore")) {
				lore.add(o.toString());
			}
			itemMeta.setLore(lore);
		}
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static Double getCost(int Level) {
		return ConfigCon.getDouble("l"+ (Level -1)+".cost*");
	}
	public static int getMiningLevel(int Level) {
		return ConfigCon.getInt("l"+ (Level -1)+".miningLevel*");
	}
	
	public static ArrayList<Material> getIgnoredItems() {
		ArrayList<Material> mats = new ArrayList<>();
		if(ConfigCon.getList("itemIgnorList") != null) {
			for(Object o :ConfigCon.getList("itemIgnorList")) {
				mats.add(Material.valueOf(o.toString()));
			}
		}

		return mats;
		
	}
}
