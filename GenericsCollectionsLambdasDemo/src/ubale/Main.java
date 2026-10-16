//
//package ubale;
//
//class Person {
//    String name;
//    int age;
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//
////class Student extends Person {
////    int rollNo;
////
////    Student(String name, int age, int rollNo) {
////        super(name, age);
//        this.rollNo = rollNo;
//    }
//
//    void calculateResult(float m1, float m2, float m3) {
//        float total = m1 + m2 + m3;
//        float percentage = total / 3;
//
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Roll Number: " + rollNo);
//        System.out.println("Total Marks: " + total);
//        System.out.println("Percentage: " + percentage + "%");
//
//        if (percentage >= 40) {
//            System.out.println("Result: Pass");
//        } else {
//            System.out.println("Result: Fail");
//        }
//
//        System.out.println("--------------------");
//    }
//}
//
//class MCAStudent extends Student {
//    MCAStudent(String name, int age, int rollNo) {
//        super(name, age, rollNo);
//    }
//}
//
//class BEStudent extends Student {
//    BEStudent(String name, int age, int rollNo) {
//        super(name, age, rollNo);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MCAStudent mca = new MCAStudent("Macchindranath", 24, 110);
//        BEStudent be = new BEStudent("Vikas", 22, 102);
//
//        System.out.println("MCA STUDENT RESULT");
//        mca.calculateResult(70, 75, 80);
//
//        System.out.println("BE STUDENT RESULT");
//        be.calculateResult(65, 80, 95);
//    }
//}
