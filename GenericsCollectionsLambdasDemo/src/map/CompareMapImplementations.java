package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

//Write a program to demonstrate the difference between HashMap, LinkedHashMap, and TreeMap

public class CompareMapImplementations {

	public static void main(String[] args) {
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.put(1, "Lion");
		map1.put(3, "Tiger");
		map1.put(4, "Fox");
		map1.put(2, "Cow");
		
		System.out.println("HashMap : "+map1 + "ordered format");
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();
		map2.put(1, "Lion");
		map2.put(3, "Tiger");
		map2.put(4, "Fox");
		map2.put(2, "Cow");
		
		System.out.println("\nLinkedHashMap : "+map2 + "unordered format");
		
		TreeMap<Integer,String> map3 = new TreeMap<>();
		map3.put(1, "Lion");
		map3.put(3, "Tiger");
		map3.put(4, "Fox");
		map3.put(2, "Cow");
		
		System.out.println("\nTreeMap : "+ map3 + "ordered format");
		
	}

}
