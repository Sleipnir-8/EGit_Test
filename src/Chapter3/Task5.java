import java.util.Scanner;

	public class Task5 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter year: ");
			int year = input.nextInt();
			System.out.print("Enter month: ");
			int month = input.nextInt();
			System.out.print("Enter the day of month: ");
			int day= input.nextInt();
			int h;
			
			if(month ==1||month==2) {
				month +=12;
				year-=1;
			}
			
			h= (day+26*(month+1)/10+year%100+year%100/4+year/100/4+5*year/100)%7;
			switch(h) {
			case 0: 
				System.out.println("Day of the week is Saturday");
				break;
			case 1: 
				System.out.println("Day of the week is Sunday");
				break;
			case 2: 
				System.out.println("Day of the week is Monday");
				break;
			case 3: 
				System.out.println("Day of the week is Tuesday");
				break;
			case 4: 
				System.out.println("Day of the week is Wednesday");
				break;
			case 5: 
				System.out.println("Day of the week is Thursday");
				break;
			case 6: 
				System.out.println("Day of the week is Friday");
				break;
			}
		}
}