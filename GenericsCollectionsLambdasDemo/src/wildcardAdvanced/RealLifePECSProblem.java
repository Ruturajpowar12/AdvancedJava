package wildcardAdvanced;

import java.util.ArrayList;
import java.util.List;

//Write methods that read Employee objects from a collection containing Employee or subclasses and add Employee objects 
//to a collection containing Employee or superclasses. Use appropriate wildcard bounds and explain PECS

class Employee80 { 
	String name;
	
	Employee80(String name) {
		this.name = name; 
	} 
	public String toString() {
		return name; 
		} 
	}


public class RealLifePECSProblem {

	 public static void readEmployees(List<? extends Employee80> list) {
	        for (Employee80 e : list) System.out.println(e);
	    }

	 
	    public static void addEmployee(List<? super Employee80> list, Employee80 e) {
	        list.add(e);
	    }

	    public static void main(String[] args) {
	        List<Employee80> list = new ArrayList<>();
	        addEmployee(list, new Employee80("ruturaj"));
	        addEmployee(list, new Employee80("sam"));
	        readEmployees(list);
	        System.out.println("PECS: Producer Extends, Consumer Super.");
	    }

}
