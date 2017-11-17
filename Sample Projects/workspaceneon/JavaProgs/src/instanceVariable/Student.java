package instanceVariable;

public class Student extends School{
	//instance variable
	public String stuname;
	
	public String stuclass;
	 
	public int maths,physics,chem;
	
	public void setName(String stuname){
		this.stuname=stuname;
	}
	public void setclass(String stuclass){
		this.stuclass=stuclass;
		}
	public void setsubjects(int maths,int phy, int chem){
		this.maths=maths;
		physics=phy;
		this.chem=chem;
	}
	public String getName(){
		return stuname;
		
	}
	public String getclass(){
		return stuclass;
	}
	public int gettmaths(){
		return maths;
	}
	public int getphysics(){
		return physics;
		
	}
	public int getchem(){
		return chem;
	}
	

}
