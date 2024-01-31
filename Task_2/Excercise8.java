package Task_2;
import java.util.Scanner;

public class Excercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the income amount: ");
        double income = scanner.nextDouble();

        scanner.close();

        double tax = 0;

        if (income > 1200000) {
            tax = (income - 1200000) * 0.25 + 240000;  // Above 12.0L - 25%
        } else if (income > 600000) {
            tax = (income - 600000) * 0.18 + 60000;  // 6.0L - 12.0L - 18%
        } else if (income > 250000) {
            tax = (income - 250000) * 0.10;  // 2.5L - 6.0L - 10%
        }

        System.out.println("Income Tax for the given income amount is: " + tax);
    }
}
