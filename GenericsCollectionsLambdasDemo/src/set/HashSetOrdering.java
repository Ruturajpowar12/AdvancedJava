package set;

import java.util.HashSet;

//Write a program to demonstrate that HashSet does not maintain insertion order

public class HashSetOrdering {

	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<>();
	        set.add("Zebra");
	        set.add("Apple"); 
	        set.add("Mango"); 
	        set.add("Banana");
	        System.out.println("HashSet order (not guaranteed insertion order): " + set);

	}

}
