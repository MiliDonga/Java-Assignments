package Task_1;

public class Excercise3 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping with variable: num1 = " + num1 + ", num2 = " + num2);

        num1 = 5;
        num2 = 10;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping without variable: num1 = " + num1 + ", num2 = " + num2);
    }
}
