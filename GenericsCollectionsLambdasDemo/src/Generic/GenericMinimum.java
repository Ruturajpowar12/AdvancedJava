package Generic;

public class GenericMinimum {
	
	public static <T extends Comparable<T>> T Minimum(T[] arr) {
		
		T min = arr[0];
		
		for(T val:arr) {
			if(val.compareTo(min)<0) {
				min = val;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Integer[] nums = {10,43,6,23,6,99};
		 System.out.println("Min number is "+ Minimum(nums));
		 
		 String[] str = {"ram","sham","arjun"};
		 System.out.println("Min String is "+ Minimum(str));

	}

}
