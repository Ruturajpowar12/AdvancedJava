package myBook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo {

    public static void main(String args[]) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Book b = ctx.getBean(Book.class);

        BookOperation bo = ctx.getBean(BookOperation.class);

        System.out.println("showing Book Discount Method...");

        bo.calculateDiscount(b);

    }
}