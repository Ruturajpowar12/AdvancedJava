package throwingAOP;

import org.springframework.stereotype.Component;

@Component
public class Operation {

	public Operation() {
		super();
	}
	
	public void printThis() {
		System.out.println("hello from printThis()");
	}
	
	public void printErr() {
		System.out.println("Exception raised");
				throw new IllegalArgumentException();
	}
}
