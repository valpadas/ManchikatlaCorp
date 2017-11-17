package Samples;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter no : ");
	int n=s.nextInt();
	int i=0;
	System.out.println("the natural no's are");
	do{
		System.out.println(i);
		i++;
	}
	while(i<=n);
	System.out.println("the even no's are :");
	i=0;
	do{
		System.out.println(i);
		i+=2;
		}while(i<=n);
	System.out.println("the odd no's are : ");
	i=1;
	do{
		System.out.println(i);
		i=i+2;
	}while(i<=n);
	
	

	}

}
