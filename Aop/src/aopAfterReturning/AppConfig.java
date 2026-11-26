package aopAfterReturning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="aopAfterReturning")
@EnableAspectJAutoProxy
public class AppConfig {
	@Bean
	public Student stuBean() {
		return new Student(1,"Sai",50,80,60);
	}

}
