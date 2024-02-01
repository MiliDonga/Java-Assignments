package Task_4;

import java.util.Scanner;

public class Excercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] userArray = new int[size];

		System.out.println("Enter the elements for the array:");

		for (int i = 0; i < size; i++) {
			System.out.print("Enter element at index " + i + ": ");
			userArray[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.print("Array populated by the user: ");
		for (int i = 0; i < size; i++) {
			System.out.print(userArray[i] + " ");
		}
		System.out.println();
	}
}
