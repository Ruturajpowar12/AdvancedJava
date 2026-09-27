package wildcardRealLife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//An online store wants to transfer products from one category list to another.
//Write a generic copyProducts(source, destination)
//using ? extends T for the source and ? super T for the destination

public class GenericProductTransfer {
	
	public static <T> void copyProducts(List<T> Source ,List<T> dest) {
		for(T val : Source) {
			dest.add(val);
		}
	}

	public static void main(String[] args) {
		List<String> books = Arrays.asList("Java","c++","Python");
		System.out.println("Source product books : "+books);
		
		List<String> ComputerBooks = new ArrayList<>();
		copyProducts(books,ComputerBooks);
		
		System.out.println("Destination product books : "+ComputerBooks);
		

	}

}
