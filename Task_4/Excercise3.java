package Task_4;

import java.util.Scanner;

public class Excercise3 {
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

		System.out.print("Enter the integer to search: ");
		int searchElement = scanner.nextInt();

		scanner.close();

		boolean found = false;

		for (int i = 0; i < size; i++) {
			if (userArray[i] == searchElement) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(searchElement + " is present in the array.");
		} else {
			System.out.println(searchElement + " is not present in the array.");
		}
	}
}
