package entities;

public class Account {
	
		private int accountNumber;
		private String holder;
		private double accountBalance;
	
	public Account() {
		
	}
	
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
}
	
	public Account(int accountNumber, String holder, double initialValue) {
			this.accountNumber = accountNumber;
			this.holder = holder;
			deposit(initialValue);
	}


	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	
	public void deposit (double value) {
		accountBalance = accountBalance + value;
	}
	
	public void withdraw (double value) {
		accountBalance = accountBalance - value - 5;
	}

	public String toString() {
		return 
				"Account " 
				+ accountNumber
				+ ", "
				+ "Holder: "
				+ holder
				+ ", "
				+ "Balance: "
				+ "$ "
				+ accountBalance;
	}
}
