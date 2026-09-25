package wildcardRealLife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//A hospital application maintains patient records in different types of lists such as List<String> 
//for patient names and List<Integer> for patient IDs. Write a generic method 
//displayRecords(List<?> records) that
//can display either list.

public class HospitalPatientRecords {
	
	public static void displayRecords(List<?> records) {
		for(Object o : records) {
			System.out.print(o + " ");
		}
		
	}

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		List<Integer> ids = new ArrayList<>();
		
		names.addAll(Arrays.asList("Ram","sham","Om"));
		ids.addAll(Arrays.asList(101,102,104));
		
		System.out.print("Patient Names : ");
		 displayRecords(names);
		 
		System.out.print("\nPatient IDs : ");
		displayRecords(ids);

		
		

	}

}
