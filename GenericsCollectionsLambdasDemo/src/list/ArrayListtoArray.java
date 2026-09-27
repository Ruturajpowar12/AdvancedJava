package list;

import java.util.ArrayList;

//Write a program to convert an ArrayList<String> into an array

public class ArrayListtoArray {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
        list.add("Aman");
        list.add("Ruturaj");
        list.add("swarup");
        
    String[] arr = list.toArray(new String[0]);
    
    for (String s : arr) {
    	System.out.print(s + " ");
    }
    
    System.out.println();
	ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(20);
    list1.add(30);
    
    Integer[] arr1 = list1.toArray(new Integer[0]);

    for (int n : arr1) {
    	System.out.print(n + " ");
    }
	}

}
