package wildcardRealLife;

import java.util.List;
import java.util.ArrayList;

//A school management system maintains student IDs in List<Integer> or List<Number>.
//Write a method using List<? super Integer> to add student IDs.

public class SchoolStudentIDs {
	
	public static void addStudent(List<? super Integer> list,int ID) {
		list.add(ID);
	}
	

	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		
		addStudent(list,1);
		addStudent(list,2);
		addStudent(list,5);
		
		System.out.println("Student ID's are "+list);

	}

}
