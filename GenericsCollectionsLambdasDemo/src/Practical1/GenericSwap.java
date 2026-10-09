package Practical1;

public class GenericSwap {

	public static <T> void swapArray(T[] arr1,int i,int j){
		T temp =  arr1[i];
		arr1[i] = arr1[j];
		arr1[j] = temp;
	}

	public static void main(String[] args) {
		
		Integer[] arr1 = {10,20,30,40,50};
	
		System.out.println("Before Swapping Array :");
		for(int val : arr1) {
			System.out.print(val+" ");
		}
		
		swapArray(arr1,0,4);
		System.out.println("\nAfter Swapping Array :");
		for(int val : arr1) {
			System.out.print(val+" ");
		}
		
	}

}
