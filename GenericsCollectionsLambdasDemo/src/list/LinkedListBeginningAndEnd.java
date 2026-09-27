package list;
import java.util.LinkedList;
//Write a program using LinkedList<String> to implement
//insertion and deletion at the beginning and end of the list.

public class LinkedListBeginningAndEnd {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.addFirst("A");
		ll.addFirst("C");
		ll.addFirst("D");
		
		ll.add(3, "G");
		ll.addLast("B");
		ll.addLast("E");
		System.out.println("List After insertion :" + ll);
		
		
		ll.removeFirst();
		ll.removeLast();
		ll.remove();
		System.out.println("List After deletion :" + ll);
	}

}
