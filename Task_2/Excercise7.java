package Task_2;
import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (positive to continue, negative to exit): ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("It's Over");
                break;
            } else {
                System.out.println("Good Going");
            }
        }

        scanner.close();
    }
}
