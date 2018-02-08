import java.util.*;

public class Player {


	public int attack_value;
	public int health_value;
	public int defense_value;
	public ArrayList<Items> inventory = new ArrayList<Items>();
	public Items weapon_item;
	public Items defense_item;
	public Player(int health, int attack, int defense, ArrayList<Items> inv, Items equipped_weapon, Items equipped_defense){
		health_value = health;
		attack_value = attack;
		defense_value = defense;
		inventory = inv;
		weapon_item = equipped_weapon;
		defense_item = equipped_defense; 

	}
	
	
	
	
	
	
	
	
	public void Battle(Player p1, Enemy e1){
		Scanner scan = new Scanner(System.in);
		while(p1.health_value > 0 && e1.health_value >0){
			System.out.println("What do you want to do? \n");
			System.out.println("1) Fight");
			System.out.println("2) Defend");
			String input = scan.next();
			if(input.equals("1")){

				int enemy_damage = weapon_item.item_value + p1.attack_value;
				e1.health_value = e1.health_value - (enemy_damage);
				System.out.println("You did "+enemy_damage+ " damage to the "+ e1.type+" \n" );  
				if(e1.health_value < 1){
					System.out.println("You defeated the "+e1.type+"! \n");
					break;
				}
				
				int player_damage = (e1.attack_value) +(p1.defense_item.item_value/3);
				p1.health_value = p1.health_value - player_damage;
				System.out.println("The "+e1.type+ " did "+ player_damage +" damage to you. Leaving you with "+p1.health_value+" health \n");
				if(p1.health_value < 1){
					System.out.println("You were defeated!");
					break;
				}
				
			}else if(input.equals("2")){
				Initialize init = new Initialize();
				int damage = e1.attack_value-((p1.defense_value)+p1.defense_item.item_value);
				if(damage>0){
					p1.health_value = p1.health_value - (damage);
					System.out.println("The enemy did "+ damage +" damage to you. Leaving you with "+p1.health_value+" health \n");
					if(p1.health_value < 1){
						System.out.println("You have been defeated! \n");
						break;
					}
				}
				
			}else if(input.equals("3")){
				boolean flag = false;
				while(flag == false){
					System.out.println("Special Moves:");
					System.out.println("1. Double hit");
					String choice2 = scan.nextLine();
					if(choice2.equals("1")){
						Initialize init = new Initialize();
						int ran = init.getRandom(1, 3);
						if(ran == 1 || ran==2){
							System.out.println("You hit twice!");
							System.out.println("But you failed....");
							System.out.println("Looks like you are going to get hit twice now! Oops!");
							for(int i=0; i<1; i++){
								int player_damage = (e1.attack_value) +(p1.defense_item.item_value/3);
								p1.health_value = p1.health_value - player_damage;
								System.out.println("The "+e1.type+ " did "+ player_damage +" damage to you. Leaving you with "+p1.health_value+" health \n");
								
							}
							if(p1.health_value < 1){
								System.out.println("You were defeated!");
								break;
							}
							
						}else if(ran==3){
							System.out.println(""); ///////////
						}
					}
				}
				
			}
	
		}
	}
	
	public void equip(ArrayList<Items> inv, Player p1){
		Initialize init = new Initialize();
		ArrayList<String> attackItems = init.getWeaponList();
		ArrayList<String> defenseItems = init.getDefenceList();
		HashMap<String, Integer> attackItemsMap = init.getWeaponMap();
		HashMap<String, Integer> defenseItemsMap = init.getDefenseMap();
		Scanner scan = new Scanner(System.in);
		String choice = "";
		
		
		System.out.println("Current Weapon: "+p1.weapon_item.item);
		System.out.println("Current Armor: "+p1.defense_item.item);
		System.out.println("Your Inventory: ");
		for(int i=0; i<inv.size(); i++){
			System.out.println(inv.get(i).item);
		}
		// finds item in inv
		Boolean flag = false;
		while(flag == false){
			System.out.println("What do you want to equip? ");
			choice = scan.nextLine();
			for(int i=0; i<inv.size(); i++){
				System.out.println("Check: "+i);
				
				System.out.println(choice.equals(inv.get(i).item));
				if(choice.equals(inv.get(i).item)){
					break;
				}
			}
			// figure out the type of item
			
			//attack?
			System.out.println("check2");
			for(int a =0; a<attackItems.size(); a++){
				if(choice.equals(attackItems.get(a))){
					inv.add(p1.weapon_item);	
					Items item = new Items();
					item.item = choice;
					item.item_value = attackItemsMap.get(choice);
					p1.weapon_item = item;
					flag = true;
					
				}
			}
			
			for(int a =0; a<defenseItems.size(); a++){
				if(choice.equals(defenseItems.get(a))){
					inv.add(p1.defense_item);
					Items item = new Items();
					item.item = choice;
					item.item_value = defenseItemsMap.get(choice);
					p1.defense_item = item;
					flag = true;
				}
			}
			
			
		}
		
		System.out.println("Current Weapon: "+p1.weapon_item.item);
		System.out.println("Current Armor: "+p1.defense_item.item);
		
		
	}
	
	
	
	
}
