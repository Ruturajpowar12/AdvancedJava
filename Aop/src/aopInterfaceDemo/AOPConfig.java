package aopInterfaceDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {

    @Pointcut("execution(* aopInterfaceDemo.StudOperation.*(..))")
    public void pointCutMth() {
    }

    @Before("pointCutMth()")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("[AOP LOG] Method executed: "
                + joinPoint.getSignature());
    }
}