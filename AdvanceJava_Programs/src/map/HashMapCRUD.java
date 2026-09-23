package map;
import java.util.HashMap;
//Write a program to insert, retrieve, update, and delete entries from a HashMap

public class HashMapCRUD {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		
		//insert
		map.put(1, "Mango");
		map.put(2, "Orange");
		map.put(3, "Apple");
		map.put(4, "Greps");
		
		//retrieve
		System.out.println(map);
		
		//update
		map.put(1, "Banana");
		
		System.out.println(map);
		
		//delete
		map.remove(3);
		map.remove(1);
		
		System.out.println(map);
		
	}

}
