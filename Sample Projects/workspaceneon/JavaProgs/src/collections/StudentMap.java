package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMap {
	public static void main(String[] args){
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1,"bangaram");
		map.put(2,"anusha");
		map.put(3,"venu");
		map.put(4,"anu");
		HashMap<Integer,Integer> marks=new HashMap<Integer,Integer>();
		marks.put(1, 70);
		marks.put(2,80);
		marks.put(3,90);
		marks.put(4,100);
		 Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		for (Integer obj : keySet) {
			
			
			System.out.println("name:::"+map.get(obj)+"   marks"+marks.get(obj));
			
		}
	
		
		
		
	}

}
