package ubale;


import java.util.Arrays; 

public class ReverseArray { 
	public static void main(String [] args) { 
		System.out.println("Macchindranath Ubale");
		System.out.println("21");
	 	int[] arr = {2,4,6,8}; 
	 	 
	 	for(int i=0; i<arr.length/2;i++) { 
	 	 	int t = arr[i]; 
	 	 	arr[i]=arr[arr.length-1-i];  	 	 	arr[arr.length-1-i]=t; 
	 	} 
	 	 
	 	System.out.println("Reverse Array is : "+Arrays.toString(arr)); 
	} 
} 
