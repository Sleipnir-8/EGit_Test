import java.util.Scanner;
import java.util.*;

public class Practice12_A {
	public static void main(String[] args) {
		boolean Stop = true;

		do {
			try {
				System.out.print("Input an Enter a ten digit numberin of the range of (-2000000000~2000000000):");
				Scanner input = new Scanner(System.in);
				int len = input.nextInt();

				int largeArray[] = new int[len];

				Stop = false;

			} catch (OutOfMemoryError e) {
				System.out.println("OutOfMemoryError!");
			}
		} while (Stop);
	}
}
