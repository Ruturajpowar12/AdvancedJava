package wildCards;

import java.util.ArrayList;
import java.util.List;

//Write a method using List<? extends Number> 
//to calculate the sum of integers and doubles stored in lists.

public class UpperBoundedWildcard {

	public static void sum(List<? extends Number> list) {
		double total = 0;
		for(Number o : list) {
			total += o.doubleValue();
		}
		System.out.println("Sum of list : "+ total);
	}
	 
	public static void main(String[] args) {
		
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10);
		nums1.add(20);
		nums1.add(60);
		
		List<Double> nums2 = new ArrayList<>();
		nums2.add(12.43);
		nums2.add(20.9);
		nums2.add(40.33);
		
		sum(nums1);
		sum(nums2);
		
		

	}

}
