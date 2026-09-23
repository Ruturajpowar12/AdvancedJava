package map;

import java.util.HashMap;

//Write a program to count the frequency of each character in a string using HashMap
public class CharacterFrequency {

	public static void main(String[] args) {
		
		 String str = "Programming";
		 
		 HashMap<Character,Integer> freq = new HashMap<>();
		 
		 for(char c : str.toCharArray()) {
			 
			 freq.put(c, freq.getOrDefault(c, 0)+1);
		 }
		 System.out.println("Charater Frequency : "+freq);
	}

}
