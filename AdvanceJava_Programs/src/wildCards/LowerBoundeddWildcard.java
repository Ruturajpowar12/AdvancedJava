package wildCards;

import java.util.ArrayList;
import java.util.List;

//Write a method using List<? super Integer> to add integers into a collection.

public class LowerBoundeddWildcard {
	
	public static void addIntegers(List<? super Integer> list) {
		list.add(12);
		list.add(30);
		list.add(13);
	}

	public static void main(String[] args) {
		
		List<Number> nums = new ArrayList<>();
		
		addIntegers(nums);
		
		System.out.println(nums);

	}

}
