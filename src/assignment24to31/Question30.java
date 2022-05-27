package assignment24to31;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		//Write a program to print the Fibonacci series. 1 1 2 3 5 8 
		System.out.println("Enter the number:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int j;
		int f1 = 0;// intilization
		int f2=1;// initilization
		int f3;// setting 1st number
		for (j = 1; j <= n; j++) {
			f3=f1+f2;
			f2=f1;// taking f1 value
			f1=f3;// taking f3 value
			System.out.print(f3+" ");
			
		}

	}

}
