package assignment38to42;

import java.util.Scanner;

public class Question39 {
	// Write a Program to display names in short form.
	// E.g. Ram Kishore Singh -> R. k. Singh
	public void shortname() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name");
		String fname = input.nextLine();
		System.out.println("Enter the Second name");
		String mname = input.nextLine();
		System.out.println("Enter the last name");
		String lname = input.nextLine();
		System.out.println("The formated text is:");
		System.out.println(fname.substring(0, 1) + "." + (mname.substring(0, 1)).toLowerCase() + ". " + lname);
		input.close();
	}

	public static void main(String[] args) {
		Question39 ob = new Question39();
		ob.shortname();
	
	}

}
