package MyAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp= ctx.getBean(Employee.class);
		EmployeeOperation empOp= ctx.getBean(EmployeeOperation.class);
		
		System.out.println("Calling CalcSalary method...");
		double newSal= empOp.calcSalary(50000.00);
		
		System.out.println("Employee Dtls-"+emp);
		System.out.println("New Salary="+newSal);
	}

}
