package day11Assignment;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// Write a program to find the given number is even or odd.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println("The number is even");
		}else {
		System.out.println("The number is odd");
		}
      input.close();
	}
}
