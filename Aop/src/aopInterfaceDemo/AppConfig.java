package aopInterfaceDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "aopInterfaceDemo")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Student student() {
        return new Student(1, "Sai", 50, 80, 60);
    }

    @Bean
    public Student student1() {
        return new Student(2, "Soham", 50, 80, 60);
    }
}