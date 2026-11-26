package combineAOP;

import org.springframework.stereotype.Component;

@Component
public class Operation {

	public Operation() {
		super();
	}
	
	public void DisplayHello() {
		System.out.println("Hello");
	}
	
	public int Print() {
		System.out.println("Print Method");
		return 6;
	}
	
	public void Greet() {
		System.out.println("Hello Shravan Ji");
	}

}
