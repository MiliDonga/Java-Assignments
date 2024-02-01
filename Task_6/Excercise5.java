package Task_6;

import java.util.Scanner;

public class Excercise5 {
	public static boolean isArmstrongNumber(int number) {
		int originalNumber = number;
		int numberOfDigits = String.valueOf(number).length();
		int sum = 0;

		while (number > 0) {
			int digit = number % 10;
			sum += Math.pow(digit, numberOfDigits);
			number /= 10;
		}

		return sum == originalNumber;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number to check if it's an Armstrong number:");
		int inputNumber = scanner.nextInt();

		if (isArmstrongNumber(inputNumber)) {
			System.out.println(inputNumber + " is an Armstrong number.");
		} else {
			System.out.println(inputNumber + " is not an Armstrong number.");
		}

		scanner.close();
	}
}
