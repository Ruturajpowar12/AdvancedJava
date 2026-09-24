package map;
import java.util.HashMap;

import java.util.Map.Entry;

//Write a program to find the student having the highest marks using HashMap<String,Integer>.


public class HighestMarks {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Ruturaj", 86);
		map.put("Swarup", 70);
		map.put("Piyush", 50);
		map.put("Sanskar", 96);
		
		String highestMarks = null;
		int max = Integer.MIN_VALUE;
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() > max) {
				max = entry.getValue();
				highestMarks = entry.getKey();
			}
		}
		System.out.println("Highest Marks Student "+highestMarks+" with "+max);
	}

}
