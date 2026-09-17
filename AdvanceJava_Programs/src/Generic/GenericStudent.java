package Generic;
//Create a generic class Student<T> where the type parameter represents the student's registration number. 
//Store and display student details

class Student<T>{
	T regNo;
	String name;
	
	Student(T regNo, String name){
		this.regNo = regNo;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Registration number :"+regNo +"\nName :"+name);
	}
	
}

public class GenericStudent {

	public static void main(String[] args) {
		Student<Integer> s1 = new Student<>(101,"Ruturaj");
		s1.display();
		

	}

}
