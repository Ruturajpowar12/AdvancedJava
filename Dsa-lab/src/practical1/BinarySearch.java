package practical1;

import java.util.Scanner;

public class BinarySearch {
	 
	public static int binarySearch(int[] arr, int size,int target) {
		
		int low = 0;
		int high = size -1;
		
		while(low <= high) {
			int mid = (low + high )/2;
			
			if(arr[mid] == target ) {
				return mid;
			}else if(arr[mid]<target) {
				low = mid + 1;
			}else {
				high = mid - 1;
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
        
        int result = binarySearch(arr,n ,key);
        if (result != -1) {
            System.out.println("Key found at position " + result);
        } else {
            System.out.println("Key not found");
        }

        sc.close();

	}

}
