package practical1;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int size,int target) {
		
		for(int i =0 ; i<size; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.print("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter key to search: ");
	        int key = sc.nextInt();
	        
	        int result = linearSearch(arr,n ,key);
	        if (result != -1) {
	            System.out.println("Key found at position " + result);
	        } else {
	            System.out.println("Key not found");
	        }

	        sc.close();
	}

}
