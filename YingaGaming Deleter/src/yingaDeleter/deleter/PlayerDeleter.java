package yingaDeleter.deleter;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Material;

public class PlayerDeleter {

	public static ArrayList<UUID> uuids = new ArrayList<>();
	public static ArrayList<PlayerDeleter> player = new ArrayList<>();
	
	public static PlayerDeleter getPlayer(UUID u) {
		if(uuids.contains(u)) {
			return player.get(uuids.indexOf(u));
		}else {
			return null;
		}
	}
	
	public int Level;
	public Material m0;
	public Material m1;
	public Material m2;
	public Material m3;
	public Material m4;
	public Material m5;
	public Material m6;
	public Material m7;
	public Material m8;
	public UUID uuid;
	
	
	public PlayerDeleter(UUID uuid,int Level, Material m0, Material m1, Material m2, Material m3, Material m4, Material m5, Material m6, Material m7, Material m8) {
		this.uuid = uuid;
		this.Level = Level;
		this.m0 = m0;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
		this.m6 = m6;
		this.m7 = m7;
		this.m8 = m8;
		
		uuids.add(uuid);
		player.add(this);
		
	}
	
	public ArrayList<Material> getMaterials(){

		ArrayList<Material> mats = new ArrayList<>(); 
		mats.add(m0);
		mats.add(m1);
		mats.add(m2);
		mats.add(m3);
		mats.add(m4);
		mats.add(m5);
		mats.add(m6);
		mats.add(m7);
		mats.add(m8);
		return mats;
	}
	
}
