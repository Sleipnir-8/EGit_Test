import java.util.*;

class Practice7_31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("The number of nums in List1: ");
		int len1 = scanner.nextInt();
		int[] list1 = new int[len1];
		System.out.print("Please Enter List1:");
		for (int i = 0; i < len1; i++) {
			list1[i] = scanner.nextInt();
		}
		System.out.print("The number of nums in List2:");
		int len2 = scanner.nextInt();
		int[] list2 = new int[len2];
		System.out.print("Please Enter List2: ");
		for (int j = 0; j < len2; j++) {
			list2[j] = scanner.nextInt();
		}
		System.out.print("The Merged List:" + Arrays.toString(merge(list1, list2)));
	}

	public static int[] merge(int[] list1, int[] list2) {
		// ���ж����������Ƿ�Ϊ��
		if (list1 == null && list2 == null) {
			return null;
		}
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		// ���鲻Ϊ�� �ǾͱȽ���������ĳ���
		int[] list3 = new int[list1.length + list2.length];
		int p1 = 0;// ����list1��ָ��
		int p2 = 0;// ����list2��ָ��
		int p3 = 0;// ����list3��ָ��
		while (true) {
			if (p1 == list1.length && p2 == list2.length) {
				break;
			}
			if (p1 < list1.length && p2 == list2.length) {
				list3[p3++] = list1[p1++];
			} else if (p2 < list2.length && p1 == list1.length) {
				list3[p3++] = list2[p2++];
			} else {
				if (list1[p1] >= list2[p2]) {
					list3[p3++] = list2[p2++];
				} else {
					list3[p3++] = list1[p1++];
				}
			}
		}
		return list3;
	}
}