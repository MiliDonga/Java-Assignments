package Task_3;

import java.util.Scanner;

public class Excercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string or number to check for palindrome: ");
		String input = scanner.nextLine();

		scanner.close();

		if (isPalindrome(input)) {
			System.out.println("'" + input + "' is a palindrome.");
		} else {
			System.out.println("'" + input + "' is not a palindrome.");
		}
	}

	private static boolean isPalindrome(String str) {
		str = str.replaceAll("\\s", "").toLowerCase();

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}
}
