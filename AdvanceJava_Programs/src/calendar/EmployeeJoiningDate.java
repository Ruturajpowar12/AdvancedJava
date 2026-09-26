package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//Using Calendar, set an employee's joining date, calculate the first anniversary 
//by adding one year, and display the day of the week of joining.

public class EmployeeJoiningDate {

	public static void main(String[] args) {
		
		    Calendar joining = Calendar.getInstance();
	        joining.set(2024, Calendar.MARCH, 15);
	        
	        SimpleDateFormat dayName = new SimpleDateFormat("EEEE");
	        System.out.println("Joining Day: " + dayName.format(joining.getTime()));

	        Calendar anniversary = (Calendar) joining.clone();
	        anniversary.add(Calendar.YEAR, 1);
	        System.out.println("First Anniversary: " + anniversary.get(Calendar.DAY_OF_MONTH) + "/" +
	                (anniversary.get(Calendar.MONTH) + 1) + "/" + anniversary.get(Calendar.YEAR)); 

	}

}
