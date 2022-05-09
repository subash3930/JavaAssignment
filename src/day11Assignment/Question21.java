package day11Assignment;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// Program to input the number of (1...7) and translate to its 
		//equivalent name of the day of the week.
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the choice");
		int n = input.nextInt();
		switch (n) {
		case 1:
			System.out.println("This is Sunday");
			break;

		case 2:
			System.out.println("This is Monday");
			break;

		case 3:
			System.out.println("This is Tuesday");
			break;

		case 4:
			System.out.println("This is Wednesday");
			break;
			
		case 5:
			System.out.println("This is Thursday");
			break;
		case 6:
			System.out.println("This is Friday");
			break;
		case 7:
			System.out.println("This is Saturday");
			break;
		default:
			System.out.println(" wrong Choice");

		}

		System.out.println("exit");
		input.close();
	}

}
