package simpleSetterInj;

public class Company {
	
	int companyId;
	String companyNm;
	Address addr;
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public void setCompanyNm(String companyNm) {
		this.companyNm = companyNm;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Company \ncompanyId=" + companyId + ",\ncompanyNm=" + companyNm + ",\nAddress=" + addr ;
	}

	
	
	
	
}
