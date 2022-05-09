package day9Assignment;

import java.util.Scanner;

public class Question11Swap1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a:");
		int a = input.nextInt();
		System.out.println(" Enter b:");
		int b = input.nextInt();
		 System.out.println("vaule of a before swapping:"+a);
		 System.out.println("vaule of b before swapping:"+b);
		 int temp=a;
		 a=b;
		 b= temp;
		 System.out.println("vaule of a after swapping:"+a);
		 System.out.println("vaule of b after swapping:"+b);
		
		input.close();

	}

}
