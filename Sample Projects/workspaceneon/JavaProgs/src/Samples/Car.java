package Samples;

import java.util.HashMap;
import java.util.Map;

public class Car {
	public Map<String,Object> regCharges(int vehcleAmt,int tax){
		Map<String,Object> map=new HashMap<String,Object>();
		
		int charges=(vehcleAmt /tax)*100;
		int insurance = 0;
		int servicing = 0;
		map.put("charges", charges);
		map.put("insurance",90);
		map.put("servicing", 100);
		int getCar = charges+insurance+servicing;
		map.put("getCar", getCar);
	    return map ;
		}

}
