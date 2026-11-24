package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorPerson {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appConfig.xml");
		Person p = (Person) ctx.getBean("personInfo");
		System.out.println(p);
		

	}

}
