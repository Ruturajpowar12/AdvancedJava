package SecondaryMapConstructorInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		BookAutherMap bk = ctx.getBean(BookAutherMap.class);
		System.out.println(bk);

	}

}
