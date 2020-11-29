import java.util.ArrayList;
import java.util.Scanner;

public class Practice11_13 {
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int j = 0; j < list.size(); j++) {
			for (int k = j + 1; k < list.size(); k++) {
				if (list.get(j) == list.get(k)) {
					list.remove(k);
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Please Enter 10 Integers: ");
		Scanner Input = new Scanner(System.in);
		ArrayList<Integer> elem = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			elem.add(Input.nextInt());
		}

		removeDuplicate(elem);
		
		System.out.print("The distinct integers are: ");
//		for (int p = 0; p < elem.size(); p++) {
//			System.out.print(elem.get(p)+" ");
//		}
		System.out.println(elem);
	}
}
