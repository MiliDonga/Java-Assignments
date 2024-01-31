package Task_4;
import java.util.Arrays;
import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();

        int[] sortedArray = new int[size];

        System.out.println("Enter the sorted elements for the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            sortedArray[i] = scanner.nextInt();
        }

        Arrays.sort(sortedArray);

        System.out.print("Enter the integer to search: ");
        int searchElement = scanner.nextInt();

        scanner.close();

        boolean found = binarySearch(sortedArray, searchElement);

        if (found) {
            System.out.println(searchElement + " is present in the sorted array.");
        } else {
            System.out.println(searchElement + " is not present in the sorted array.");
        }
    }

    private static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
