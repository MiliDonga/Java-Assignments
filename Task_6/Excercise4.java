package Task_6;

import java.util.Scanner;

public class Excercise4 {
	public static int countWords(String input) {
		Scanner scanner = new Scanner(input);
		int count = 0;

		while (scanner.hasNext()) {
			scanner.next();
			count++;
		}

		scanner.close();

		return count;
	}

	public static void main(String[] args) {
		String inputString = "This is a sample string with some words";

		int wordCount = countWords(inputString);

		System.out.println("Number of words in the string '" + inputString + "' is: " + wordCount);
	}
}
