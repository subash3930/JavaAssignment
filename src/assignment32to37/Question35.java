package assignment32to37;

import java.util.Scanner;

public class Question35 {
	//Write a function to find the second largest number in a given array.
	public void seclargestArray() {
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
		System.out.println("The second largest element:  ");
	    System.out.print(arr[length-2] + " ");
		
	}

	public static void main(String[] args) {
		Question35 ob = new Question35();
		ob.seclargestArray();

	}

}
