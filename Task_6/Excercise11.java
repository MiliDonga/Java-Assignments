package Task_6;

import java.util.ArrayList;
import java.util.List;

public class Excercise11 {
	public static List<List<Integer>> findSubarraysWithSum(int[] array, int targetSum) {
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			int currentSum = 0;
			for (int j = i; j < array.length; j++) {
				currentSum += array[j];
				if (currentSum == targetSum) {
					List<Integer> subarray = new ArrayList<>();
					for (int k = i; k <= j; k++) {
						subarray.add(array[k]);
					}
					result.add(subarray);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int targetSum = 15;

		List<List<Integer>> subarrays = findSubarraysWithSum(array, targetSum);
		System.out.println("Subarrays with sum " + targetSum + ":");
		for (List<Integer> subarray : subarrays) {
			System.out.println(subarray);
		}
	}
}
