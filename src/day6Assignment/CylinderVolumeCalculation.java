package day6Assignment;

import java.util.Scanner;

public class CylinderVolumeCalculation {

	public static void main(String[] args) {
		//Write a program that reads the radius and length of a cylinder and computes volume. 
		Scanner input = new Scanner(System.in);
		System.out.println(" Ready to Calculate Volume for cylinder:");
		System.out.println(" Enter the radius:");
		float r = input.nextFloat();
		System.out.println(" Enter the height:");
		float h = input.nextFloat();
		final double PI =Math.PI;
		double v = PI*r*r*h;
		System.out.println(" The Needed volume  is:"+v);
		input.close();
	}

}
