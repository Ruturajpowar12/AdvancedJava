package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Write a program to find common keys between two HashMap objects.
public class CommonMapKeys {

	public static void main(String[] args) {
		 
		HashMap<String, Integer> map1 = new HashMap<>();
	    map1.put("A", 1); 
	    map1.put("B", 2);
	    map1.put("C", 3);
	    
	    HashMap<String, Integer> map2 = new HashMap<>();
	    map2.put("B", 20); 
	    map2.put("C", 30);
	    map2.put("D", 40);

	    Set<String> set = new HashSet<>(map1.keySet());
	    
	    set.retainAll(map2.keySet());
	    
	    System.out.print("Common : "+ set);
	}

}
