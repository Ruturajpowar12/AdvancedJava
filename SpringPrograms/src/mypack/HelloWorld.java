package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    public static void main(String[] args) {

       ApplicationContext ctx = new ClassPathXmlApplicationContext("appConfig.xml");
        GreetingMsg g = (GreetingMsg) ctx.getBean("greet");
        System.out.println(g);
    }
}
