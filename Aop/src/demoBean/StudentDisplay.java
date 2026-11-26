package demoBean;

import org.springframework.stereotype.Component;

@Component
public class StudentDisplay {
	
	public void showStudentDetails() {
		System.out.println("Showing student details........");
	}
	
	public void displayMarks() {
		System.out.println("Display student marks.....");
	}
}
