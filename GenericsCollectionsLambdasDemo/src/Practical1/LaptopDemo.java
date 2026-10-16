package Practical1;

class Laptop<T> {
    T model;
    String companyNm;
    double price;
    double screenSize;

    Laptop(T model, String companyNm, double price, double screenSize) {
        this.model = model;
        this.companyNm = companyNm;
        this.price = price;
        this.screenSize = screenSize;
    }

    void display() {
        System.out.println("Model: " + model + ", Company: " + companyNm + ", Price: " + price + ", Screen Size: " + screenSize);
    }
}

public class LaptopDemo {
    public static void main(String[] args) {
        System.out.println("Ruturaj Powar");
        System.out.println("37");

        Laptop<String> l1 = new Laptop<>("Inspiron 15", "Dell", 55000, 15.6);
        l1.display();
    }
}