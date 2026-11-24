package simpleConstructorInj;

public class Company {
	
	int companyId;
	String companyNm;
	Address addr;


	public Company(int companyId, String companyNm, Address addr) {
		super();
		this.companyId = companyId;
		this.companyNm = companyNm;
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Company \ncompanyId=" + companyId + ",\ncompanyNm=" + companyNm + ",\nAddress=" + addr ;
	}

	
}
