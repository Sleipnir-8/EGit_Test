import java.util.Scanner;

class LinearEquation {
	private static double a;
	private static double b;
	private static double c;
	private static double d;
	private static double e;
	private static double f;

	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public static boolean isSolvable() {
		if (a * d - b * c != 0) {
			return true;
		} else
			return false;
	}

	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}
		
public class Practice9_B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Plese enter a,b,c,d,e,f: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		double e = scan.nextDouble();
		double f = scan.nextDouble();

		LinearEquation Input = new LinearEquation(a, b, c, d, e, f);
		if (Input.isSolvable()) {
			System.out.println(Input.getX() + " " + Input.getY());
		} else
			System.out.println("The equation has no solution!");
	}
}