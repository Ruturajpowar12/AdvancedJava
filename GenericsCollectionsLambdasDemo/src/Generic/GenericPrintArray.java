package Generic;
import java.util.Arrays;
//Write a generic method printArray() that accepts an array of any type and prints all its elements

public class GenericPrintArray {
	
	
	//by create user-defined function
	public static <T> void  printArray(T[] arr){
		for(T val : arr) {
			System.out.print(val + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Integer[] intArr = {10,20,30,40,50}; 
		String[] strArr = {"Ruturaj","Aman","Rohit"};
		printArray(intArr);
		printArray(strArr);
		
		
		//by in-built method
		System.out.println("\n"+Arrays.toString(intArr));
		System.out.println(Arrays.toString(strArr));

	}

}
