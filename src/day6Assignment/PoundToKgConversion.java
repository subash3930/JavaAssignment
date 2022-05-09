package day6Assignment;

import java.util.Scanner;

public class PoundToKgConversion {

	public static void main(String[] args) {
		// Write a program that converts pounds into kg. 
		//The program prompts the user to enter a number of pounds, 
		//converts it to kg and displays the result [1 pound is 0.454 kg].
		Scanner input = new Scanner(System.in);
		System.out.println(" Ready to covert pound to kg:");
		System.out.println(" Enter the pound:");
		float p = input.nextFloat();
		double kg = p*0.454;
		System.out.println(" The kg:"+kg);
		input.close();
	}

}
