
package practical_1;

class Car<T> {
    T model;
    String companyNm;
    double price;
    double engineCapacity;

    // Constructor
    Car(T model, String companyNm, double price, double engineCapacity) {
        this.model = model;
        this.companyNm = companyNm;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    // Display car details
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Company Name: " + companyNm);
        System.out.println("Price: " + price);
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

public class GenericCar {
    public static void main(String[] args) {

        System.out.println("Shreya Patil");
        System.out.println("54");

        Car<String> c1 = new Car<>("Swift", "Maruti Suzuki", 700000, 1197);
        Car<String> c2 = new Car<>("Thar", "Mahindra", 1500000, 2184);
        c1.display();
        c2.display();
    }
}
