package Task_2;

import java.util.Scanner;

public class Excercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(0);

		scanner.close();

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " is an alphabet.");
		} else {
			System.out.println(ch + " is not an alphabet.");
		}
	}
}
