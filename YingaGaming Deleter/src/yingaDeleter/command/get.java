package yingaDeleter.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import yingaDeleter.main.Config;

public class get implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("yinga.deleter.get")) {
				p.getInventory().addItem(Config.getDeleter());
			}
		}
		
		return false;
	}

}
