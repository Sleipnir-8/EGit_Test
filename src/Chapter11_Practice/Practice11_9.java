import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Practice11_9 {

	public static void main(String[] args) {
		System.out.print("Please enter the array size N: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] elem = new int[n][n];

		int maxrow = 0;
		int maxcolum = 0;
		int sum = 0;
		int sum1 = 0;
		int rm = 0; // 最大行下标
		int cm = 0; // 最大列下标
		// 随机赋值
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Random r = new Random();
				int e = r.nextInt(2);
				elem[i][j] = e;
			}
		}
		// 生成数组
		System.out.println("The random array is: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(elem[i][j]);
				if ((j + 1) % n == 0) {
					System.out.print("\n");
				}
			}
		}
		// 记录最大行下标
		for (int i = 0; i < n; i++) {
			sum = 0;
			sum1=0;
			for (int j = 0; j < n; j++) {
				sum += elem[i][j];
				sum1+=elem[j][i];
				if (sum >= maxrow) {
					maxrow = sum;
					rm = i;
				}
				if (sum1 >= maxcolum) {
					maxcolum = sum1;
					cm = i;
				}
			}
		}
		System.out.println("The largest row index: " + rm);
		System.out.print("The largest colum index: " + cm);
	}
}
