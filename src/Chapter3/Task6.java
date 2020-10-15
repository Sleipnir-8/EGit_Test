import java.util.Scanner;

	public class Task6 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Please Enter a point with two coordinates: ");
			double x = input.nextDouble();
			double y = input.nextDouble();
			
			double h=100;
			
			if(x*x+y*y>100)
				System.out.println("Point is not in the Curcle");
			else 
				System.out.println("Point is in the Curcle");
		}
}
	