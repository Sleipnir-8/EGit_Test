import java.util.Random;

public class Practice9_4 {

	public static void main(String[] args) {
       Random seek = new Random();
       
       int[] res = new int[50]; //���ڴ�Ž��
       
       
       for(int i =0;i<50;i++) {
    	   int rand = seek.nextInt(100);
    	   res[i]=rand;
    	   System.out.println(res[i]+" ");
       }
       
	}

}
