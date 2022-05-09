package day10Assignment;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		//Write a program that receives an ASCII code (between 0 – 128) and 
		//display its character [example: 97 (input) ->a(output)].
		Scanner input =new Scanner(System.in);
	       System.out.println("Enter the number between 0-128: ");
	       int n =input.nextInt();
	       char num = (char)n;
	     
	    	   System.out.println("The Corresponding ASCII value is: "+num);
	  
	       input.close();
	}

}
