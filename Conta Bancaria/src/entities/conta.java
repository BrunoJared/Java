package entities;

public class conta {
	private String holder;
	private int number;
	private double balance;
	


	
	
	
	
	public conta(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}


	public conta(String holder, int number, double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	
	}


	

	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public int getNumber() {
		return number;
	}


	


	public double getBalance() {
		return balance;
	}


	public void deposit(double conta) {
		balance += conta;
	}
	
	public void withdraw(double conta) {
		balance -= conta + 5.0;
	}
	
	public String toString(){
		return "Account "
				+ number
				+ ", Holder:"
				+ holder
				+", Balance: $"
				+ String.format("%.2f", balance);
	}

	
	}



