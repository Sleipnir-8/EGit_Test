import java.util.Scanner;

public class Practice7_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the list:");
		int length = input.nextInt();
		int[] list = new int[length];
		for (int i = 0; i < length; i++) {
			list[i] = input.nextInt();
		}

		int zd = list[0];
		int[] list2 = new int[length];
		int count1=0;   //比支点小的点
		int count2=0;   //比支点大的点

		for (int j = 1; j < length; j++) {
			if (list[j] < zd) {
				list2[count1] = list[j];
				count1++;
			} 
			else if (list[j] > zd) {
				count2++;
				list2[length-count2] = list[j];
			}
		}
		//放入支点
        list2[count1]=zd;
        
		for (int k = 0; k < length; k++) {
			System.out.println(list2[k] + " ");
		}
	}
}
