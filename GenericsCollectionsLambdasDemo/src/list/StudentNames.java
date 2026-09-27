package list;
import java.util.ArrayList;

//Write a program to store names of 10 students in an ArrayList and display them using a for-each loop

public class StudentNames {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Ruturaj");
		names.add("Swarup");
		names.add("Piyush");
		names.add("Sanskar");
		names.add("Harsh");
		names.add("Aniket");
		names.add("Manndar");
		names.add("Rohit");
		names.add("Krushna");
		names.add("Samarth");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
		
	}

}
