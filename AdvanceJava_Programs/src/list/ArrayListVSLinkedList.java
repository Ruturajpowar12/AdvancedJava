package list;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		
		 ArrayList<Integer> al = new ArrayList<>();
	        LinkedList<Integer> ll = new LinkedList<>();
	        int iterations = 100000;

	        // ArrayList Test
	        long start = System.nanoTime();
	        for (int i = 0; i < iterations; i++) al.add(0, i);
	        System.out.println("ArrayList start insert: " + (System.nanoTime() - start) + " ns");

	        // LinkedList Test
	        start = System.nanoTime();
	        for (int i = 0; i < iterations; i++) ll.add(0, i);
	        System.out.println("LinkedList start insert: " + (System.nanoTime() - start) + " ns");
	}

}
