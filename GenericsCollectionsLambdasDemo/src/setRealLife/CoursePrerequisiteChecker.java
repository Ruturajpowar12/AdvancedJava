package setRealLife;

import java.util.HashSet;

//A university has prerequisite courses and courses completed by a student.
//Use HashSet<String> to determine whether all prerequisites are completed

public class CoursePrerequisiteChecker {
	public static boolean arePrerequisitesMet(HashSet<Object> prerequisites, HashSet<Object> completedCourses) {
        return completedCourses.containsAll(prerequisites);
    }

    public static void main(String[] args) {
    	HashSet<Object> completed = new HashSet<>();
        completed.add("CS101");
        completed.add("CS102");
        completed.add("MATH101");

        HashSet<Object> required = new HashSet<>();
        required.add("CS101");
        required.add("MATH101");

        boolean canTakeCourse = arePrerequisitesMet(required, completed);
        System.out.println(canTakeCourse);
    }

}
