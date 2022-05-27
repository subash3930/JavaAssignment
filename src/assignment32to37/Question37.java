package assignment32to37;

public class Question37 {
	// Write a Program to perform for the following task.
	public void addition() {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int brr[][] = { { 4, 5, 6 }, { 2, 7, 8 }, { 3, 1, 9 } };
		int crr[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				crr[i][j] = arr[i][j] + brr[i][j];
				System.out.print(crr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Question37 ob= new Question37();
		ob.addition();

	}

}
