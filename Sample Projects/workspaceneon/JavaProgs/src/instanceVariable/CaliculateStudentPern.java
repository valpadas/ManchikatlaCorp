package instanceVariable;
 
public class CaliculateStudentPern {
	public double calculatepercentage(Student st){
		double percent=((st.gettmaths()+st.getphysics()+st.getchem())/3)*100;
		//System.out.println("Student Name= "+st.getName()+"\n Student Class = "+st.getclass() +"\n marks="+percent);
		System.out.println("Student Name="+st.getName()+"\n Studentclass="+st.getclass());
		return percent;
		
	}
	
	public static String studentNameFormater(String studentName){
		
		return studentName;
	}
  
 
   public static void main(String args[]) {
	//student1 details
	  Student st1 = new Student();
	  st1.setName("Bangaram");
	  st1.setclass("inter");
	  st1.setsubjects(80,90, 100);
	  st1.setSchoolName("Anshs School");
	  st1.setAddress("medak");
	  
	 
	  //student2 details
	  Student st2=new Student();
	  st2.setName("anusha");
	  st2.setclass("10th");
	  st2.setsubjects(50,90, 100);
	  //student3 details
	  Student st3=new Student();
	  st3.setName("anusha");
	  st3.setclass("10th");
	  st3.setsubjects(50,55, 100);
	  
	 studentNameFormater(st3.getName());
	  
	  
	  CaliculateStudentPern cal=new CaliculateStudentPern();
	  cal.calculatepercentage(st1);
	 
	  cal.calculatepercentage(st2);
	  cal.calculatepercentage(st3);
	   
	   //send all marks to CaliculateStudentPern.CaliculateStudentPerncentage(maths,phhy, che);
	   //send all marks to CaliculateStudentPern.CaliculateStudentPerncentage(st);
   }
}