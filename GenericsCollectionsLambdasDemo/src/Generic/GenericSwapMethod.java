package Generic;

//Write a generic method swap() that swaps two elements of an array.

public class GenericSwapMethod {
	
	public static <T> void Swap(T[] arr, int element1, int element2) {
		
	 T temp =  arr[element1];
	 arr[element1] = arr[element2];
	 arr[element2] = temp;
	}

	public static void main(String[] args) {
		Integer[] intArr = {10,20,30,40,50};
		Swap(intArr,1,4);
		for(Integer val : intArr) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		
		
		String[] strArr = {"ram","sham","vir","jay"};
		Swap(strArr,0,2);
		for(String val : strArr) {
			System.out.print(val + " ");
		}
		
		
		
		
	}

}
