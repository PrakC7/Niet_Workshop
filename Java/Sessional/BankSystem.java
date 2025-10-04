class BankAccount{
	String name;
	double balance;

	BankAccount(String name, double balance){
		assert balance >= 0 : "Initial balance cannot be negative.";
		this.name = name;
		this.balance = balance;
	}

	void deposit(double amount){
		assert amount > 0 : "Deposit amount must be positive.";
		balance += amount;
	}

	void withdraw(double amount){
		assert amount > 0 : "Withdrawal amount must be positive.";
		assert amount <= balance : "Not enough balance to withdraw";
		balance -= amount;
	}

	void showBalance(){
		System.out.println("Account holder: "+name);
		System.out.println("Current balanec: "+balance);
	}
}

public class BankSystem{
	public static void main(String a[]){
		BankAccount acc = new BankAccount("Ram", 5000);
		acc.showBalance();
		acc.deposit(2000);
		System.out.println("2000 deposited");
		acc.showBalance();
		acc.withdraw(1000);
		System.out.println("1000 withdraw");
		acc.showBalance();
	}
}

