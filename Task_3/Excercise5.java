package Task_3;

import java.util.Scanner;

public class Excercise5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();

		scanner.close();

		int sum = 0;
		int count = 1;
		int number = 2;

		while (count <= n) {
			sum += number;
			number += 2;
			count++;
		}

		System.out.println("Sum of the first " + n + " even numbers is: " + sum);
	}
}
