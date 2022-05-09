package day7Assignment;

import java.util.Scanner;

public class DistanceCalculation {

	public static void main(String[] args) {
		// Write a Program for the following Mathematical Function.
        // s=ut+1/2at^2

		Scanner input = new Scanner(System.in);
		System.out.println(" Ready to find distance travel:");
		System.out.println(" Enter initial velocity:");
		float u = input.nextFloat();
		System.out.println(" Enter time:");
		float t = input.nextFloat();
		System.out.println(" Enter accel:");
		float a = input.nextFloat();
		double s=u*t+0.5*a*t*t;
		System.out.println(" The distance is:"+s+"FT");
		input.close();

	}

}
