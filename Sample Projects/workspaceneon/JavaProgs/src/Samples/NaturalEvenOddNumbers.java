package Samples;

import java.util.Scanner;

public class NaturalEvenOddNumbers {
	public static void main(String[] args) {
		int n, b;
		Scanner s = new Scanner(System.in);

		System.out.println("enter no n : ");
		n = s.nextInt();

		for (b = 0; b <= n; b++) {

			System.out.println(b);
			}
		System.out.println("enter even no's are");
		for(b=0;b<=n;b+=2){
			System.out.println(b);
			
		}
		for (b=1;b<=n;b+=2){
			System.out.println(b);
		}
			
		}
	
	
	}
	


