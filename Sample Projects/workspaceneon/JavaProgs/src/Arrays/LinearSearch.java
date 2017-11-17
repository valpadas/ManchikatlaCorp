package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {
	public void searchingForNo(int[] array, int target){

		for (int i = 0; i < array.length; i++) {
		
			if(array[i]==target){
				System.out.println("targated element::"+array[i]);
			} // if end
			 	
		} //for close
		Arrays.sort(array);

	}
		
	public static void main(String[] args){
		LinearSearch l=new LinearSearch();
		int[] array1={10,7,8,9};
		int target=7;
		l.searchingForNo(array1, target);
		
		
		
		
	}

}
