package yingaDeleter.deleter;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

import yingaDeleter.main.Config;
import yingaDeleter.main.Main;
import yingaDeleter.main.PlayerConfig;

@SuppressWarnings("deprecation")
public class DeleterEventHandler implements Listener {

	
	@EventHandler
	public void openGui(PlayerPickupItemEvent e) {
		Boolean hasDeleter = false;
		if(!e.getItem().getItemStack().hasItemMeta()) {
			if(!Config.getIgnoredItems().contains(e.getItem().getItemStack().getType())) {
				for(ItemStack i :e.getPlayer().getInventory().getContents()){
					if(i != null) {	
						if(i.hasItemMeta() && i.getItemMeta().hasCustomModelData() && i.getItemMeta().getCustomModelData() == Config.getDeleter().getItemMeta().getCustomModelData()) {
							hasDeleter = true;
							break;
						}
					}
				}
				if(hasDeleter) {
					if(PlayerDeleter.getPlayer(e.getPlayer().getUniqueId()).getMaterials().contains(e.getItem().getItemStack().getType())) {
						e.getItem().remove();
						e.setCancelled(true);
					}
				}
			}
		}
	}
	@EventHandler
	public void openGui(InventoryDragEvent e) {
		if(e.getView().getTitle().equals("Deleter")) {
			e.setCancelled(true);
		}
	}
	@EventHandler
	public void openGui(InventoryClickEvent e) {
		if(e.getView().getTitle().equals("Deleter")) {
			if(e.getClick() != ClickType.LEFT) {
				e.setCancelled(true);
			}
			Player p = (Player) e.getWhoClicked();
			if(e.getClick() == ClickType.LEFT) {
			PlayerDeleter player = PlayerDeleter.getPlayer(p.getUniqueId());
			if(e.getRawSlot() < 9*3 ) {
				e.setCancelled(true);
			if(e.getRawSlot() > 9*1-1 && e.getRawSlot() < 9*2) {
				if(e.getCurrentItem() != null) {
						if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasCustomModelData() && e.getCurrentItem().getItemMeta().getCustomModelData() == 999) {
							e.setCancelled(true);
						} else if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasCustomModelData() && e.getCurrentItem().getItemMeta().getCustomModelData() == 998) {
							player.Level++;
							Main.eco.withdrawPlayer(p, Config.getCost(player.Level));
						}else {
							setInvMat(e, e.getCursor().getType(), player);
						}
				}else {
					if(e.getCursor() != null) {
						setInvMat(e, e.getCursor().getType(), player);
					}
				}
				PlayerConfig.save();
				p.openInventory(Gui.create(p));
			}
			}
		}
		}
		
	}
	
	@EventHandler
	public void openGui(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(p.getItemInHand().hasItemMeta() && p.getItemInHand().getItemMeta().hasCustomModelData() && p.getItemInHand().getItemMeta().getCustomModelData() == Config.getDeleter().getItemMeta().getCustomModelData()) {
			p.openInventory(Gui.create(p));
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void placeGui(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		if(p.getItemInHand().hasItemMeta() && p.getItemInHand().getItemMeta().hasCustomModelData() && p.getItemInHand().getItemMeta().getCustomModelData() == Config.getDeleter().getItemMeta().getCustomModelData()) {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void playerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if(PlayerDeleter.getPlayer(p.getUniqueId()) == null) {
			new PlayerDeleter(p.getUniqueId(), 0, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		}
		
		
		PlayerConfig.save();
	}
	
	private static void setInvMat(InventoryClickEvent e, Material m, PlayerDeleter player) {
		if(e.getRawSlot() == 9) {
			player.m0 = m;
		}else if(e.getRawSlot() == 10) {
			player.m1 = m;
		}else if(e.getRawSlot() == 11) {
			player.m2 = m;
		}else if(e.getRawSlot() == 12) {
			player.m3 = m;
		}else if(e.getRawSlot() == 13) {
			player.m4 = m;
		}else if(e.getRawSlot() == 14) {
			player.m5 = m;
		}else if(e.getRawSlot() == 15) {
			player.m6 = m;
		}else if(e.getRawSlot() == 16) {
			player.m7 = m;
		}else if(e.getRawSlot() == 17) {
			player.m8 = m;
		}
	}
	
}
