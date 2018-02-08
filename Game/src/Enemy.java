import java.util.ArrayList;
import java.util.HashMap;

public class Enemy {
	public int health_value;
	public int attack_value;
	public int defense_value;
	public String size;
	public String color;
	public String type;

	public Enemy(){
		
		// size = health
		// type = attack
		// color = defense
		Initialize init = new Initialize();
		HashMap<String, Integer> size_map = init.getSizeMap();
		HashMap<String, Integer> color_map = init.getColorMap();
		HashMap<String, Integer> type_map = init.getTypeMap();
		ArrayList<String> size_list = init.getSizeList();
		ArrayList<String> color_list = init.getColorList();
		ArrayList<String> type_list = init.getTypeList();
		
		int sizeValue = init.getRandom(0, 9);
		int colorValue = init.getRandom(0, 9);
		int typeValue = init.getRandom(0, 9);
		
		size = size_list.get(sizeValue);
		color = color_list.get(colorValue);
		type = type_list.get(typeValue);
		
		
		attack_value = type_map.get(type);
		defense_value = color_map.get(color);
		health_value = size_map.get(size);
		
	}
}
