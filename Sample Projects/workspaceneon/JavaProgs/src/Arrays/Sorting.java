package Arrays;

import java.util.Arrays;

public class Sorting {
	
	public int[] printArray(int[] array) {
		System.out.println("array elements" + array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println("index="+i);
			System.out.println(array[i]);
		}
	    
	      return array;

	}

	public static void main(String[] args) {
		Sorting s=new Sorting();
		//array initialization
		int[] array1 = { 10, 8, -1, -10, -6, 90 };
		int[] print = s.printArray(array1);
		
		
		//sirting ofnarray
		Arrays.sort(print);
		System.out.println("********************"+Arrays.toString(print));
		 //s.printArray(print);
		 int binarySearch = Arrays.binarySearch(print, 11);
		 System.out.println(binarySearch);
		

	}

}
