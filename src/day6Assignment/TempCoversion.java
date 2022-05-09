package day6Assignment;

import java.util.Scanner;

public class TempCoversion {

	public static void main(String[] args) {
		// Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
				
				Scanner input = new Scanner(System.in);
				System.out.println(" Ready to covert fahrenheit to celsius:");
				System.out.println(" Enter the temp in fahrenheit:");
				float f = input.nextFloat();
				float c = (f-32)*5/9;
				System.out.println(" The celsius value is:"+c);
				System.out.println(" Ready to covert celsius to fahrenheit:");
				System.out.println(" Enter the temp in celsius:");
				float cl = input.nextFloat();
				float fa = cl*9/5+32;
				System.out.println(" The fahrenheit value is:"+fa);
				
				input.close();

	}

}
