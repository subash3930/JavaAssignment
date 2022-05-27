package assignment32to37;

import java.util.Scanner;

public class Question32 {
	//Write a Program to accept 5 values in an array and 
	//display their sum.

	public void getsumArray() {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element");
			arr[i] = input.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The array is:  ");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();	
		System.out.println("sum of array  " + sum);
	}
	public static void main(String[] args) {
		Question32 ob = new Question32();
		ob.getsumArray();

	}
}
