package myBook;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {

    @Pointcut("execution(* myBook.BookOperation.*(..))")
    public void pointCutMth() {
    }

    @Before("pointCutMth()")
    public void logBefore(JoinPoint jp) {

        System.out.println("[AOP LOG] Book discount calculation");

    }
}