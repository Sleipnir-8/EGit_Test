import java.util.Date;
import java.util.Random;

class StopWatch {

	private Date startTime;
	private Date endTime;

	public StopWatch() {
		startTime = new Date();
	}

	public void start() {
		startTime = new Date();
	}

	public void stop() {
		endTime = new Date();
	}

	public long getElapsedTime() {
		return endTime.getTime() - startTime.getTime();
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}
}

public class Practice9_6 {

	// —°‘Ò≈≈–Ú
	public static void sort(int[] a, int length) {
		int min, i, j;
		int temp = 0;
		for (i = 0; i < length - 1; i++) {
			min = i;
			for (j = i + 1; j < length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (i != min) 
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
		}
	}

	public static void main(String[] args) {

		final int length = 100000;

		int[] number = new int[length];
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			number[i] = random.nextInt(100000);
		}
		
		StopWatch stopWatch = new StopWatch();
		
		stopWatch.start();
		sort(number, length);
		stopWatch.stop();
	
		System.out.println(stopWatch.getElapsedTime() + "ms");
		
	}
}


