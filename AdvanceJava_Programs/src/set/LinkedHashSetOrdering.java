package set;
import java.util.LinkedHashSet;
//Write a program using LinkedHashSet to remove duplicates while maintaining insertion order

public class LinkedHashSetOrdering {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Mango");
		set.add("Apple");
		set.add("Banana");
		set.add("Greps");
		
		System.out.print("LinkedHashSet : ");
		for(String val:set) {
			System.out.print(val +" ");
		}
		

	}

}
