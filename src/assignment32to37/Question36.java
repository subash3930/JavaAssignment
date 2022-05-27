package assignment32to37;

import java.util.Scanner;

public class Question36 {
	// Write a function to find duplicate elements in an array.
	public void duplielementArray() {
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
		for (int l = 0; l < length; l++) {
			for (int k = l+1; k < length; k++) {
				if (arr[l] == arr[k] && l!= k) {
					System.out.println("The duplicate element:  ");
					System.out.println(arr[l]);
				}
			}

		}
		System.out.println();

	}

	public static void main(String[] args) {
		Question36 ob = new Question36();
		ob.duplielementArray();

	}

}
