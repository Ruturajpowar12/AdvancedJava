package MyAop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "MyAop")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Employee employee() {

        return new Employee("Shravan", "Developer", "IT");
    }
}