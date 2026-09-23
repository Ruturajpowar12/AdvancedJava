package map;

import java.util.HashMap;

//Write a Java program using HashMap<Integer,String> to store student registration 
//numbers and names.

public class HashMapStudentRecords {

	public static void main(String[] args) {
	
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(101, "Swarup");
		map.put(102, "Ruturaj");
		map.put(103, "Rohit");
		map.put(105, "Ram");
		
		System.out.print("Students are : "+map);
		
		
		

	}

}
