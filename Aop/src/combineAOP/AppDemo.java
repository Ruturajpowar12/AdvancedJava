package combineAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo {
	public static void main(String args[]) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Operation e= (Operation) ctx.getBean(Operation.class);
		
		System.out.println("Calling msg...");
		e.DisplayHello();
		
		System.out.println("--------------");
		System.out.println("Calling printThis");
		e.Print();
		System.out.println(" ");
		e.Greet();
		
	}
	


}
