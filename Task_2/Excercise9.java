package Task_2;

import java.util.Scanner;

public class Excercise9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the electricity units consumed: ");
		int units = scanner.nextInt();

		scanner.close();

		double bill = 0;

		if (units <= 60) {
			bill = units * 0.30; // For first 60 units Rs. 0.30 /unit
		} else if (units <= 150) {
			bill = 60 * 0.30 + (units - 60) * 0.75; // For next 90 units Rs. 0.75 /unit
		} else if (units <= 300) {
			bill = 60 * 0.30 + 90 * 0.75 + (units - 150) * 1.10; // For next 120 units Rs. 1.10 /unit
		} else {
			bill = 60 * 0.30 + 90 * 0.75 + 120 * 1.10 + (units - 300) * 2.50; // For unit above 300 Rs. 2.50/unit
		}

		double surcharge = bill * 0.20;
		bill += surcharge;

		System.out.println("Total Electricity Bill: Rs. " + bill);
	}
}
