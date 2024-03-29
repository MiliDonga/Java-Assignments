package Task_6;

public class Excercise7 {
	public static void printPermutations(String str) {
		permute(str, 0, str.length() - 1);
	}

	private static void permute(String str, int left, int right) {
		if (left == right) {
			System.out.println(str);
		} else {
			for (int i = left; i <= right; i++) {
				str = swap(str, left, i);
				permute(str, left + 1, right);
				str = swap(str, left, i);
			}
		}
	}

	private static String swap(String str, int i, int j) {
		char[] charArray = str.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return new String(charArray);
	}

	public static void main(String[] args) {
		String inputString = "ABC";

		System.out.println("Permutations of string '" + inputString + "' is:");
		printPermutations(inputString);
	}
}
