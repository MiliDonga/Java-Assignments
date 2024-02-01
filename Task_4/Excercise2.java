package Task_4;

import java.util.Scanner;

public class Excercise2 {
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

		double sum = 0;

		for (int i = 0; i < size; i++) {
			sum += userArray[i];
		}

		double average = sum / size;

		System.out.println("Average of the elements in the array: " + average);
	}
}
