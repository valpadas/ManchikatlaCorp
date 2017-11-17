package Samples;

import java.util.Map;

public class ReturnTypeMain {

	public static void main(String[] args) {
		//object creation for class
		ReturnType Type = new ReturnType();
		Type.bonus=1000;
		Type.salary=2000;
		Type.pf=500;
		Type.insurance=100;
		Map<String, Object> calculate = Type.calculateSalary();
		System.out.println(calculate.get("total"));
		System.out.println(calculate.get("totpackage"));
		
		
		
		
		
	}

}
