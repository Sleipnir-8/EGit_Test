import java.util.Scanner;

class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return b * b - 4 * a * c ;
	}

	public double getRoot1() {
		return (-b + Math.pow(getDiscriminant(), 2)) / 2 * a;
	}

	public double getRoot2() {
		return (-b - Math.pow(getDiscriminant(), 2)) / 2 * a;
	}
}

public class Practice9_A {

	public static void main(String[] args) {
		System.out.println("Plese enter a,b,c: ");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		QuadraticEquation Input = new QuadraticEquation(a,b,c);

		if (Input.getDiscriminant() < 0) {
			System.out.println("The equation has no roots.");
		} else if (Input.getDiscriminant() == 0) {
			System.out.println(Input.getRoot1());
		} else {
			System.out.println(Input.getRoot1() + " " + Input.getRoot2());
		}
	}

}