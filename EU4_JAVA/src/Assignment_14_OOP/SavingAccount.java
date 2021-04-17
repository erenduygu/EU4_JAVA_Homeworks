package Assignment_14_OOP;

public class SavingAccount extends BankAccount{

	double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public SavingAccount(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
