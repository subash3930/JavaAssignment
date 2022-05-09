package day5Assignment;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// Write a program to calculate Simple Interest input by the user. Simple
		// Interest = P*T*R/100
		Scanner input = new Scanner(System.in);
		// Scanner Should be capital
		System.out.println(" Enter the P:");
		float p = input.nextFloat();
		System.out.println(" Enter the T:");
		float t = input.nextFloat();
		System.out.println(" Enter the R:");
		float r = input.nextFloat();
		float si = p * t * r / 100;
		System.out.println("Simple Interest is :" + si);
		input.close();
		// This is to clear yellow warning.
        // Control shift + F for formating the code.
	}

}
