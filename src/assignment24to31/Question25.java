package assignment24to31;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to enter the number of students and
		 * each student’s name and score. Finally display the student with the highest
		 * score.
		 */
		int i;
		String sname;
		double score;
		double hscore = 0;
		String hsname = "";
		String decision = "";

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number of student");
			int snumber = input.nextInt();
			if (snumber == 0) {
				System.out.println("There is no student right?");
			} else {
				for (i = 1; i <= snumber; i++) {
					System.out.println("Enter the " + i + " name of student");
					sname = input.next();
					System.out.println("Enter the " + i + " score of student");
					score = input.nextDouble();
					if (score >= hscore) {
						hscore = score;
						hsname = sname;
					}

				}
				System.out.println(hsname + " has the highest score of " + hscore);
				System.out.println("Would you like to continue? Press Y||N");
				decision = input.next();
	
			}
		} while (decision.equalsIgnoreCase("Y"));

   //  input.close();

	}
	
}
