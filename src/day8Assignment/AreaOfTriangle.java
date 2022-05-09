package day8Assignment;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// Write a Program for the following Mathematical Function.
        // area=sqrt s(s-a)(s-b)(s-c)

		Scanner input = new Scanner(System.in);
		System.out.println(" Time to calculate area of triangle===========:");
		System.out.println(" Enter a:");
		float a = input.nextFloat();
		System.out.println(" Enter b:");
		float b = input.nextFloat();
		System.out.println(" Enter c:");
		float c = input.nextFloat();
		double s=(a+b+c)/2;
		double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(" The area is:"+area+" SQFT");
		input.close();

	}

}
