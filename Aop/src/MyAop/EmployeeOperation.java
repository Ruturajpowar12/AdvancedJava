package MyAop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeOperation {

    public double calcSalary(double salary) {

        System.out.println("Inside salary calculation method....");

        return salary + (salary * 0.8);
    }
}