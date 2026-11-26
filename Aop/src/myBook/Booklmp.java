package myBook;

import org.springframework.stereotype.Component;

@Component
public class Booklmp implements BookOperation {

    public void calculateDiscount(Book b) {

        double finalPrice = b.price - 10;

        System.out.println(b);

        System.out.println("Discount = 10");

        System.out.println("Final Price = " + finalPrice);
    }
}