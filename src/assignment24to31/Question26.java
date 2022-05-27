package assignment24to31;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// Write a Program to reverse the given number.
		// 123 => 321
		
		int pnumber;
		String decision=" ";
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number");
			int number = input.nextInt();
			int rnumber=0;
			int remainder;
			pnumber=number;
			if (number <= 9) {
				System.out.println("There is no reverse number for this");
			} else {
				while (number != 0) {
					remainder = number % 10;
					rnumber = rnumber * 10 + remainder;
					number = number / 10;
				}

				System.out.println(rnumber + " is the reverse of  " + pnumber);
				

			}
			System.out.println("Would you like to continue? Press Y||N");
			decision = input.next();
		} while (decision.equalsIgnoreCase("Y"));

	}

}
