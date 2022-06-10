package lab1;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String decision = "";
		do {
			System.out.println("Enter the operation: Deposit||Withdraw");
			String operation = input.next();
			switch (operation) {
			case "Deposit":
				System.out.println(" Do you want to open with balance: Y|N");
				String choice = input.next();
				if (choice.equalsIgnoreCase("Y")) {
					System.out.println("Enter the name: ");
					String name = input.next();
					System.out.println("Enter the balance:  ");
					double balance = input.nextDouble();
					BankAccount ob = new BankAccount(name, balance);
					System.out.println(" Do you want to deposit with interest: Y|N");
					String ans = input.next();
					if (ans.equalsIgnoreCase("Y")) {
						System.out.println("Enter the amount to deposit:");
						double deposit = input.nextDouble();
						System.out.println("Enter the interest:");
						double interest = input.nextDouble();
						ob.deposit(deposit, interest);
					} else {
						System.out.println("Enter the amount to deposit:");
						double deposit = input.nextDouble();
						ob.deposit(deposit);
					}

				} else {
					System.out.println("Enter the name: ");
					String name = input.next();
					BankAccount ob = new BankAccount(name);
					System.out.println(" Do you want to deposit with interest: Y|N");
					String ans = input.next();
					if (ans.equalsIgnoreCase("Y")) {
						System.out.println("Enter the amount to deposit:");
						double deposit = input.nextDouble();
						System.out.println("Enter the interest:");
						double interest = input.nextDouble();
						ob.deposit(deposit, interest);
					} else {
						System.out.println("Enter the amount to deposit:");
						double deposit = input.nextDouble();
						ob.deposit(deposit);
					}

				}

				break;

			case "Withdraw":
				System.out.println(" Do you want to open  with balance: Y|N");
				String choice1 = input.next();
				if (choice1.equalsIgnoreCase("Y")) {
					System.out.println("Enter the name: ");
					String name = input.next();
					System.out.println("Enter the balance:  ");
					double balance = input.nextDouble();
					BankAccount ob1 = new BankAccount(name, balance);
					System.out.println(" Do you want to withdraw with fee: Y|N");
					String ans = input.next();
					if (ans.equalsIgnoreCase("Y")) {
						System.out.println("Enter the amount to withdraw:");
						double withdraw = input.nextDouble();
						System.out.println("Enter the fee:");
						double fee = input.nextDouble();
						ob1.withDraw(withdraw, fee);
					} else {
						System.out.println("Enter the amount to withdraw:");
						double withdraw = input.nextDouble();
						ob1.withDraw(withdraw);;
					}

				} else {
					System.out.println("Enter the name: ");
					String name = input.next();
					BankAccount ob1 = new BankAccount(name);
					System.out.println(" Do you want to deposit with interest: Y|N");
					String ans = input.next();
					if (ans.equalsIgnoreCase("Y")) {
						System.out.println("Enter the amount to withdraw:");
						double withdraw = input.nextDouble();
						System.out.println("Enter the fee:");
						double fee = input.nextDouble();
						ob1.withDraw(withdraw, fee);;
					} else {
						System.out.println("Enter the amount to withdraw:");
						double withdraw = input.nextDouble();
						ob1.withDraw(withdraw);
					}

				}

				break;

			
//
//			BankAccount ob = new BankAccount("subash", 1500);
//			ob.deposit(5);
//			System.out.println("=====");
//			System.out.println("Deposit with fee summary");
//			BankAccount ob1 = new BankAccount("shyam", 2000);
//			ob1.deposit(15, 5);
//			System.out.println("**********");
//			System.out.println("Withdraw summary");
//			BankAccount ob2 = new BankAccount("hari", 1000);
//			ob2.withDraw(10);
//			System.out.println("+++++++++++++");
//			System.out.println("Withdraw with fee summary");
//			BankAccount ob3 = new BankAccount("gopal", 3000);
//			ob3.withDraw(10, 4);
//			System.out.println("-------------");
//			System.out.println("Withdraw with fee summary");
//			BankAccount ob4 = new BankAccount("vall");
//			ob4.withDraw(10, 4);
//			System.out.println("-------------");
//			System.out.println("Withdraw summary");
//			BankAccount ob5 = new BankAccount("sall");
//			ob5.withDraw(10);
//			System.out.println("=====");
//			System.out.println("Deposit summary");
//			BankAccount ob6 = new BankAccount("sub");
//			ob6.deposit(5);
//			System.out.println("=====");
//			System.out.println("Deposit summary");
//			BankAccount ob7 = new BankAccount("sam");
//			ob7.deposit(15);
		default:
			System.out.println("Wrong Choice");
			}
			System.out.println("Would you like to continue? Press Y||N");
			decision = input.next();
		} while (decision.equalsIgnoreCase("Y"));
input.close();
	}}

