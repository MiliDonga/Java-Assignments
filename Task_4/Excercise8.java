package Task_4;

public class Excercise8 {
	public static void main(String[] args) {
		int[] arr = { 1, 16, 2, 19, 10, 20 };

		System.out.print("Input Array: ");
		printArray(arr);

		int thirdLargest = findThirdLargest(arr);

		System.out.println("The third largest element is: " + thirdLargest);
	}

	private static int findThirdLargest(int[] nums) {
		int n = nums.length;

		if (n < 3) {
			System.out.println("Array doesn't have a third-largest element.");
			return Integer.MIN_VALUE;
		}

		int first = nums[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int i = 1; i < n; i++) {
			int current = nums[i];

			if (current > first) {
				third = second;
				second = first;
				first = current;
			} else if (current > second) {
				third = second;
				second = current;
			} else if (current > third) {
				third = current;
			}
		}

		return third;
	}

	private static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
