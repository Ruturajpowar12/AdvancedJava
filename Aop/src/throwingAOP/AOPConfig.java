package throwingAOP;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {
	
	@AfterThrowing(value="execution(* Operation.print*(..))")
	public void afterThrowningAdvice() {
		System.out.println("From AOP Class...");
	}

}
