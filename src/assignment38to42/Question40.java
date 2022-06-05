package assignment38to42;

import java.util.Scanner;
//Write a program to reverse the string.
public class Question40 {

	public void reverse() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=input.nextLine();
		char[]s2=s1.toCharArray();
		int len=s2.length;
		System.out.println("The reverse is");
		for(int i=len-1; i>=0;i--) {
			System.out.print(s2[i]);
		}
		
	}

	public static void main(String[] args) {
		
		Question40 ob=new Question40();
		ob.reverse();

	}

}
