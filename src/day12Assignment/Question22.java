package day12Assignment;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Write a program to print the table of given numbers.
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Number for table");
		int n = input.nextInt();
		System.out.println("The table for "+n+" is below");
		for(int i=1;i<=10;i++) {
			
			System.out.println(" "+n+"*"+i+" = "+(i*n));
			
		}
		System.out.println("Exit");
		input.close();// for closing input
	}

}
