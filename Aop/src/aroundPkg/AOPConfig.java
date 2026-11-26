package aroundPkg;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {
	@Pointcut("execution(* StudOperation.totalMarks(..))")
	public void pointCutExp1() {}
	
	@Around("pointCutExp1()")
	public Object studMarks(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("someone access marks method....");
		
		Object result = pjp.proceed();
		
		System.out.println("Method excuted successfully.Result="+result);

		return result;
	}
	

	
}
