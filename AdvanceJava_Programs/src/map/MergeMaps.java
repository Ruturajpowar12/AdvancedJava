package map;

import java.util.HashMap;

//Write a program to merge two maps and handle duplicate keys.
public class MergeMaps {

	public static void main(String[] args) {
		HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 20); 
        map2.put("C", 30);
        
        
        HashMap<String, Integer> merged = new HashMap<>(map1);
        map2.forEach((k, v) -> merged.merge(k, v, Integer::sum));
        System.out.println("Merged (sum on duplicates): " + merged);
        

	}

}
