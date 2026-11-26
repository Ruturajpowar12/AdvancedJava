package aopInterfaceDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo {

    public static void main(String args[]) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student stuBean = ctx.getBean("student", Student.class);

        StudentResult studOpBean = ctx.getBean(StudentResult.class);

        System.out.println("Calling First Student Result...");

        Student s = ctx.getBean("student", Student.class);
        studOpBean.getResult(s);

        System.out.println("-------------------------");

        System.out.println("Calling Second Student Result...");

        s = ctx.getBean("student1", Student.class);
        studOpBean.getResult(s);
    }
}