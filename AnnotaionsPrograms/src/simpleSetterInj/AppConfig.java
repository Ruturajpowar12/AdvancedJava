
package simpleSetterInj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        Address addr = new Address();
        addr.setPlotNo(101);
        addr.setStreet("main road");
        addr.setCity("Kolhapur");
        addr.setPinCode(416232);
        return addr;
    }

    @Bean
    public Company company() {
        Company com = new Company();
        com.setCompanyId(1);
        com.setCompanyNm("MicroSoft");
        com.setAddr(address());

        return com;
    }
}
