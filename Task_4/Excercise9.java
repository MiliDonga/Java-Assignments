package Task_4;

import java.util.HashMap;
import java.util.Map;

public class Excercise9 {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 10, -3 };
		int target = 14;

		int[] result = twoSum(nums, target);

		if (result != null) {
			System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
		} else {
			System.out.println("No such indices found.");
		}
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numIndexMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (numIndexMap.containsKey(complement)) {
				return new int[] { numIndexMap.get(complement), i };
			}

			numIndexMap.put(nums[i], i);
		}

		return null;
	}
}
