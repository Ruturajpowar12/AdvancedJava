package wildcardRealLife;

import java.util.Arrays;
import java.util.List;

//Given Employee with subclasses Manager, Developer, and Tester, write a method using List<? extends Employee> 
//to calculate the total number of employees and display their details.
class Employee{
	String name;
	Employee(String name){
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

class Manager extends Employee{
	Manager(String name){
		super(name);
	}
}
class Developer extends Employee{

	Developer(String name) {
		super(name);
	}
	
}

public class EmployeeHierarchy {
	
	public static void displayDetails(List<? extends Employee> list) {
		int count = 0;
		 for(Employee val : list) {
			 count++;
			 System.out.print(val + " ");
		 }
		 System.out.println("\nTotal employees : "+count);
	}

	public static void main(String[] args) {
		
		List<Manager> manager = Arrays.asList(new Manager("Histesh"),new Manager("Rohan"));
		List<Developer> developer = Arrays.asList(new Developer("Ruturaj"));
		
		System.out.print("Managers  are ");
		displayDetails(manager);
		
		System.out.print("Developers  are ");
		displayDetails(developer);
		
		

	}

}
