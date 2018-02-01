import java.util.ArrayList;


public class Exec {
	public static void main(String[] args){
		ArrayList<String> inv = new ArrayList<String>();
		Player p1 = new Player(10, 5, 5, inv);
		Enemy e1 = new Enemy(10, 5, 5);
		p1.Battle(p1, e1);
	}
}
