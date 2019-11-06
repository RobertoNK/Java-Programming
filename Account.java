
public class Account { 
	
	private double balance;
	
	public Account() {
		
		balance = 0;
	}
	
	public Account(double initialBalance) {
		balance = initialBalance;
	}
	
	public void deposti(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		balance-=amount;
	}
	public void close() {
		balance = 0;
	}
	
	public double getBalance() {
		return balance;
	}
		
}
