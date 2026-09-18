package list;
import java.util.ArrayList;
import java.util.Arrays;

//Write a program to reverse an ArrayList without creating another list.

public class ReverseArrayList {

	public static void main(String[] args) {
		Integer[] nums = {10,82,12,30,42,65,1};
		
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(nums));
		System.out.println(list);
		
		;
		System.out.println(list.reversed());
		
		
	}

}
