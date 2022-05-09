package day5Assignment;

import java.util.Scanner;

public class AreaCalculation {

	public static void main(String[] args) {
		// Write a program to find the area of a circle, rectangle, and triangle.
		// Area of circle
		final double VALUE_PI = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println(" Time to calculate area of circle:");
		System.out.println(" Enter the circle Radius:");
		double r = input.nextDouble();
		double area = VALUE_PI * r * r;
		System.out.println("Area of circle is :" + area);

		// Area of rectangle
		System.out.println(" Time to calculate area of Rectangle:");
		System.out.println(" Enter the Length:");
		double l = input.nextDouble();
		System.out.println(" Enter the Width:");
		double b = input.nextDouble();
		double area1 = l * b;
		System.out.println("Area of rectangle is :" + area1);

		// Area of Triangle
		System.out.println(" Time to calculate area of Triangle:");
		System.out.println(" Enter the base:");
		double base = input.nextDouble();
		System.out.println(" Enter the height:");
		double height = input.nextDouble();
		double area2 = 0.5 * base * height;
		System.out.println("Area of triangle is :" + area2);
		input.close();
		// This is to clear yellow warning.

	}

}
