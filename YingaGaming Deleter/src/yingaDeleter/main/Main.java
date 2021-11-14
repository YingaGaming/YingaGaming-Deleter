package yingaDeleter.main;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import net.milkbowl.vault.economy.Economy;
import yingaDeleter.command.get;
import yingaDeleter.deleter.DeleterEventHandler;

public class Main extends JavaPlugin{

	public Logger logger = getLogger();
	public static Economy eco;
	
	
	@Override
	public void onEnable() {

		if(!setupEconomy()) {
			getLogger().warning(ChatColor.RED +"Vault isn't installing");
			getServer().getPluginManager().disablePlugin(this);
			return;
		}
		if(!setupMcMMO()) {
			getLogger().warning(ChatColor.RED +"mcMMO isn't installing");
			getServer().getPluginManager().disablePlugin(this);
			return;
		}
		Config.createConfigs();
		PlayerConfig.createConfigs();
		PlayerConfig.Load();
		
		getCommand("Deleter").setExecutor(new get());
		getServer().getPluginManager().registerEvents(new DeleterEventHandler(), this);
		
		logger.info(ChatColor.GREEN + "enable");
	}
	
	@Override
	public void onDisable() {
		logger.info(ChatColor.RED + "disable");
	}
	  private boolean setupEconomy() {
	        if (getServer().getPluginManager().getPlugin("Vault") == null) {
	            return false;
	        }
	        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
	        if (rsp == null) {
	            return false;
	        }
	        eco = rsp.getProvider();
	        return eco != null;
	    }
	  
	  private boolean setupMcMMO() {
	        if (getServer().getPluginManager().getPlugin("mcMMO") == null) {
	            return false;
	        }
	        return true;
	    }
}
