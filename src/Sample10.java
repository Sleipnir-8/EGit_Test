import java.util.Scanner;

public class Sample10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in dounble,for example 9.19: ");
		double amount = input.nextDouble();
		int remainingAmount =(int)(amount* 100);
		
		int numberOFOneDollars= remainingAmount/100;
		remainingAmount= remainingAmount %100;
		
		int numberOFQuarters = remainingAmount/25;
		remainingAmount= remainingAmount %25;
		
		int numberOFDimes= remainingAmount/10;
	}

}