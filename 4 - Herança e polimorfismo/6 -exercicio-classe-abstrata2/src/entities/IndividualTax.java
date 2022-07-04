package entities;

public class IndividualTax extends TaxPayer{

	private Double healthExpen;
	
	public IndividualTax() {
		super();
	}
	
	public IndividualTax(String name, Double anualIncome, Double healthExpen) {
		super(name, anualIncome);
		this.healthExpen = healthExpen;
	}


	public Double getHealthExpen() {
		return healthExpen;
	}

	public void setHealthExpen(Double healthExpen) {
		this.healthExpen = healthExpen;
	}

	@Override
	public double TaxPaid() {
		Double toBePaid;
		
		if(super.getAnualIncome() < 20000.00) {
			toBePaid = super.getAnualIncome() * 0.15 - (healthExpen / 2);
		}	
		else {
			toBePaid = super.getAnualIncome() * 0.25 - (healthExpen / 2);
		}
		
		return toBePaid;
	}

}
