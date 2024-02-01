package Task_6;

public class Excercise9 {
	public static void generateCombinations(String str) {
		generateCombinationString(str, "");
	}

	private static void generateCombinationString(String remaining, String currentCombination) {
		if (remaining.length() == 0) {
			System.out.println(currentCombination);
		} else {
			generateCombinationString(remaining.substring(1), currentCombination + remaining.charAt(0));

			generateCombinationString(remaining.substring(1), currentCombination);
		}
	}

	public static void main(String[] args) {
		String inputString = "ABC";

		System.out.println("Combinations of '" + inputString + "':");
		generateCombinations(inputString);
	}
}
