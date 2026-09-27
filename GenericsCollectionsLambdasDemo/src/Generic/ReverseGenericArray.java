package Generic;
//Write a generic method to reverse an array of any reference type.

public class ReverseGenericArray {
	
	public static <T> void reverseArray(T[] arr){
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			T temp = arr[left];
			arr[left]= arr[right];
			arr[right]= temp;
			
			left++;
			right--;
		}
		
	}

	public static void main(String[] args) {
		Integer[] numbers = {10,20,30,40,50};
		reverseArray(numbers);
		System.out.print("Reversed Array : ");
		for(int val:numbers) {
			System.out.print(val +" ");
		}
		
		
		String[] words = {"A","B","C","D","E"};
		reverseArray(words);
		System.out.print("\nReversed Array : ");
		for(String val:words) {
			System.out.print(val +" ");
		}
		

	}

}
