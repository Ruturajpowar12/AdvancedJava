package list;
import java.util.ArrayList;
import java.util.Arrays;

//Write a program to remove duplicate elements from an ArrayList.


public class RemoveDuplicates {

	public static void main(String[] args) {
		Integer[] nums = {10,22,12,30,22,45,10};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(nums));
		
		System.out.println("Original ArrayList : "+list);
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		
		for(int val : list) {
			if(!newList.contains(val)) {
				newList.add(val);
			}
		}

		System.out.print("\nNew ArrayList : "+newList);
		
		
		

	}

}
