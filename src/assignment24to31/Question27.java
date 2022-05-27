package assignment24to31;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// Write a Program to sum each digit of given number as well as product. 
		//456 =>4*5*6 and 4+5+6
		int pnumber;
		String decision=" ";
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number");
			int number = input.nextInt();
			int rsum=0;
			int rproduct=1;
			int remainder;
			pnumber=number;
			if (number <= 9) {
				System.out.println("There is no sum or product for this number ");
			} else {
				while (number != 0) {
					remainder = number % 10;
					rsum = rsum+remainder;
					rproduct=rproduct*remainder;
					number = number / 10;
				}

				System.out.println(rsum +" and "+rproduct+ " is the sum and product of  " + pnumber);
				

			}
			System.out.println("Would you like to continue? Press Y||N");
			decision = input.next();
		} while (decision.equalsIgnoreCase("Y"));


	}

}
