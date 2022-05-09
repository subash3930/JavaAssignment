package day11Assignment;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// Write a Program to accept three sides of a triangle and 
		// display which kind of triangle is formed.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st side: ");
		int a = input.nextInt();
		System.out.println("Enter the 2nd side: ");
		int b = input.nextInt();
		System.out.println("Enter the 3rd side: ");
		int c = input.nextInt();
		if((a==b)&&(b==c)) {
			System.out.println("The triangle is  equilateral ");	
		}else if((a==b)||(b==c)||(a==c)) {
			System.out.println("The triangle is  isosceles ");
		}else if((a!=b)&&(b!=c)) {
			System.out.println("The triangle is  Scalene ");
		}
	System.out.println("exit");
	input.close();

	}

}
