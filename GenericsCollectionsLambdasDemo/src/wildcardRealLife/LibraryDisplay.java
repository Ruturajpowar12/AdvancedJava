package wildcardRealLife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//A library maintains lists for book titles (String), book IDs (Integer), and ratings (Double).
//Write one method using an unbounded wildcard to display all three lists.
public class LibraryDisplay {
	
	public static <T> void display(List<T> list){
		for(T val : list) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<String> title = new ArrayList<>();
		title.addAll(Arrays.asList("Java","c++","Python"));
		System.out.print("Book Titles : ");
		display(title);
		
		List<Integer> ids = new ArrayList<>();
		ids.addAll(Arrays.asList(101,103,107));
		System.out.print("Book Id's : ");
		display(ids);
		
		List<Double> rating = new ArrayList<>();
		rating.addAll(Arrays.asList(5.4,8.2,7.8));
		System.out.print("Book rating : ");
		display(rating);
		
		
		

	}

}
