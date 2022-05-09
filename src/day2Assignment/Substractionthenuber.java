package day2Assignment;

import java.util.Scanner;

public class Substractionthenuber {
//Write a program to find the sum and average of two numbers 
	// input by User (using Scanner class).
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" Enter the num1:");
		float num1= input.nextFloat();
		System.out.println(" Enter the num2:");
		float num2= input.nextFloat();
		float sub = num1-num2;
		System.out.println("The substraction of "+num1+" and "+num2+" is: "+sub);
input.close();
	}

}
