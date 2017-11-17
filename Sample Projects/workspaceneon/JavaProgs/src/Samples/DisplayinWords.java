package Samples;

import java.util.Scanner;

public class DisplayinWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("enter number a= ");
		a = s.nextInt();
		switch (a) {
		case 1:
			System.out.println("one");
			break;

		case 2:
			System.out.println("two");
			// break;
		default:
			System.out.println("num");

		}

	}

}
