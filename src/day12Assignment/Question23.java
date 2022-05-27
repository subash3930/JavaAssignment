package day12Assignment;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// Write a Program to sum 1 to nth natural numbers.
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Number for sum from 1 to numbers");
		int n = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;

		}
		System.out.println("The sum is " + sum);
		input.close();
		}
}
