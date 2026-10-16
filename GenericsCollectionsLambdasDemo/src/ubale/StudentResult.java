
package ubale;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    void calculateResult(float m1, float m2, float m3) {
        float total = m1 + m2 + m3;
        float percentage = total / 3;

        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}

class MCAStudent extends Student {
    MCAStudent(String name) {
        super(name);
    }
}

class BEStudent extends Student {
    BEStudent(String name) {
        super(name);
    }
}

public class StudentResult {
    public static void main(String[] args) {

        System.out.println("Macchindranath Ubale");
        System.out.println("21");

        MCAStudent mca = new MCAStudent("Rahul");
        BEStudent be = new BEStudent("Amit");

        System.out.println("\nMCA Student Result:");
        mca.calculateResult(80, 75, 90);

        System.out.println("\nBE Student Result:");
        be.calculateResult(65, 70, 55);
    }
}
