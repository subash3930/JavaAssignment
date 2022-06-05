package assignment38to42;

import java.util.Scanner;

public class Question42 {
	public void duplicateword() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=input.nextLine();
		String[]s2=s1.split(" ");
		int len=s2.length;
		System.out.println("Duplicate word is/are");
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if (s2[i].equals(s2[j])) {
					System.out.print(s2[j]+" ");
				}
			}
		
		}
		input.close();
		
	}

	public static void main(String[] args) {
		
		Question42 ob=new Question42();
		ob.duplicateword();

	}
	
}
