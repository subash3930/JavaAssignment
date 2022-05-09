package day2Assignment;

import java.util.Scanner;

public class Dividethenumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" Enter the num1:");
		float num1= input.nextFloat();
		System.out.println(" Enter the num2:");
		float num2= input.nextFloat();
		float div = num1/num2;
		System.out.println("The division of "+num1+" and "+num2+" is: "+div);
		input.close();

	}

}
