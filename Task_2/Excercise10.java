package Task_2;

import java.util.Scanner;

public class Excercise10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the basic salary: ");
		double basicSalary = scanner.nextDouble();

		scanner.close();

		double hra, da;

		if (basicSalary <= 15000) {
			hra = 0.25 * basicSalary; // HRA = 25%
			da = 0.82 * basicSalary; // DA = 82%
		} else if (basicSalary <= 20200) {
			hra = 0.27 * basicSalary; // HRA = 27%
			da = 0.90 * basicSalary; // DA = 90%
		} else {
			hra = 0.36 * basicSalary; // HRA = 36%
			da = 0.95 * basicSalary; // DA = 95%
		}

		double grossSalary = basicSalary + hra + da;

		System.out.println("Gross Salary: Rs. " + grossSalary);
	}
}
