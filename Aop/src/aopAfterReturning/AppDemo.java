package aopAfterReturning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo {
	
	public static void main(String args[]) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student stuBean=ctx.getBean(Student.class);
		
		StudOperation studOpBean=ctx.getBean(StudOperation.class);
		
		int ttlMarks = studOpBean.totalMarks(stuBean);
		System.out.println("Total Marks-"+ttlMarks);
		System.out.println("Garde-"+studOpBean.getGrade(ttlMarks));
		System.out.println("AOP...."+stuBean);
		
		System.out.println("----------------------------------");
		System.out.println("Marks 1="+studOpBean.getMarks1(stuBean));
	}

}
