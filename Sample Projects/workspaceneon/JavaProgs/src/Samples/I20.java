package Samples;

import java.util.Map;

public class I20 extends Car {
	int vecprice=20000;
	public int calculateTotal(int reg) {
		int total = reg + vecprice;
		return total;
		}
	public void discount(int calculate){
		int dis=calculate-5000;
		System.out.println("discount"+dis);
		
	}
	
		public static void main(String[] args) {
			//creating a object to subclass
		I20 i20 = new I20();
		//calling super class method
		Map<String,Object> reg=i20.regCharges(200000, 10);
		Object object = reg.get("getCar");
		Object object2 = reg.get("charges");
        System.out.println("vehcle charges ::" +reg);
        System.out.println("getCar value::"+object);
        System.out.println("charges :::"+object2);
        
        //calling subclass 1st method
		int calculate = i20.calculateTotal(Integer.parseInt(object2.toString()));
		System.out.println("total vehcle amt"+calculate);
		
		//calling subclass 2nd method
		i20.discount(calculate);
		
	}

	
}
