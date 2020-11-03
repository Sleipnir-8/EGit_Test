import java.util.GregorianCalendar;
import java.util.Scanner;

public class Practice9_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GregorianCalendar Time= new GregorianCalendar();
		 
		System.out.println(Time.get(GregorianCalendar.YEAR)+
				"-"+Time.get(GregorianCalendar.MONTH)+
				"-"+Time.get(GregorianCalendar.DAY_OF_MONTH));
		
		Time.setTimeInMillis (1234567898765L);
		System.out.println("After Set: "+
		            Time.get(GregorianCalendar.YEAR)+
				"-"+Time.get(GregorianCalendar.MONTH)+
				"-"+Time.get(GregorianCalendar.DAY_OF_MONTH));
	}

	
}
