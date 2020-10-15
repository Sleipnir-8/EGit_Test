import java.util.Scanner;
import java.util.Random;
	public class Task3 {
		public static void main(String[] args) {
			Random r = new Random();
			//生成随机数
			int rand = r.nextInt(899)+100;
			//转换位目标字符串
			String target = Integer.toString(rand);
			 
			Scanner input = new Scanner(System.in);
			System.out.print("Please Enter Your Number: ");
	        String Serial = input.nextLine();
	        
	        //显示生成数
	        System.out.print("Rand = "+target+"\n");
	        
	        int count =0;
	        for(int i=0;i<3;i++) {
	        	for(int j=0;j<3;j++)
	        	if(Serial.charAt(i) == target.charAt(j)) 
	        		count++;
	        }
	        
	        if(Serial.equals(target)) {
			System.out.print("You won the first prize, $10000!");
	        }
	        else if(count == 3){
	        	System.out.print("You won the second prize, $3000!");
	        }
	        else if(count >= 1) {
	        	System.out.print("You won the third prize, $1000!");
	        }
		}
}