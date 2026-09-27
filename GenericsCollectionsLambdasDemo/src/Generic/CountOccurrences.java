package Generic;

//Write a generic method that counts the number of occurrences of a given element in an array

public class CountOccurrences {
	
	public static <T> int count(T[] arr, int target) {
		 
		int count = 0;
		for(T val : arr) {
			if(val.equals(target)) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
	
		Integer[] arr  = {2,1,2,3,2,2,5,3,1,5};
		int result = count(arr,2);
		
		System.out.println("Count Occurrences of 2 : "+result);

	}

}
