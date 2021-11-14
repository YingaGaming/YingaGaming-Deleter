package yingaDeleter.deleter;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import yingaDeleter.main.Config;
import yingaDeleter.main.Main;
import com.gmail.nossr50.api.ExperienceAPI;
import com.gmail.nossr50.datatypes.skills.PrimarySkillType;

public class Gui {

	public static Inventory create(Player p) {
		
		Inventory inv =  Bukkit.createInventory(null, 9*3, "Deleter");
		
		for(int i = 0; i<9*1; i++) {
			inv.setItem(i, Config.getBlank());
			inv.setItem(i+18, Config.getBlank());
		}
		
		PlayerDeleter player = PlayerDeleter.getPlayer(p.getUniqueId());
		
		for(int i = 0; i<9*1; i++) {
			inv.setItem(i, Config.getBlank());
			inv.setItem(i+18, Config.getBlank());
		}
		

		if(player.Level >= 1) {
			inv.setItem(9,new ItemStack(player.m0));
		}else if(player.Level == 0) {
			if(Main.eco.getBalance(p) >= Config.getCost(1) && ExperienceAPI.getLevel(p, PrimarySkillType.MINING) >= Config.getMiningLevel(1)) {
				ItemStack item = Config.getAvailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.GREEN + "Mining Level: " + Config.getMiningLevel(1));
				s.add(ChatColor.GREEN + "Cost: " + Config.getCost(1));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(9, item);
			}else {
				ItemStack item = Config.getUnavailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(1));
				s.add(ChatColor.RED + "Cost: " + Config.getCost(1));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(9, item);
			}
		}else {
			ItemStack item = Config.getUnavailable();
			ItemMeta itemMeta= item.getItemMeta();
			ArrayList<String> s = new ArrayList<>();
			s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(1));
			s.add(ChatColor.RED + "Cost: " + Config.getCost(1));
			itemMeta.setLore(s);
			item.setItemMeta(itemMeta);
			inv.setItem(9, item);
		}
		
		
		if(player.Level >= 2) {
			inv.setItem(10,new ItemStack(player.m1));
		}else if(player.Level == 1) {
			if(Main.eco.getBalance(p) >= Config.getCost(2) && ExperienceAPI.getLevel(p, PrimarySkillType.MINING) >= Config.getMiningLevel(2)) {
				ItemStack item = Config.getAvailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.GREEN + "Mining Level: " + Config.getMiningLevel(2));
				s.add(ChatColor.GREEN + "Cost: " + Config.getCost(2));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(10, item);
			}else {
				ItemStack item = Config.getUnavailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(2));
				s.add(ChatColor.RED + "Cost: " + Config.getCost(2));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(10, item);
			}
		}else {
			ItemStack item = Config.getUnavailable();
			ItemMeta itemMeta= item.getItemMeta();
			ArrayList<String> s = new ArrayList<>();
			s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(2));
			s.add(ChatColor.RED + "Cost: " + Config.getCost(2));
			itemMeta.setLore(s);
			item.setItemMeta(itemMeta);
			inv.setItem(10, item);
		}
		
		
		if(player.Level >= 3) {
			inv.setItem(11,new ItemStack(player.m2));
		}else if(player.Level == 2) {
			if(Main.eco.getBalance(p) >= Config.getCost(3) && ExperienceAPI.getLevel(p, PrimarySkillType.MINING) >= Config.getMiningLevel(3)) {
				ItemStack item = Config.getAvailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.GREEN + "Mining Level: " + Config.getMiningLevel(3));
				s.add(ChatColor.GREEN + "Cost: " + Config.getCost(3));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(11, item);
			}else {
				ItemStack item = Config.getUnavailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(3));
				s.add(ChatColor.RED + "Cost: " + Config.getCost(3));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(11, item);
			}
		}else {
			ItemStack item = Config.getUnavailable();
			ItemMeta itemMeta= item.getItemMeta();
			ArrayList<String> s = new ArrayList<>();
			s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(3));
			s.add(ChatColor.RED + "Cost: " + Config.getCost(3));
			itemMeta.setLore(s);
			item.setItemMeta(itemMeta);
			inv.setItem(11, item);
		}
		
		
		if(player.Level >= 4) {
			inv.setItem(12,new ItemStack(player.m3));
		}else if(player.Level == 3) {
			if(Main.eco.getBalance(p) >= Config.getCost(4) && ExperienceAPI.getLevel(p, PrimarySkillType.MINING) >= Config.getMiningLevel(4)) {
				ItemStack item = Config.getAvailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.GREEN + "Mining Level: " + Config.getMiningLevel(4));
				s.add(ChatColor.GREEN + "Cost: " + Config.getCost(4));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(12, item);
			}else {
				ItemStack item = Config.getUnavailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(4));
				s.add(ChatColor.RED + "Cost: " + Config.getCost(4));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(12, item);
			}
		}else {
			ItemStack item = Config.getUnavailable();
			ItemMeta itemMeta= item.getItemMeta();
			ArrayList<String> s = new ArrayList<>();
			s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(4));
			s.add(ChatColor.RED + "Cost: " + Config.getCost(4));
			itemMeta.setLore(s);
			item.setItemMeta(itemMeta);
			inv.setItem(12, item);
		}
		
		
		if(player.Level >= 5) {
			inv.setItem(13,new ItemStack(player.m4));
		}else if(player.Level == 4) {
			if(Main.eco.getBalance(p) >= Config.getCost(5) && ExperienceAPI.getLevel(p, PrimarySkillType.MINING) >= Config.getMiningLevel(5)) {
				ItemStack item = Config.getAvailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.GREEN + "Mining Level: " + Config.getMiningLevel(5));
				s.add(ChatColor.GREEN + "Cost: " + Config.getCost(5));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(13, item);
			}else {
				ItemStack item = Config.getUnavailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(5));
				s.add(ChatColor.RED + "Cost: " + Config.getCost(5));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(13, item);
			}
		}else {
			ItemStack item = Config.getUnavailable();
			ItemMeta itemMeta= item.getItemMeta();
			ArrayList<String> s = new ArrayList<>();
			s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(5));
			s.add(ChatColor.RED + "Cost: " + Config.getCost(5));
			itemMeta.setLore(s);
			item.setItemMeta(itemMeta);
			inv.setItem(13, item);
		}
		
		
		if(player.Level >= 6) {
			inv.setItem(14,new ItemStack(player.m5));
		}else if(player.Level == 5) {
			if(Main.eco.getBalance(p) >= Config.getCost(6) && ExperienceAPI.getLevel(p, PrimarySkillType.MINING) >= Config.getMiningLevel(6)) {
				ItemStack item = Config.getAvailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.GREEN + "Mining Level: " + Config.getMiningLevel(6));
				s.add(ChatColor.GREEN + "Cost: " + Config.getCost(6));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(14, item);
			}else {
				ItemStack item = Config.getUnavailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(6));
				s.add(ChatColor.RED + "Cost: " + Config.getCost(6));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(14, item);
			}
		}else {
			ItemStack item = Config.getUnavailable();
			ItemMeta itemMeta= item.getItemMeta();
			ArrayList<String> s = new ArrayList<>();
			s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(6));
			s.add(ChatColor.RED + "Cost: " + Config.getCost(6));
			itemMeta.setLore(s);
			item.setItemMeta(itemMeta);
			inv.setItem(14, item);
		}
		
		
		if(player.Level >= 7) {
			inv.setItem(15,new ItemStack(player.m6));
		}else if(player.Level == 6) {
			if(Main.eco.getBalance(p) >= Config.getCost(7) && ExperienceAPI.getLevel(p, PrimarySkillType.MINING) >= Config.getMiningLevel(7)) {
				ItemStack item = Config.getAvailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.GREEN + "Mining Level: " + Config.getMiningLevel(7));
				s.add(ChatColor.GREEN + "Cost: " + Config.getCost(7));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(15, item);
			}else {
				ItemStack item = Config.getUnavailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(7));
				s.add(ChatColor.RED + "Cost: " + Config.getCost(7));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(15, item);
			}
		}else {
			ItemStack item = Config.getUnavailable();
			ItemMeta itemMeta= item.getItemMeta();
			ArrayList<String> s = new ArrayList<>();
			s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(7));
			s.add(ChatColor.RED + "Cost: " + Config.getCost(7));
			itemMeta.setLore(s);
			item.setItemMeta(itemMeta);
			inv.setItem(15, item);
		}
		
		
		if(player.Level >= 8) {
			inv.setItem(16,new ItemStack(player.m7));
		}else if(player.Level == 7) {
			if(Main.eco.getBalance(p) >= Config.getCost(8) && ExperienceAPI.getLevel(p, PrimarySkillType.MINING) >= Config.getMiningLevel(8)) {
				ItemStack item = Config.getAvailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.GREEN + "Mining Level: " + Config.getMiningLevel(8));
				s.add(ChatColor.GREEN + "Cost: " + Config.getCost(8));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(16, item);
			}else {
				ItemStack item = Config.getUnavailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(8));
				s.add(ChatColor.RED + "Cost: " + Config.getCost(8));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(16, item);
			}
		}else {
			ItemStack item = Config.getUnavailable();
			ItemMeta itemMeta= item.getItemMeta();
			ArrayList<String> s = new ArrayList<>();
			s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(8));
			s.add(ChatColor.RED + "Cost: " + Config.getCost(8));
			itemMeta.setLore(s);
			item.setItemMeta(itemMeta);
			inv.setItem(16, item);
		}
		
		
		if(player.Level >= 9) {
			inv.setItem(17,new ItemStack(player.m8));
		}else if(player.Level == 8) {
			if(Main.eco.getBalance(p) >= Config.getCost(9) && ExperienceAPI.getLevel(p, PrimarySkillType.MINING) >= Config.getMiningLevel(9)) {
				ItemStack item = Config.getAvailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.GREEN + "Mining Level: " + Config.getMiningLevel(9));
				s.add(ChatColor.GREEN + "Cost: " + Config.getCost(9));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(17, item);
			}else {
				ItemStack item = Config.getUnavailable();
				ItemMeta itemMeta= item.getItemMeta();
				ArrayList<String> s = new ArrayList<>();
				s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(9));
				s.add(ChatColor.RED + "Cost: " + Config.getCost(9));
				itemMeta.setLore(s);
				item.setItemMeta(itemMeta);
				inv.setItem(17, item);
			}
		}else {
			ItemStack item = Config.getUnavailable();
			ItemMeta itemMeta= item.getItemMeta();
			ArrayList<String> s = new ArrayList<>();
			s.add(ChatColor.RED + "Mining Level: " + Config.getMiningLevel(9));
			s.add(ChatColor.RED + "Cost: " + Config.getCost(9));
			itemMeta.setLore(s);
			item.setItemMeta(itemMeta);
			inv.setItem(17, item);
		}
		
		return inv;
	}

}
