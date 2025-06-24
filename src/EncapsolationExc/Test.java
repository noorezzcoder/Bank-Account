package EncapsolationExc;

public class Test {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setage(15);
		System.out.println(p.getage());
		
		Employee e = new Employee();
		e.setId(2010);
		e.setSalary(200);
		System.out.println(e.getId());
		System.out.println(e.getSalary());
		
		e.setPosition("self");
		
		System.out.println(e.getSalary());

		
	}

}
