package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_List1 {

	public static void main(String[] args) {
		ArrayList<String>months = new ArrayList<String>(Arrays.asList("jan","feb","mar","apr","sep","oct","nov","aug"));
		boolean present=months.contains("aug");
		System.out.println("aug month exist"+present);
		boolean check = months.contains("may");
		if(check==false){
			months.add("may");
		}
		int size = months.size();
		System.out.println(size+"=index of total");
		months.add("dec");
		System.out.println(months);
		
		//months.add(size+1, "dec");
		int indexOf = months.indexOf("feb");
		
		System.out.println(indexOf);
		//update may in place of september
		int indexOf2 = months.indexOf("sep");
		int indexOf3 = months.indexOf("may");
		String set = months.set(indexOf2, "may");
		//update sep inplace of may
		months.set(indexOf3, "sep");
		System.out.println(months);
		int indexOf4 = months.indexOf("dec");
		int indexOf5 = months.indexOf("oct");
		months.add(indexOf4, "oct");
		months.remove(indexOf5);
		
		
		
		System.out.println(months);
		
		

	}

}
