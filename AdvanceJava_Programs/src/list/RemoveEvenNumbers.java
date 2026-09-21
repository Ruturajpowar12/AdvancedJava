package list;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to remove all even numbers from an ArrayList<Integer>

public class RemoveEvenNumbers {

	public static void main(String[] args) {
		
	  Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.addAll(Arrays.asList(nums));
		System.out.print("List : "+list);
		
		for(int i =0 ; i<list.size();i++) {
			if(list.get(i) % 2 == 0 ) {
				list.remove(i);
			}
		}
		
		System.out.print("\nAfter Remove List : "+list);

	}

}
