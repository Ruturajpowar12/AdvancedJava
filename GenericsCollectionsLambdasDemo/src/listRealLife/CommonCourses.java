package listRealLife;

import java.util.ArrayList;

public class CommonCourses {

	public static void main(String[] args) {
		 ArrayList<String> student1 = new ArrayList<>();
	        student1.add("Java"); student1.add("DBMS"); student1.add("OS");
	        ArrayList<String> student2 = new ArrayList<>();
	        student2.add("DBMS"); student2.add("Networks"); student2.add("OS");

	        ArrayList<String> common = new ArrayList<>(student1);
	        common.retainAll(student2);
	        System.out.println("Common courses: " + common);

	        ArrayList<String> unique1 = new ArrayList<>(student1);
	        unique1.removeAll(student2);
	        System.out.println("Unique to student1: " + unique1);

	        ArrayList<String> unique2 = new ArrayList<>(student2);
	        unique2.removeAll(student1);
	        System.out.println("Unique to student2: " + unique2);
	}

}
