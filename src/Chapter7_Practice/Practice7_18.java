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
		boolean flag = false; // Ϊ�˷�ֹ���ֲ���Ҫ�ıȽ�
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = true; // ��������
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (!flag) {
				break; // �����������û�з���������˵�������Ѿ�����ֱ������ð������
			} else {
				flag = false; // ��������������˽�������flag����Ϊfalse,�����ж���һ���Ƿ�������
			}
		}
	}
}