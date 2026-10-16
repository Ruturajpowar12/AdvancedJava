//
////package ubale;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ListIterator;
//
//class Student<T> {
//    T rollNo;
//    String name;
//    double m1, m2, m3;
//
//    Student(T rollNo, String name, double m1, double m2, double m3) {
//        this.rollNo = rollNo;
//        this.name = name;
//        this.m1 = m1;
//        this.m2 = m2;
//        this.m3 = m3;
//    }
//
//    void display() {
//        System.out.println("Roll No: " + rollNo);
//        System.out.println("Name: " + name);
//        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
//    }
//}
//
//public class StudentList {
//    public static void main(String[] args) {
//
//        System.out.println("Macchindranath Ubale");
//        System.out.println("21");
//
//        List<Student<Integer>> list = new ArrayList<>();
//
//        list.add(new Student<>(1, "Rahul", 80, 85, 90));
//        list.add(new Student<>(2, "Amit", 75, 82, 88));
//        list.add(new Student<>(3, "Priya", 90, 92, 95));
//
//        ListIterator<Student<Integer>> itr = list.listIterator();
//
//        System.out.println("\nStudents in Forward Direction:");
//        while (itr.hasNext()) {
//            itr.next().display();
//            System.out.println();
//        }
//
//        System.out.println("Students in Reverse Direction:");
//        while (itr.hasPrevious()) {
//            itr.previous().display();
//            System.out.println();
//        }
//    }
//}
