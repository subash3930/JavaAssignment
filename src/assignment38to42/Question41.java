package assignment38to42;

import java.util.Scanner;
//Write a program to find the duplicate letter in a word.
public class Question41 {
	public void duplicate() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=input.nextLine();
		char[]s2=s1.toCharArray();
		int len=s2.length;
		System.out.println("Duplicate letter/s is/are");
		for(int i=0; i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if (s2[i]==s2[j]) {
					System.out.print(s2[j]+"  ");
				}
			}
		
		}
		input.close();
	}

	public static void main(String[] args) {
		
		Question41 ob=new Question41();
		ob.duplicate();

	}
	
}
