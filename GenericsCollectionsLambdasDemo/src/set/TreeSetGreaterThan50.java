package set;

import java.util.TreeSet;
//Write a program to find the elements greater than 50 from a TreeSet<Integer>.
public class TreeSetGreaterThan50 {

	public static void main(String[] args) {
		 TreeSet<Integer> set = new TreeSet<>();
		 
	        int[] vals = {10, 55, 60, 30, 80, 45};
	        for(int val : vals) {
	        	set.add(val);
	        } 
	        
	        System.out.print("Element greater than 50 : " + set.tailSet(51));
//	        for(int val : set) {
//	        	if(val > 50 ) {
//	        		System.out.print(val+" ");
//	        	}
//	        }
	}

}
