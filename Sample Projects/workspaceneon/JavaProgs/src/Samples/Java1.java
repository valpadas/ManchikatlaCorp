package Samples;

import java.util.Scanner;

public class Java1 {
	static int sno,m,p,c,total,avg;
	static String sname;
	
	public static void main(String[] args){
		//int sno,sname,m,p,so,total,avg;
		Scanner s=new Scanner(System.in);
		System.out.println("enter sno :");
		sno=s.nextInt();
	 
		System.out.println("enter values m,p,c");
		m=s.nextInt();
		p=s.nextInt();
		c=s.nextInt();
		System.out.println("enter sname :");
		sname=s.next();
		s.close();
		total=m+p+c;
		avg=(m+p+c)/3;
		System.out.println("given sno :" +sno);
		System.out.println("geven sname :" +sname);
		System.out.println("total marks :" +total);
		System.out.println("avg :" +avg);
		
		
		
		
	}

}
