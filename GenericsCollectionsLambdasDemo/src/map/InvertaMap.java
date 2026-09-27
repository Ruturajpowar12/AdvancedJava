package map;

import java.util.HashMap;
import java.util.Map;

//Write a program to invert a map, i.e., convert keys into values and values into keys.
public class InvertaMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(10, "mango");
		map.put(20, "apple");
		map.put(30, "greps");
		map.put(40, "banana");
		
		System.out.println("Original Map : "+map);
		
		HashMap<String, Integer> inverted = new HashMap<>();
		
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			inverted.put(entry.getValue() , entry.getKey());
		}
		System.out.println("chnaging Map : "+inverted);
		
	}

}
