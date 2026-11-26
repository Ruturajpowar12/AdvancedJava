package MyAop;

public class Employee {
	String name;
	String destination;
	String dept;
	
public Employee() {
		
	}

	public Employee(String name, String destination, String dept) {
		super();
		this.name = name;
		this.destination = destination;
		this.dept = dept;
	}
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", destination=" + destination + ", dept=" + dept + "]";
	}
	
	
	

}
