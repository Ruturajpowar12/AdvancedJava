package list;
import java.util.LinkedList;
import java.util.Queue;

//Write a program to create a LinkedList<Integer> and use it as a queue.

public class LinkedListasQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.print("Queue : ");
		for(int val : q) {
			System.out.print(val+" ");
		}
		
		System.out.print("\nQueue peek : "+q.peek());
		
		q.poll();
		q.remove();
		
		System.out.print("\nAfter Remove Queue : ");
		for(int val : q) {
			System.out.print(val+" ");
		}
		
		System.out.println("\nQueue isEmpty : "+q.isEmpty());
		//isEmpty
		
	}

}
