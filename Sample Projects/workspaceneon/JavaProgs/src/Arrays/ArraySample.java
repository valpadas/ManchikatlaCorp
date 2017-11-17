package Arrays;

public class ArraySample {
	public static void sum(int[] x){
		int total=0;
		for (int i : x) {
			total=total+i;
			
		System.out.println("thesum::"+total);
		}}
	public static void main(String[] args){
		
		int[] x=new int[]{10,20,30};
		sum(x);
		
		
			
		}
	

}
