package Samples;

import java.util.HashMap;
import java.util.Map;

public class ReturnType {
	double salary;
	double bonus;
	double pf;
	double insurance;
	//here return type void
	public Map<String,Object> calculateSalary(){ 
		Map<String,Object> map=new HashMap<String,Object>();//object creation of map
		double total = salary+bonus;
		double totpackage=total+pf+insurance;
		//System.out.println(total);
		map.put("total", total);
		map.put("totpackage", totpackage);

		return map;
		
	}
}
