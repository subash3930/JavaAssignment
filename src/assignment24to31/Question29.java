package assignment24to31;

import java.util.Scanner;

public class Question29 {
	// Write a Program for the following Mathematical.
	// a= 1+2/2!+3/3!+4/4!+.....+n/n!
	public static double facto(double num) {
		double fact = 1;
		for (double i = num; i > 1; i--) {
			fact = fact * i;
		}
		return fact;

	}

	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		double j;
		double a = 0.0;
		for (j = 1; j <= n; j++) {
			a = a + (j / (facto(j)));
		}
		System.out.println(" The sum is: " + a);

	}

}
