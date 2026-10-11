package Practical1;

class Laptop<T> {
    T model;
    String companyNm;
    double price;
    double screenSize;

    Laptop(T model, String companyNm, double price,
           double screenSize) {
        this.model = model;
        this.companyNm = companyNm;
        this.price = price;
        this.screenSize = screenSize;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Company: " + companyNm);
        System.out.println("Price: " + price);
        System.out.println("Screen Size: " + screenSize);
    }
}

public class LaptopDemo {
    public static void main(String[] args) {
        Laptop<String> l1 =
            new Laptop<>("Inspiron 15", "Dell", 55000, 15.6);

        l1.display();
    }
}
