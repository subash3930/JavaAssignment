package day8Assignment;

import java.util.Scanner;

public class Question10C {

	public static void main(String[] args) {
		// Write a Program for the following Mathematical Function.
        // x=-b+ (sqrt(b2-4ac)/2a)

		Scanner input = new Scanner(System.in);
		System.out.println(" Time to calculate x===========:");
		System.out.println(" Enter a:");
		float a = input.nextFloat();
		System.out.println(" Enter b:");
		float b = input.nextFloat();
		System.out.println(" Enter c:");
		float c = input.nextFloat();
		double x= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println(" The value of is:"+x);
		input.close();

	}

}
