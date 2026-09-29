package listRealLife;

import java.util.ArrayList;

//A college maintains names of students who attended a class. 
//Use ArrayList<String> to add students, remove a student, search for attendance, display all students, and display the total

public class StudentAttendanceSystem {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ram");
		list.add("sham");
		list.add("Vir");
		list.add("sai");
		
		System.out.println("Students are : "+list);
		
		list.remove(2);
		list.remove(1);
		
		System.out.println("after revmoveing Students are : "+list);
		
		System.out.println("Student of 1st index : "+list.get(1));
		
		System.out.println("Total Students : "+list.size());

	}

}
