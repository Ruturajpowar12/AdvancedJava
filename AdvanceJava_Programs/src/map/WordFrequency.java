package map;
import java.util.HashMap;

//Write a program to count the frequency of each word in a sentence using HashMap
public class WordFrequency {

	public static void main(String[] args) {
		
		String sentence = "Hello I am Ruturaj A MCA Student.";
		
		HashMap<Integer,String> freq = new HashMap<>();
		
		for(String word : sentence.split(" ")) {
			freq.put(word.length(),word);
		}

		 System.out.print(freq);
	}

}
