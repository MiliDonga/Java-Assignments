package Task_4;

public class Excercise7 {
    public static void main(String[] args) {
        int[] inputArray = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11, 11};
        
        System.out.print("Input Array: ");
        printArray(inputArray);
        
        int[] resultArray = removeDuplicatesAndAddZeros(inputArray);
        
        System.out.print("Output Array: ");
        printArray(resultArray);
    }

    private static int[] removeDuplicatesAndAddZeros(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                result[j++] = nums[i];
            } else {
                nums[i] = 0;
            }
        }

        result[j++] = nums[n - 1];

        for (; j < n; j++) {
            result[j] = 0;
        }

        return result;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
