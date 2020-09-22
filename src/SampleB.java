import java.util.Scanner;

public class SampleB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		System.out.print("Enter an interger for seconds: ");
		
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds+ " seconds is/are "+ minutes+ " minutes and "+ remainingSeconds+ " seconds");
	}

}
