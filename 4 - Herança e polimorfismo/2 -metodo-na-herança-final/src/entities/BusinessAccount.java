package entities;

// VAI TER TODOS OS DADOS E COMPORTAMENTOS DA CLASSE ACCOUNT
public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super(); // caso seja adicionado uma lógica na classe principal, vai para a herdada
	}

	// CONSTRUTOR 
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // O QUE FOI HERDADO
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double ammount) {	
		if (ammount <= loanLimit) {
			balance = balance + ammount -10;
		}
	}
	
	@Override
	public void withDraw(double ammount) {
		super.withDraw(ammount);
		balance = balance - 2;

	}
}
