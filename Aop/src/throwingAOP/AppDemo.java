package throwingAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo {
	
	public static void main(String args[]) {
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		Operation e=(Operation) ctx.getBean(Operation.class);
		try {
			System.out.println("calling printThis()...");
			e.printThis();
			System.out.println("-------------");
			System.out.println("calling printErr()...");
			e.printErr();
			System.out.println("After printErr() call........" );
		}
		
		catch(Exception ex){
			System.out.println("Execption Handled.......\n"+ex);
		}
	}

}
