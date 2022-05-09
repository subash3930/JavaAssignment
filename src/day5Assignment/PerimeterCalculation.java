package day5Assignment;

import java.util.Scanner;

public class PerimeterCalculation {
//Write a program to find the perimeter of a circle, triangle, and rectangle.
	public static void main(String[] args) {
		// perimeter of circle
		final double VALUE_PI = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println(" Time to calculate Perimeter of circle:");
		System.out.println(" Enter the circle Radius:");
		double r = input.nextDouble();
		double peri = 2 * VALUE_PI * r;
		System.out.println("perimeteer of circle is :" + peri);

		// Perimeter of rectangle
		System.out.println(" Time to calculate perimeter of Rectangle:");
		System.out.println(" Enter the Length:");
		double l = input.nextDouble();
		System.out.println(" Enter the Width:");
		double b = input.nextDouble();
		double peri1 = 2 * (l + b);
		System.out.println("perimeter of rectangle is :" + peri1);

		// perimeter of Triangle
		System.out.println(" Time to calculate perimeter of Triangle:");
		System.out.println(" Enter the side1:");
		double side1 = input.nextDouble();
		System.out.println(" Enter the side2:");
		double side2 = input.nextDouble();
		System.out.println(" Enter the side3:");
		double side3 = input.nextDouble();
		double peri2 = side1 + side2 + side3;
		System.out.println("perimeter of triangle is :" + peri2);
		input.close();
		// how to clean console?
	}

}
