import java.util.Scanner;

public class Practice12_7{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Binary number: ");
		String s = input.next();
		try {
			Integer.parseInt(s, 2);
		} catch (NumberFormatException e) {
			
			System.out.println("Wrong! not binary number.");
			System.exit(1);
		}
		System.out.println("Decimal number: " + bin2Dec(s));
	}

	public static int bin2Dec(String binaryString) {
		return Integer.parseInt(binaryString, 2);
	}
}