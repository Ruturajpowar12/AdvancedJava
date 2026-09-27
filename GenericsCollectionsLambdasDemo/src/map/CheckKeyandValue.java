package map;

import java.util.HashMap;

//Write a program to check whether a particular key or value exists in a HashMap
public class CheckKeyandValue {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		
		map.put(1, "Mango");
		map.put(2, "Orange");
		map.put(3, "Apple");
		map.put(4, "Greps");
		
		System.out.println("key (1) is exits : "+map.containsKey(1));
		System.out.println("value (Orange) is exits : "+map.containsValue("Orange"));

	}

}
