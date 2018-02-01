import java.util.*;

public class Player {


	public int attack_value;
	public int health_value;
	public int defense_value;

	public Player(int health, int attack, int defense, ArrayList<String> inv){
		int attack_value = attack;
		int defense_value = defense;
		ArrayList<String> inventory = inv;
	}
	
	public void Battle(Player p1, Enemy e1){
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to do?");
		System.out.println("Fight");
		System.out.println("Defend");
		String input = scan.next();
		if(input.equals("Fight")){
			e1.health_value = e1.health_value - p1.attack_value;
			System.out.println("You did "+p1.attack_value+ " to the enemy");
			p1.health_value = p1.health_value - e1.attack_value;
			System.out.println("The enemy did "+ e1.attack_value +" damage to you");
		}else if(input.equals("Defend")){
			int damage = e1.attack_value-p1.defense_value;
			p1.health_value = p1.health_value - (damage);
			System.out.println("The enemy did "+ damage +" to you");
		}
	}
	
}
