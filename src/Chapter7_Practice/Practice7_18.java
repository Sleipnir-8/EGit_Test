import java.util.Arrays;
import java.util.Scanner;

public class Practice7_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter 10 Numbers: ");
		double[] arr = new double[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextDouble();
		}

		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(double[] arr) {
		double temp;
		boolean flag = false; // 为了防止出现不必要的比较
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = true; // 发生交换
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (!flag) {
				break; // 如果本趟排序没有发生交换，说明数组已经有序，直接跳出冒泡排序
			} else {
				flag = false; // 如果本趟排序发生了交换，则将flag重置为false,用于判断下一趟是否发生交换
			}
		}
	}
}