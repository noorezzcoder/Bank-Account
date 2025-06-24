package EncapsolationExc;

public class Person {
	
	private String name;
	private int age;
	private String numberid;
	
	public void setName(String name) {
		 if(name.startsWith("a")) {
			 this.name=name;
			 
		 }
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		 if(age>18) {
			 this.age=age;
		 }else {
			 System.out.println("Invalid");
		 }
		 
	}
	
	
	public void setNumberid(String numberid) {
		this.numberid = numberid;
		
	}
	
	public String getNumberID() {
		 return numberid;
		 
	}
	

}
