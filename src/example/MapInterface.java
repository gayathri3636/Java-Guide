package example;
import java.util.*;
public class MapInterface {

	public static void main(String[] args) {
//Map Interface-----------represents keyvalue pair
		Map<String, String> map = new HashMap<>();
		map.put("myName", "Gayathri");
		map.put("actor", "john");
		map.put("ceo", "johncena");
		System.out.println(map);
	}

}
