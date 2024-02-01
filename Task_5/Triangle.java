package Task_5;
import java.lang.Math;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("Triangle Details:");
        System.out.println("Side 1: " + triangle.side1);
        System.out.println("Side 2: " + triangle.side2);
        System.out.println("Side 3: " + triangle.side3);
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
    }
}
