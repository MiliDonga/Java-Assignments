package Task_4;

import java.util.Scanner;

public class Excercise5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		System.out.print("Enter the number of columns: ");
		int columns = scanner.nextInt();

		int[][] matrix1 = new int[rows][columns];
		int[][] matrix2 = new int[rows][columns];

		System.out.println("Enter elements for the first matrix:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("Enter element at position (" + i + ", " + j + "): ");
				matrix1[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter elements for the second matrix:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("Enter element at position (" + i + ", " + j + "): ");
				matrix2[i][j] = scanner.nextInt();
			}
		}

		scanner.close();

		int[][] sumMatrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		System.out.println("Matrix Addition Result:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(sumMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
