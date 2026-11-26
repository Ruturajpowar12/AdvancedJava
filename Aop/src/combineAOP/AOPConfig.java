
package combineAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {

    @Pointcut("execution(* combineAOP.Operation.Display*(..))")
    public void pointCutMeth() {
    }

    @Pointcut("pointCutMeth() || execution(* combineAOP.Operation.Print*(..))")
    public void myadvice2() {
    }

    @Before("myadvice2()")
    public void logAdvice(JoinPoint jp) {

        System.out.println("Additional concern with combine expression");

        System.out.println("Method executed: " + jp.getSignature());
    }
}
