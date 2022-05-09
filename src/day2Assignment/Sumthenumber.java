package day2Assignment;

import java.util.Scanner;

public class Sumthenumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" Enter the num1:");
		float num1= input.nextFloat();
		System.out.println(" Enter the num2:");
		float num2= input.nextFloat();
		float sum = num1+num2;
		System.out.println("The sum of "+num1+" and "+num2+" is: "+sum);
		input.close();

	}

}
