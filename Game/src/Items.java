import java.util.ArrayList;
import java.util.HashMap;


public class Items {
	
	public String item;
	public int item_value;
	
	public Items(){
		Initialize init = new Initialize();
		HashMap<String, Integer> weaponsMap = init.getWeaponMap(); 
		HashMap<String, Integer> defenceMap = init.getDefenseMap();
		ArrayList<String> weaponsList = init.getWeaponList();
		ArrayList<String> defenceList = init.getDefenceList();
		
		int choice = init.getRandom(1, 3);
		if(choice == 1){
			int choice2 = init.getRandom(0, 9);
			item = weaponsList.get(choice2);
			item_value = weaponsMap.get(item);
		}else if(choice ==2){
			int choice2 = init.getRandom(0, 9);
			item = defenceList.get(choice2);
			item_value = defenceMap.get(item);
		}else if(choice ==3){
			int choice2 =init.getRandom();
			item = 
			item_value
		}
		
		
		
		
	}
	
}
