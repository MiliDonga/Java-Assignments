package Task_1;
import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        scanner.close();

        double area = 3.14 * radius * radius;

        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
