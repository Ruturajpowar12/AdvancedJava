package mapConstructorInjection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

		@Bean
		public Map<Integer,String> empDtls(){
			Map<Integer,String> map = new HashMap<>();
			
			map.put(1, "Rohan");
			map.put(2, "Ram");
			map.put(3, "Sham");
			return map;
			
		}
		
		@Bean 
		public Integer deptId() {
			return 101;
		}
		
		@Bean
		public String deptName() {
			return "MCA";
		}
		
		@Bean
		public Department department (Map<Integer,String> empDtls) {
			return new Department(deptId(),deptName(),empDtls);
		}
		
}
