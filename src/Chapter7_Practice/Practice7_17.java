import java.util.Scanner;

public class Practice7_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生个数：");
		int num = input.nextInt();
		float[] piace = new float[num];
		String[] name = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("请输入学生姓名：");
			name[i] = input.next();
			System.out.println("请输入他的成绩：");
			piace[i] = input.nextFloat();
		}
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (piace[i] < piace[j]) {
					float tmp = piace[i];
					piace[i] = piace[j];
					piace[j] = tmp;

					String tmp1 = name[i];
					name[i] = name[j];
					name[j] = tmp1;
				}
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.println(name[i]);
		}

	}
}