package listRealLife;

import java.util.ArrayList;

public class EmployeeDepartmentTransfer {

	public static void main(String[] args) {
		 ArrayList<String> deptA = new ArrayList<>();
	        deptA.add("Ram"); 
	        deptA.add("Sai"); 
	        deptA.add("Sam");
	        ArrayList<String> deptB = new ArrayList<>();
	        deptB.add("Aniket");

	        String employee = "Mahesh";
	        deptA.remove(employee);
	        deptB.add(employee);

	        System.out.println("Dept A: " + deptA);
	        System.out.println("Dept B: " + deptB);

	}

}
