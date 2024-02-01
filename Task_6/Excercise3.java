package Task_6;

import java.util.HashSet;
import java.util.Set;

public class Excercise3 {
	public static boolean hasUniqueCharacters(String str) {
		Set<Character> charSet = new HashSet<>();

		for (char c : str.toCharArray()) {
			if (!charSet.add(c)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String str1 = "ABCDE";
		String str2 = "Hello";

		System.out.println("String '" + str1 + "' has all unique characters: " + hasUniqueCharacters(str1));
		System.out.println("String '" + str2 + "' has all unique characters: " + hasUniqueCharacters(str2));
	}
}
