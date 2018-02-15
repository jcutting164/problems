import java.util.ArrayList;


public class Exec {
	public static void main(String[] args){
		ArrayList<Items> inv = new ArrayList<Items>();
		
		Items first = new Items();
		first.item = "Sword";
		first.item_value = 1;
		
		Items second = new Items();
		second.item = "Leather-Jacket";
		second.item_value = 1;
		
		Player player1 = new Player(1, 100, 5, inv, first, second);
		int round = 0;
		Scanner scan = new Scanner();
		while(player1.health_value > 0){
			Enemy enemy1 = new Enemy();
			System.out.println("Do you want to equip an item? (yes/no)");
			String response = scan.next();
			if(response.equals("yes")){
				player1.equip(inv, player1);
			}
			System.out.println(enemy1.size+ " "+enemy1.color+" "+enemy1.type);
			System.out.println("Health: "+ enemy1.health_value);
			player1.Battle(player1, enemy1);
			round++
		}
		System.out.println("You lasted "+round+" rounds");
	}
}
