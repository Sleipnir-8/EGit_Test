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

			// 顶点数小于3返回0
			if (pointNum < 3) {
				return 0;
			}
			// 将各点x，y坐标存入
			for (int i = 0; i < pointNum; i++) {
				point.x[i] = Input.nextDouble();
				point.y[i] = Input.nextDouble();
			}
			// 计算面积
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