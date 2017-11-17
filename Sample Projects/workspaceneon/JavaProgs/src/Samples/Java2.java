/*WRITE APROG TO ACCEPT TO TWO NOS THEN DISPLAY THE HIGHEST NO*/
package Samples;

import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b;
		System.out.println("enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		//System.out.println("enter two numbers");
		if(a>b){
			System.out.println("max no is a  :" +a);
			}
		else{
			System.out.println("max no is b  :" +b);
		}
		

	}

}
