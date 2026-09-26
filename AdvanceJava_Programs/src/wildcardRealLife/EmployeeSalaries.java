package wildcardRealLife;

import java.util.ArrayList;
import java.util.List;

//An employee management application has a collection that may be List<Integer>, List<Number>, or List<Object>. 
//Write a method using List<? super Integer> that adds integer salary values.
public class EmployeeSalaries {
	 public static void addSalaryList(List<? super Integer> addSal , int value) {
		 addSal.add(value);
	 }

	public static void main(String[] args) {
		List <Number> list = new ArrayList<>();
		addSalaryList(list,50000);
		addSalaryList(list,70000);
		
		System.out.println("salary is : "+list);
		

	}

}
