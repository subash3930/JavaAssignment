package day10Assignment;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		//Write a program to print the number entered by the user 
		//only if the number entered is negative.
       Scanner input =new Scanner(System.in);
       System.out.println("Enter the number to check");
       int num =input.nextInt();
       if (num<0) {
    	   System.out.println("The number is negative"+num);
       }
       input.close();
       
	}

}
