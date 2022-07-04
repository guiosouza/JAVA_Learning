package entities;

public class CompanyTax extends TaxPayer{
	
	private Integer employees;
	
	public CompanyTax() {
		
	}

	public CompanyTax(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double TaxPaid() {
		Double toBePaid = super.getAnualIncome() * 0.16;
		
		if(employees > 10) {
			toBePaid = super.getAnualIncome() * 0.14;
		}	
		
		return toBePaid;
	}

}
