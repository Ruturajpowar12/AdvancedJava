
package simpleConstructorInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Autowired
	Address addr;

    @Bean
    public Address address() {
        Address addr = new Address(101,"main road","Kolhapur",416232);
      
        return addr;
    }

    @Bean
    public Company company() {
        Company com = new Company(13,"Google",addr);
       
        return com;
    }
}
