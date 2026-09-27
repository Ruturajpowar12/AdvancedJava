package set;

import java.util.HashSet;

//Write a program to find the difference between two sets

public class SetDifference {

	public static void main(String[] args) {
		
		  HashSet<Integer> a = new HashSet<>();
		  a.add(1);
		  a.add(2);
		  a.add(3);
		  
	      HashSet<Integer> b = new HashSet<>();
	      b.add(2);
	      b.add(3); 
	      b.add(4);
	        
	        HashSet<Integer> difference = new HashSet<>(a);
	        difference.removeAll(b);
	        System.out.println("Difference (a-b) : " + difference);

	}

}
