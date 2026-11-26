package demoBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {
	
	public static void main(String args[]) {
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDisplay studentDisplay = ctx.getBean(StudentDisplay.class);
		
		studentDisplay.showStudentDetails();
		studentDisplay.displayMarks();
		
		System.out.println("-------------");
				
	}
}