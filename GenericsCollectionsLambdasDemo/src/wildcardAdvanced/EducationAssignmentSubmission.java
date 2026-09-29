package wildcardAdvanced;

import java.util.ArrayList;
import java.util.List;

//Create a generic method to copy assignments from List<Assignment> to
//List<Object> using appropriate wildcard bounds.
//Explain the use of ? extends T and ? super T.


class Assignment { 
	String title;
	Assignment(String title){
		this.title = title; 
	}
	public String toString() {
		return title; 
		}
	}
public class EducationAssignmentSubmission {

	 public static <T> void copyAssignments(List<? extends T> source, List<? super T> destination) {
	        for (T item : source) destination.add(item);
	    }

	    public static void main(String[] args) {
	        List<Assignment> source = new ArrayList<>();
	        source.add(new Assignment("Math HW"));
	        source.add(new Assignment("Science HW"));
	        List<Object> destination = new ArrayList<>();
	        copyAssignments(source, destination);
	        System.out.println("Destination: " + destination);
	    }

}
