package day10Assignment;

import java.util.Scanner;

public class Question14 {
//Write a program to relate two integers entered by the user using = =or > or < sign.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number 1 to check");
		int num1 = input.nextInt();
		System.out.println("Enter the number 2 to check");
		int num2 = input.nextInt();

		if (num1 == num2) {
			System.out.println("number are equal");

		} else {
			if (num1 > num2) {
				System.out.println("The num1 " + num1 + " is greater ");
			}else {
			System.out.println("The num2  " + num2 + " is greater ");
			}
		}

	}

}
