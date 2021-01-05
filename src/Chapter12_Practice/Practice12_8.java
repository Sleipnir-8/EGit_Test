import java.util.Scanner;

public class Practice12_8{
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	try {
		System.out.print("Enter a hex string: ");
		HexToDecUseHexFormatException hex = 
				new HexToDecUseHexFormatException(input.next());
		System.out.println("The decimal value for hex number " + 
				hex.getHexString() + " is " + hex.hex2Dec());
	} catch (HexFormatException ex) {
		System.out.println(ex.getMessage());
	}

}