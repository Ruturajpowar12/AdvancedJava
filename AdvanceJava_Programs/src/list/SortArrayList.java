package list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Write a program to sort an ArrayList<Integer> in ascending and descending order

public class SortArrayList {

	public static void main(String[] args) {
		Integer[] nums = {10,82,12,30,42,65,1};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(nums));
		
		System.out.print("Descending order : ");
		for(int val : list) {
			System.out.print(val+" ");
		}
		
		System.out.println();
		Collections.sort(list);
		System.out.print("Ascending order : ");
		for(int val : list) {
			System.out.print(val+" ");
		}
		
		

	}

}
