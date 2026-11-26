package aopInterfaceDemo;

import org.springframework.stereotype.Component;

@Component
public class StudOperation implements StudentResult {

    public void getResult(Student s) {

        double avg = (s.marks1 + s.marks2 + s.marks3) / 3.0;

        System.out.println(s);

        if (avg >= 45.0)
            System.out.println("you are pass with avg=" + avg);

        else
            System.out.println("you are failed as avg=" + avg);
    }
}