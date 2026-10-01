package setRealLife;

import java.util.TreeSet;

//Use TreeSet<Integer> to store employee IDs, display sorted IDs, find smallest/largest IDs, 
//and find IDs greater than a specified value.
public class SortedEmployeeIDs {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		int[] ids = {10,12,34,15,27,11};
		
		for(int val : ids) {
			set.add(val);
		}

		System.out.println(" Sorted Ids :"+set);
		
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;
		
		for(int val : set) {
			if(val > max) {
				max = val;
			}
			
			if(val < min) {
				min = val;
			}
		}
		System.out.println("largest value :"+max);
		System.out.println("smallest value :"+min);
		
		
		
	}

}
