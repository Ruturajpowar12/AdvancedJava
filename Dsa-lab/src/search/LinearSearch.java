package search;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int arr[],int size, int target) {
		
		for(int i=0;i<size;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Array Size :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter Array Elements :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
			
		}
		
		System.out.print("Enter Target Element :");
		int target = sc.nextInt();
		
		int result = linearSearch(arr,n,target);
		
		if(result != -1) {
			System.out.println("Target element found at Index  "+result);
		}else{
			System.out.println("Target element not found! ");
		}
		
		sc.close();

	}

}
