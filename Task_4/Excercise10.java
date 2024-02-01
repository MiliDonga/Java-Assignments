package Task_4;

public class Excercise10 {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 6, 5 };

		boolean isEqual = areArraysEqual(array1, array2);

		if (isEqual) {
			System.out.println("The arrays are equal.");
		} else {
			System.out.println("The arrays are not equal.");
		}
	}

	private static boolean areArraysEqual(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		return true;
	}
}
