package calendar;

 import java.util.Calendar;
//Using Calendar, display today's date and calculate the examination date 30 days from today. 
//Display day, month, and year separately.

public class StudentExaminationDate {

	public static void main(String[] args) {
		 
		Calendar today = Calendar.getInstance();
		System.out.println("Today Date : "+today.get(Calendar.DAY_OF_MONTH)+" - "
		+(today.get(Calendar.MONTH)+1)+" - "+today.get(Calendar.YEAR));
		
		Calendar examDate = (Calendar)today.clone();
		
		examDate.add(Calendar.DAY_OF_MONTH,30);
		
		System.out.println("Exam Date : "+examDate.get(Calendar.DAY_OF_MONTH)+" - "
				+(examDate.get(Calendar.MONTH)+1)+" - "+examDate.get(Calendar.YEAR));
	}

}
