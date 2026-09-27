package mapTreeMap;


import java.util.Map;

import java.util.TreeMap;

//Use TreeMap<Integer,String> for marks to student names. 
//Display students in sorted mark order and identify the highest marks

public class ExaminationResultRanking {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> data = new TreeMap<>();
		
		data.put(61, "Rohit");
		data.put(78, "Sanskar");
		data.put(90, "Ruturaj");
		data.put(96, "Piyush");
		
		Integer max = Integer.MIN_VALUE;
		String std= null;
		
		for(Map.Entry<Integer, String> entry : data.entrySet()) {
			if(entry.getKey()>max) {
				max = entry.getKey();
				std = entry.getValue();
			}
			System.out.println("Student "+entry.getValue()+" with marks "+entry.getKey());
		}
		
		System.out.println("higest marks student is "+std+" with marsks "+max);
	}

}
