package Task_6;

import java.util.HashMap;
import java.util.Map;

public class Excercise6 {
	public static void countCharacterOccurrences(String input) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		System.out.println("Character Occurrences of string '" + input + "' is:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " occurrences");
		}
	}

	public static void main(String[] args) {
		String inputString = "Programming";

		countCharacterOccurrences(inputString);
	}
}
