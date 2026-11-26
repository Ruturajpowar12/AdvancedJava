package myBook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "myBook")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Book book() {

        return new Book(101, "Java Programming", 500);
    }
}