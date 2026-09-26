package wildcardRealLife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//A university application stores marks using Integer or Double.
//Write a method using List<? extends Number> to calculate 
//the average marks regardless of the numeric type.

public class UniversityStudentMarks {
	
	public static void calAverage(List<? extends Number> marks) {
		double total = 0;
		
		for(Number val : marks) {
			total += val.doubleValue();
		}
		System.out.println("Average marks : "+(total/marks.size()));
	}

	public static void main(String[] args) {
		
		List<Number> marks = new ArrayList<>();
		marks.addAll(Arrays.asList(90,89.1,45,60.2,39));
		
		calAverage(marks);
	}

}
