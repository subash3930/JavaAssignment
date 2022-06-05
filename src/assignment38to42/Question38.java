package assignment38to42;

import java.util.Scanner;

public class Question38 {
	//Write a program to check whether a given string is palindrome or not.
	public void palen() {
		String s2="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=input.nextLine();
		int len=s1.length();
		
		for(int i=len-1; i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("The string is palindrome");
		}else {
			System.out.println("The string is not palindrome");
		}
		input.close();
	}

	public static void main(String[] args) {
		
		Question38 ob=new Question38();
		ob.palen();

	}

}


