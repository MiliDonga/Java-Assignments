package Task_6;

public class Excercise8 {
	public static int findMaxValue(int[] array) {
		if (array == null || array.length == 0) {
			System.out.println("Array is empty or null.");
			return Integer.MIN_VALUE;
		}

		int maxValue = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}

		return maxValue;
	}

	public static void main(String[] args) {
		int[] array = { 12, 5, 18, 7, 3, 9 };

		int max = findMaxValue(array);
		System.out.println("Maximum value in the array: " + max);
	}
}
