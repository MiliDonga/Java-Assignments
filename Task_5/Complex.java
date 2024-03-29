package Task_5;

import java.util.Scanner;

public class Complex {
	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex add(Complex other) {
		return new Complex(this.real + other.real, this.imaginary + other.imaginary);
	}

	public Complex subtract(Complex other) {
		return new Complex(this.real - other.real, this.imaginary - other.imaginary);
	}

	public Complex multiply(Complex other) {
		double resultReal = this.real * other.real - this.imaginary * other.imaginary;
		double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;
		return new Complex(resultReal, resultImaginary);
	}

	@Override
	public String toString() {
		return real + " + " + imaginary + "i";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the real part of the first complex number:");
		double real1 = scanner.nextDouble();
		System.out.println("Enter the imaginary part of the first complex number:");
		double imaginary1 = scanner.nextDouble();

		Complex complex1 = new Complex(real1, imaginary1);

		System.out.println("Enter the real part of the second complex number:");
		double real2 = scanner.nextDouble();
		System.out.println("Enter the imaginary part of the second complex number:");
		double imaginary2 = scanner.nextDouble();

		Complex complex2 = new Complex(real2, imaginary2);

		System.out.println("Sum: " + complex1.add(complex2));
		System.out.println("Difference: " + complex1.subtract(complex2));
		System.out.println("Product: " + complex1.multiply(complex2));

		// Close the scanner
		scanner.close();
	}
}
