package Task_4;

import java.util.HashMap;
import java.util.Map;

public class Excercise6 {
	public static void main(String[] args) {
		int[] sampleArray = { 1, 2, 3, 4, 5 };
		int targetValue = 6;

		findTwoSumPairs(sampleArray, targetValue);
	}

	private static void findTwoSumPairs(int[] nums, int target) {
		Map<Integer, Integer> complementMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (complementMap.containsKey(complement)) {
				System.out.println("Pair found: [" + complementMap.get(complement) + ", " + i + "]");
			}

			complementMap.put(nums[i], i);
		}
	}
}
