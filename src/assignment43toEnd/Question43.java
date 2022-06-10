package assignment43toEnd;

import java.util.Scanner;

public class Question43 {
//	//Write a program to trap the exception 
//	//handling to trap the divided by zero and out of 
//	index value in array.
	public static int divide(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1:");
		int a = input.nextInt();
		System.out.println("Enter number2:");
		int b = input.nextInt();

		try {
			System.out.println("Div is: " + divide(a, b));
		} catch (ArithmeticException div0) {
			System.out.println("Div by 0 is not allowed");
		}finally {
			input.close();
		}
		int[]arr= new int[]{4,5,6};
		try {
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]);	
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("out of limit");
		}
		
	}

	

}
