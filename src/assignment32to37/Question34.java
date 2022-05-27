package assignment32to37;

import java.util.Scanner;

public class Question34 {
	//Write a program to reverse the element of an array.
	public void reverseArray() {
		System.out.println("length of array: ");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int arr[] = new int[length];
		int temp = 0;
		for (int i = 0; i < length; i++) {
			System.out.println("Enter the element");
			arr[i] = input.nextInt();
		}
		System.out.println("The array is:  ");
		for (int j = 0; j < length; j++) {
			System.out.print(arr[j] + " ");
		}
		
		System.out.println();
		System.out.println("The array in  reverse order:  ");
		for (int m = length-1; m >=0; m--) {
			System.out.print(arr[m] + " ");
		}
	}

	public static void main(String[] args) {
		Question34 ob = new Question34();
		ob.reverseArray();

	}


}
