package map;

import java.util.HashMap;
import java.util.Map;

//Write a program to traverse a HashMap using entrySet().

public class TraverseHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(101, "Swarup");
		map.put(102, "Ruturaj");
		map.put(103, "Rohit");
		map.put(105, "Ram");
		
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			
			Integer key = entry.getKey();
			String  value = entry.getValue();
			System.out.println(key+" key of "+value +" value");
		}

	}

}
