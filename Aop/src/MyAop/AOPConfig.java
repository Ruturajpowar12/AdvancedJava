
package MyAop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {

    Logger log = Logger.getLogger("AOP-Log");

    @Pointcut("execution(* MyAop.EmployeeOperation.calcSalary(..))")
    public void pointcutConfig1() {
    }

    @After("pointcutConfig1()")
    public void logForSalCal(JoinPoint jp) {

        log.info("AOP After Advice: After Salary Calculation");

        log.info("Method Executed: " + jp.getSignature());
    }
}
