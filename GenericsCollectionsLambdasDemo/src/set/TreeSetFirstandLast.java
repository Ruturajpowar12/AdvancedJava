package set;
import java.util.TreeSet;
//Write a program to find the first and last elements of a TreeSet
public class TreeSetFirstandLast {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		int[] num = {10,20,30,40,50};
		
		for(int val : num) {
			set.add(val);
		}
		
		System.out.println("TreeSet : "+set);
		System.out.println("First Element : "+set.getFirst());
		System.out.println("Last Element : "+set.getLast());

	}

}
