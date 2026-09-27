package map;
import java.util.HashMap;
//Write a program to sort a HashMap by its keys using TreeMap.
import java.util.TreeMap;

public class SortMapbyKeys {

	public static void main(String[] args) {
		 HashMap<String, Integer> map = new HashMap<>();
	     map.put("Banana", 2);
	     map.put("Apple", 1); 
	     map.put("Cherry", 3);
	     
	     TreeMap<String, Integer> sorted = new TreeMap<>(map);
	     System.out.println("Sorted by keys: " + sorted);

	}

}
