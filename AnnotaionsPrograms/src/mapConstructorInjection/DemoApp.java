package mapConstructorInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoApp {
	public static void main(String args[]) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Department dept = ctx.getBean(Department.class);
		System.out.println(dept);
	}
}
