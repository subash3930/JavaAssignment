package day11Assignment;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// Write a program to display the largest number from given three values.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int a = input.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int b = input.nextInt();
		System.out.println("Enter the 3rd Number: ");
		int c = input.nextInt();
		if (a>b) {
			if(a>c) {
				System.out.println("The Greatest number is 1st number");
				
			}else {
				System.out.println("The Greatest number is 3rd number");	
			}
				
				
		}else if(b>c) {
			System.out.println("The Greatest number is 2nd number");
			
		}else {
			System.out.println("The Greatest number is 3rd number");
		}
		
		System.out.println("Exit");
		input.close();
	}

}
