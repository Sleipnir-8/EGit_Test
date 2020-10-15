import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer : ");
        
		String Serial = input.nextLine();
		int res = 0;
		for(int i=0;i<9;i++) {
		    char sam= Serial.charAt(i);
			int number= (int)sam; 
			res+= number*(i+1);
		}
		if(res%11 != 10) {
		System.out.print("The ISBN-10 Number is "+Serial+ res%11);
	}
		else
			System.out.print("The ISBN-10 Number is "+Serial+"X");
}
}
