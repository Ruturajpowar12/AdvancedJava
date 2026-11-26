package aopAfterReturning;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {
	@Pointcut("execution(* StudOperation.totalMarks(..))")
	public void pointCutExp1() {}
	
	@AfterReturning(pointcut="pointCutExp1()")
	public void afterReturningAdv() {
		System.out.println("someone access marks method....");
		
	}
	
	@Pointcut("execution(* StudOperation.totalGrade(..))")
	public void pointCutExp2() {}
	
	@AfterReturning("pointCutExp2()")
	public void afterReturningAdv2() {
		System.out.println("someone access marks method....");
		
	}
	
	/*@AfterReturning(pointcut="pointCutExp2()",returning="grade")
	public void afterReturningAdv2(Object grade) {
		System.out.println("someone access marks method....");
		System.out.println("grade in AOp class-"+grade");
	}*/
	
}
