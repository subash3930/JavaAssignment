package assignment32to37;

import java.util.Scanner;

public class Question33 {
	//Write a Program to display numbers in ascending order in array
	public void asendingArray() {
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
		for (int l = 0; l < length; l++) {
			for (int k = 0; k < length; k++) {
				if (arr[l] < arr[k]) {
					temp = arr[l];
					arr[l] = arr[k];
					arr[k] = temp;

				}
			}

		}
		System.out.println();
		System.out.println("The array in asending order:  ");
		for (int m = 0; m < length; m++) {
			System.out.print(arr[m] + " ");
		}
	}

	public static void main(String[] args) {
		Question33 ob = new Question33();
		ob.asendingArray();

	}

}
