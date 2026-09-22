package set;
import java.util.TreeSet;

//Write a program using TreeSet to store integers in sorted order.

public class TreeSetSorting {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(90);
		set.add(10);
		set.add(56);
		set.add(65);
		set.add(5);

		System.out.print("Sorted order : ");
		for(int val : set) {
			System.out.print(val+" ");
		}
	}

}
