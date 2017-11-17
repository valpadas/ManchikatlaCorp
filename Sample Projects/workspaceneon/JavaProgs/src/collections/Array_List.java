package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_List {
	public static void main(String[] args){

	ArrayList<String> list = new ArrayList<String>();
	list.add("x");
	list.add("y");
	list.add(null);
	list.add("z");
	list.addAll(Arrays.asList("anu","bangaram","a","b"));
	System.out.println(list);
	System.out.println(Arrays.asList("j","f"));
	System.out.println(list.get(1));
	System.out.println(list.isEmpty());
	list.add(1, "abz");
	//for updating
	list.set(1, "venu");
	System.out.println(list);
	String remove = list.remove(0);
	System.out.println(list);
	System.out.println(list.indexOf("y"));
     System.out.println(list.contains("venu"));
}
}