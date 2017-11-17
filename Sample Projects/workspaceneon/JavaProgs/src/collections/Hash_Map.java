package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(5,"anusha");
		map.put(6, "bangaram");
		map.put(12,"xyz");
		map.put(21,"g");
		map.put(23,"qwerty");
		String string = map.get(12);
		System.out.println(string);
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		

	}

}
