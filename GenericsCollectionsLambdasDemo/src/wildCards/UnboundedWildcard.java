package wildCards;

import java.util.ArrayList;
import java.util.List;

//Write a Java program using an unbounded wildcard <?> to display elements of a list.
public class UnboundedWildcard {

		public static void printlist(List<?> list) {
			 for(Object o : list ) {
				 System.out.print(o+" ");
			 }
			 System.out.println();
		}
		
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(30);
		list1.add(40);
		
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("H");
		list2.add("B");
		
		printlist(list1);
		printlist(list2);
	}

}
