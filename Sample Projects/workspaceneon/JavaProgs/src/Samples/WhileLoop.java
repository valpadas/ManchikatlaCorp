package Samples;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter no  : ");
		int n = s.nextInt();
		int i = 10;
		System.out.println("the natural no's are : ");
		while (i <= n) {
			System.out.println(i);
			i++;}
		System.out.println("the even no's are : ");
		i = 0;
		while(i<=n){
			System.out.println(i);
			i=i+2;}
		System.out.println("the odd no's are : ");
		i=1;
		while(i<=n){
			System.out.println(i);
			i+=2;
			
		}

	}

}
