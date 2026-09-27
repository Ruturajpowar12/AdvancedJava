package list;
import java.util.ArrayList;
//Write a program to merge two ArrayList<Integer> objects into a single list.


public class MergeArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);  l1.add(2);
		l1.add(3);  l1.add(4);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(5);  l2.add(6);
		l2.add(7);  l2.add(8);
		
		ArrayList<Integer> merge = new ArrayList<Integer>();
		
		merge.addAll(l1);
		merge.addAll(l2);
		
		System.out.println(merge);
		
		

	}

}
