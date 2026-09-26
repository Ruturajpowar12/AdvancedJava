package wildcardRealLife;

import java.util.ArrayList;
import java.util.List;

//A university course registration system receives a collection that may store Student objects.
//Write a method using List<? super Student> that adds multiple Student objects.
//Demonstrate with List<Student> and List<Object>.

class Student12{
	String name;
	
	Student12(String name){
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class UniversityCourseRegistration {

	public static void addStudents(List<? super Student12> list, Student12... students) {
        for (Student12 s : students) list.add(s);
    }

    public static void main(String[] args) {
        List<Student12> studentList = new ArrayList<>();
        addStudents(studentList, new Student12("Alice"), new Student12("Bob"));
        System.out.println("Student list: " + studentList);

        List<Object> objectList = new ArrayList<>();
        addStudents(objectList, new Student12("Charlie"));
        System.out.println("Object list: " + objectList);
    }

}
