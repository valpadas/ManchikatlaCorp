package instanceVariable;
 
public class InstanceVariableExample {

   // this instance variable is visible for any child class.
   public String name;

   // salary  variable is visible in Employee class only.
   private double salary;

   
   
   
   // The name variable is assigned in the constructor.
   public InstanceVariableExample (String name) {
      this.name = name;
   }
   
   
   public InstanceVariableExample (String name, double sal) {
	   salary = sal;
	  }
   
// The name variable is assigned in the constructor.
   public InstanceVariableExample () {
    }

   
   
   
   // The salary variable is assigned a value.
   public void setSalary(double empSal) {
      salary = empSal;
   }

   // This method prints the employee details.
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

   public static void main(String args[]) {
	   InstanceVariableExample empOne = new InstanceVariableExample("NUSHA");
	   InstanceVariableExample empOne1 = new InstanceVariableExample("NUSHA",0);

      empOne.setSalary(1000);
      empOne.printEmp();
   }
}