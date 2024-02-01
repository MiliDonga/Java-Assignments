package Task_6;

import java.util.HashSet;

public class Excercise2 {
	public static int[] findIntersection(int[] array1, int[] array2) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : array1) {
			set.add(num);
		}

		HashSet<Integer> intersectionSet = new HashSet<>();
		for (int num : array2) {
			if (set.contains(num)) {
				intersectionSet.add(num);
			}
		}

		int[] result = new int[intersectionSet.size()];
		int index = 0;
		for (int num : intersectionSet) {
			result[index++] = num;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 4, 5, 6 };
		int[] array2 = { 2, 3, 5, 7 };

		int[] intersection = findIntersection(array1, array2);

		System.out.print("Intersection of given arrays: ");
		for (int num : intersection) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
