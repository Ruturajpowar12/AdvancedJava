package setRealLife;


import java.util.HashSet;


//Use HashSet<String> for two employees' skills and find common skills, skills unique to each, and all unique skills

public class CommonEmployeeSkills {

	public static void main(String[] args) {
		
		HashSet<String> emp1 = new HashSet<String>();
		HashSet<String> emp2 = new HashSet<String>();
		
		emp1.add("java");
		emp1.add("c");
		emp1.add("cpp");
		emp1.add("go");
		
		emp2.add("css");
		emp2.add("c");
		emp2.add("html");
		emp2.add("js");
		
		HashSet<String> common = new HashSet<>(emp1);
		common.retainAll(emp2);
		
		System.out.println("Common skills of 2 employees : " + common);
		
		HashSet<String> unique = new HashSet<>(emp1);
		unique.removeAll(emp2);
		
		System.out.println("Unique skills of 2 employees : " + unique);
		
		HashSet<String> allSet = new HashSet<>(emp1);
		allSet.addAll(emp2);
		
		System.out.println("All skills of 2 employees : " +allSet);
		
		
		
		
		

	}

}
