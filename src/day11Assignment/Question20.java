package day11Assignment;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		/*Write a program to create the equivalent of a
		 *  four-function calculator. The program to enter 
		 *  two integer’s numbers and an operator. It then carries 
		 *  out the specified arithmetic operator operation: addition, 
		 *  subtraction, multiplication or division 
		 * of the two numbers. Finally, it displays the result.
		 */
		int a=0,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the operator choice");
		char operator = input.next().charAt(0);
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			System.out.println("Enter a");
			a = input.nextInt();
			System.out.println("Enter b");
			b = input.nextInt();
		}

		switch (operator) {
		case '+':
			System.out.println("This is Addition");
			int sum = a + b;
			System.out.println("addition " + sum);
			break;

		case '-':
			System.out.println("This is substraction");
			int sub = a - b;
			System.out.println("Substraction " + sub);
			break;

		case '*':
			System.out.println("This is Multipication");
			int mul = a * b;
			System.out.println("Multipication " + mul);
			break;

		case '/':
			System.out.println("This is Division");
			int div = a / b;
			System.out.println("division " + div);
			break;

		default:
			System.out.println(" wrong Operator");

		}

		System.out.println("exit");
		input.close();
	}

}
