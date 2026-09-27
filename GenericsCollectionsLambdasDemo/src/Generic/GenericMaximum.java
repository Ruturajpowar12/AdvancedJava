package Generic;
//Write a generic method to find the maximum element in an array of comparable objects

public class GenericMaximum {
	
	public static <T extends Comparable<T>> T Maximum(T[] arr) {
		
		T max = arr[0];
		
		for(T val : arr) {
			if(val.compareTo(max) > 0) {
				max = val;
			}
		}
		return max;	
	}
	public static void main(String[] args) {
		 Integer[] nums = {10,43,6,23,6,99};
		 System.out.println("Max number is "+ Maximum(nums));
		 
		 String[] str = {"ram","sham","arjun"};
		 System.out.println("Max String is "+ Maximum(str));

	}

}
