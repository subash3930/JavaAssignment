package assignment24to31;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// Write a program to print the factorial number of given numbers.
		double fact = 1;
		System.out.println("Enter the number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num ==0) {
			System.out.println("The factorial is 0");
		} else {
			for (int i = num; i > 1; i--) {
				fact = fact * i;
			}
			System.out.println("The factorial is " + fact);

		}
input.close();
	}
}
