package mapConstructorInjection;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {
	Integer deptId;
	String deptName;
	Map<Integer,String> empDtls;
	
	@Autowired
	public Department(Integer deptId, String deptName, Map<Integer, String> empDtls) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.empDtls = empDtls;
	}
	@Override
	public String toString() {
		return "Department \ndeptId=" + deptId + ", \ndeptName=" + deptName + ", \nempDtls=" + empDtls ;
	}
	
	
}
