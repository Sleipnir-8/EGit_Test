import java.util.ArrayList;
import java.util.Scanner;

public class Practice11_15 {
	static public class polygon {
		static Scanner Input = new Scanner(System.in);
		static int pointNum;

		static class point {
			static double[] x = new double[pointNum];
			static double[] y = new double[pointNum];
		}

		static double polygonArea(int pointNum) {

			// ������С��3����0
			if (pointNum < 3) {
				return 0;
			}
			// ������x��y�������
			for (int i = 0; i < pointNum; i++) {
				point.x[i] = Input.nextDouble();
				point.y[i] = Input.nextDouble();
			}
			// �������
			double polygonArea = point.x[pointNum - 1] * point.y[0] - point.x[0] * point.y[pointNum - 1];
			for (int j = 0; j < pointNum - 1; j++) {
				polygonArea += Math.abs(point.x[j] * point.y[j + 1] - point.x[j + 1] * point.y[j]);
			}
			return polygonArea / 2;
		}
	}

	public static void main(String[] args) {
		System.out.print("Please enter the number of the points: ");
		Scanner input = new Scanner(System.in);
		polygon.pointNum = input.nextInt();
		System.out.println("Please enter the coordinates of the points: ");
		System.out.println("The total area is: " + polygon.polygonArea(polygon.pointNum));
	}
}