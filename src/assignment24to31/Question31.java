package assignment24to31;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		/* Write a Program display following patterns.
		1
		12
		123
		1234
		12345*/
		System.out.println("Enter the number:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println(" ");
		}

	}

}
