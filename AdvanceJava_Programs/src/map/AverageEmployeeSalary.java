package map;

import java.util.HashMap;

//Write a program to store employee IDs and salaries using HashMap and calculate the average salary

public class AverageEmployeeSalary {

	public static void main(String[] args) {
		HashMap<Integer, Double> salaries = new HashMap<>();
        salaries.put(1, 50000.0); 
        salaries.put(2, 60000.0);
        salaries.put(3, 45000.0);
        
        double total = 0;
        
        for(double sal : salaries.values()) {
        	total += sal;
        }
        System.out.println("Average is : "+(total/salaries.size()));
	}

}
