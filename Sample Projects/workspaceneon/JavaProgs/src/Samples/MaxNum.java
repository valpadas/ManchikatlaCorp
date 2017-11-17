package Samples;

public class MaxNum {
	public static int max(int a, int b){
		int result;
		if(a>b)
			result= a;
		else
			result=b;
		return result;
		}
	public static void main(String[] args){
		//MaxNum m=new MaxNum();
		//int a = m.max(10,20);
		//System.out.println(a);
		int n1=12,n2=23;
		int maximum;
		maximum=max(n1,n2);	
	
		System.out.println(maximum);
	}

}
