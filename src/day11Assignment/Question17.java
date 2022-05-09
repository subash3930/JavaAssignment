package day11Assignment;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// Write a program to calculate leap year.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = input.nextInt();
		if (year % 4 == 0) {
			System.out.println("The Year is Leap Year");
		}else {
		System.out.println("The Year is not Leap Year");
		}
      input.close();

	}

}
