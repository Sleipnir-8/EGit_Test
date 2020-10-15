import java.util.Scanner;

	public class Task4 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Please Enter Three Sides: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			
			if(a+b<=c || b+c<=a || a+c<=b) {
				 System.out.println("Illegal input!");
			}
				 else
					 System.out.println(a+b+c);
	        }
}
	