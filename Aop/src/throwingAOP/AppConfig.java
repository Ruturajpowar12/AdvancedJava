package throwingAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages ="throwingAOP")
@EnableAspectJAutoProxy

public class AppConfig {

	
}
