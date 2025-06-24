package EncapsolationExc;

public class Employee {
	
	private String Dep;
	private int Id;
	private double salary;
	private String position;
	
	
	public Employee() {
		super();
	}
	
	public void setPosition(String position) {
		this.position = position;
		
	}
	
	public String getposition1(String position) {
		return position;
		
	}
	
	public void setDep(String position) {
		this.Dep = Dep;
		
	}
	
	public String getDep(String Dep) {
		return Dep;
		
	}
	
	
	public void setId(int id) {
		if(id>=2050) {
		this.Id = id;
		}else {
			this.Id=id+2000;
			
		}
		
	
	}
	
	public Double getId() {
		return (double) Id;
	
  }
	
	public double getSalary() {
		
		if (position!=null) {
			if (position.equals("admin")|| position.equals("self")) {
				
			return salary;	
			}
		}else {
			System.out.println("please enter your position");
		}
		return 0;
	}

		public void setSalary(double salary) {
			if (salary>=300) {
				this.salary =salary;
			}else {
				this.salary=salary+50;
			}
		}
	
	
}

