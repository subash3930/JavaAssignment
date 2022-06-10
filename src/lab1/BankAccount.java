package lab1;

public class BankAccount {
	private static long accountnumber = 1000;
	private String name;
	private double balance;

	public BankAccount(String name) {
		accountnumber++;
		this.name = name;
		this.balance = 0;
	}

	public BankAccount(String name, double balance) {
		accountnumber++;
		this.name = name;
		this.balance = balance;
	}

	public void withDraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
		displayInfo(accountnumber, name, balance);

	}

	public void withDraw(double amount, double fee) {
		double newBalance = balance - amount - fee;
		balance = newBalance;
		displayInfo(accountnumber, name, balance);
	}

	public void deposit(double deposit) {
		double newBalance = balance + deposit;
		balance = newBalance;
		displayInfo(accountnumber, name, balance);
	}

	public void deposit(double deposit, double interest) {
		double newBalance = balance + deposit + deposit*0.05;
		balance = newBalance;
		displayInfo(accountnumber, name, balance);
	}

	public void displayInfo(long a, String n, double b) {
		System.out.println("The account number is: " + a);
		System.out.println("The name is: " + n);
		System.out.println("The balance is: " + b);

	}

}
