package Generic;
import java.util.ArrayList;

//Create a generic class Queue<T> that supports insertion, deletion, and display operations

class Queue<T>{
	
	ArrayList<T> queue = new ArrayList<>();
	
	public void insert(T val) {
		queue.addLast(val);
	}
	
	public T remove() {
		if(queue.isEmpty()) {
			System.out.println("Queue is Empty!");
		}
		return queue.removeFirst();
	}
	
	public void display() {
		System.out.println(queue);
	}
	
	
}
public class GenericQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>();
		
		//add element in stack
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		
		
		//display stack
		q.display();
		
		//remove element from stack
		q.remove();
		q.remove();
		
		q.display();

	}

}
