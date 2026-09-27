package Generic;
import java.util.ArrayList;
//Create a generic class Stack<T> that implements push(), pop(), and display() operations

class Stack <T>{
	ArrayList<T> stack = new ArrayList<>();
	
	public void push(T item) {
		stack.add(item);
	}
	public T pop() {
		if(stack.isEmpty()) {
			System.out.println("Stack is empty!");
		}
		
		return stack.remove(stack.size() - 1);
	}
	
	public void display() {
		System.out.println(stack);
	}
	
}

public class GenericStack {
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		
		//add element in stack
		s.push(10);
		s.push(20);
		s.push(40);
		s.push(60);
		
		//display stack
		s.display();
		
		//remove element from stack
		s.pop();
		s.pop();
		
		s.display();
	}

}
