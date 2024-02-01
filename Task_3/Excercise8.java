package Task_3;

import java.util.Scanner;

public class Excercise8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		char repeat;

		do {
			System.out.print("Enter a number: ");
			number = scanner.nextInt();

			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;
			}

			System.out.print("Do you want to enter another number? (y/n): ");
			repeat = scanner.next().charAt(0);

		} while (repeat == 'y' || repeat == 'Y');

		System.out.println("Largest Number: " + max);
		System.out.println("Smallest Number: " + min);

		scanner.close();
	}
}
