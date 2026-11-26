package demoBean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {
	@Before("bean(*Display)")
	public void beforeDispalyMethods() {
		System.out.println("Executing @Before advice.....");
	}

}
