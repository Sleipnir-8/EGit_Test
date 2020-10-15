public class SampleD {
	public static void main(String[] args) {
		long totalMIlliseconds =System.currentTimeMillis();
		long totalSeconds = totalMIlliseconds /1000;
		long currentSecond =totalSeconds%60;
		long totalMinutes =totalSeconds /60;
		long currentMinute =totalMinutes %60;
		long totalHours= totalMinutes /60;
		long currentHour= totalHours %24;
		System.out.println("Current Time is "+ currentHour+":"+currentMinute+
				":"+ currentSecond+" GMT");
   }
}