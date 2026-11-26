package aroundPkg;

import org.springframework.stereotype.Component;

@Component
public class StudOperation {
	public StudOperation() {
		super();
		
	}
	
	public int totalMarks(Student stud) {
		return stud.marks1+stud.marks2+stud.marks3;
		
	}
	
	public String getGrade(Integer totalMarks) {
		if(totalMarks>=240)
			return "A Grade";
		else if(totalMarks>=150)
			return "B Grade";
		else
			return "Pass Grade";
		
		
	}
	
	public int getMarks1(Student stud) {
		return stud.marks1;
	}
	

}
