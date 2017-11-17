package instanceVariable;
 
public class CaliculateBonus {
	
	// Caliculate employee salary
	public Double caliculateEmployeeBonus(Double sal){
		
		System.out.println(sal);
		return sal;
	}
// Caliculate employee salary
	public Double hikepercetage(Double sal){
		
		System.out.println(sal);
		return sal;
	}
	
	//Caliculate employee salary
	public Double hikepercetage1(Double sal){
		
		System.out.println(sal);
		return sal;
	}
	
   public static void main(String args[]) {
	  
	   Employee emp1 = new Employee();
	   emp1.setName("Asny");
	   emp1.setSalary(30000);
	   
	   Employee emp2 = new Employee();
	   emp2.setName("Asny");
	   emp2.setSalary(30000);
	   
	   CaliculateBonus calb = new CaliculateBonus();
	   calb.caliculateEmployeeBonus(emp1.getSalary());
	   calb.hikepercetage(emp1.getSalary());
 
   }
}