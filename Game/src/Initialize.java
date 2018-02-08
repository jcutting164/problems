import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Initialize {
	
	public Initialize(){
		
	}
	
	public HashMap<String, Integer> getSizeMap(){
		HashMap<String, Integer> size = new HashMap<String, Integer>();
		size.put("Little", 1);
		size.put("Small", 2);
		size.put("Tiny", 3);
		size.put("Average", 4);
		size.put("Tall", 5);
		size.put("Big", 6);
		size.put("Fat", 7);
		size.put("Huge", 8);
		size.put("Mammoth", 9);
		size.put("Giant", 10);
		return size;
	}
	
	public HashMap<String, Integer> getColorMap(){
		HashMap<String, Integer> color = new HashMap<String, Integer>();
		color.put("Pink", 1);
		color.put("Red", 2);
		color.put("Orange", 3);
		color.put("Yellow", 4);
		color.put("Green", 5);
		color.put("Light Blue", 6);
		color.put("Blue", 7);
		color.put("Dark Blue", 8);
		color.put("Purple", 9);
		color.put("Dark Purple", 10);
		
		return color;
	}
	
	public HashMap<String, Integer> getTypeMap(){
		HashMap<String, Integer> type = new HashMap<String, Integer>();
		type.put("Dwarf", 1);
		type.put("Elf", 2);
		type.put("Ghost", 3);
		type.put("Cyclops", 4);
		type.put("Golem", 5);
		type.put("Dragon", 6);
		type.put("Demon", 7);
		type.put("Griffin", 8);
		type.put("Phoenix", 9);
		type.put("Wendigo", 10);
		return type;
	}
	
	public ArrayList<String> getSizeList(){
		ArrayList<String> size = new ArrayList<String>();
		size.add("Little");
		size.add("Small");
		size.add("Tiny");
		size.add("Average");
		size.add("Tall");
		size.add("Big");
		size.add("Fat");
		size.add("Huge");
		size.add("Mammoth");
		size.add("Giant");
		return size;
	}
	
	public ArrayList<String> getColorList(){
		ArrayList<String> color = new ArrayList<String>();
		color.add("Pink");
		color.add("Red");
		color.add("Orange");
		color.add("Yellow");
		color.add("Green");
		color.add("Light Blue");
		color.add("Blue");
		color.add("Dark Blue");
		color.add("Purple");
		color.add("Dark Purple");
		return color;
	}
	
	public ArrayList<String> getTypeList(){
		ArrayList<String> type = new ArrayList<String>();
		type.add("Dwarf");
		type.add("Elf");
		type.add("Ghost");
		type.add("Cyclops");
		type.add("Golem");
		type.add("Dragon");
		type.add("Demon");
		type.add("Griffin");
		type.add("Phoenix");
		type.add("Wendigo");
		return type;
	}
	
	
	
	
	
	
	public HashMap<String, Integer> getWeaponMap(){
		HashMap<String, Integer> weapons = new HashMap<String, Integer>();
		weapons.put("Sword", 1);
		weapons.put("Axe", 2);
		weapons.put("Knife", 3);
		weapons.put("Nun-chucks", 4);
		weapons.put("Iron-sword", 5);
		weapons.put("Sledge-hammar", 6);
		weapons.put("Brass-Knuckles", 7);
		weapons.put("Lance", 8);
		weapons.put("Mace", 9);
		weapons.put("Katana", 10);
		return weapons;
	}
	
	public HashMap<String, Integer> getDefenseMap(){
		HashMap<String, Integer> defences = new HashMap<String, Integer>();
		defences.put("Leather-Jacket", 1);
		defences.put("Chainmail", 2);
		defences.put("Plate-Armor", 3);
		defences.put("Iron-Armor", 4);
		defences.put("Hardhat", 5);
		defences.put("Timbs", 6);
		defences.put("LLBean Gloves", 7);
		defences.put("Scarf", 8);
		defences.put("Fisherman-vest", 9);
		defences.put("Sunglasses", 10);
		
		return defences;
	}
	
	
	
	public ArrayList<String> getWeaponList(){
		ArrayList<String> weapons = new ArrayList<String>();
		weapons.add("Sword");
		weapons.add("Axe");
		weapons.add("Knife");
		weapons.add("Nun-chucks");
		weapons.add("Iron-sword");
		weapons.add("Sledge-hammar");
		weapons.add("Brass-Knuckles");
		weapons.add("Lance");
		weapons.add("Mace");
		weapons.add("Katana");
		return weapons;
	}
	
	public ArrayList<String> getDefenceList(){
		ArrayList<String> defences = new ArrayList<String>();
		defences.add("Leather-Jacket");
		defences.add("Chainmail");
		defences.add("Plate-Armor");
		defences.add("Iron-Armor");
		defences.add("Hardhat");
		defences.add("Timbs");
		defences.add("LLBean Gloves");
		defences.add("Scarf");
		defences.add("Fisherman-vest");
		defences.add("Sunglasses");
		return defences;
	}
	
	
	
	
	public int getRandom(int low, int high){
		Random rand = new Random();
		int  n = rand.nextInt(high) + low;
		return n;
		
	}
	
	
}
