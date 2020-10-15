import java.util.Random;
public class Task1 {
	public static void main(String[] args) {
		 Random r = new Random();
         int  month = r.nextInt(12);
         if (month == 1) 
        	 System.out.println("1 Juanuary");
         else if(month==2)
        	 System.out.println("2 February");
         else if(month==3)
             System.out.println("3 March");
         else if(month==4)
             System.out.println("4 April");
         else if(month==5)
             System.out.println("5 May");
         else if(month==6)
             System.out.println("6 June");
         else if(month==7)
             System.out.println("7 July");
         else if(month==8)
             System.out.println("8 Augst");
         else if(month==9)
             System.out.println("9 September");
         else if(month==10)
             System.out.println( "10 October ");
         else if(month==11)
             System.out.println("11 November");
         else if(month==12)
             System.out.println("12 December");
         }
}
