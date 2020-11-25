
import java.util.Scanner;
class Practice7_19{
    public static void main(String[] args){
    	
        Scanner Input=new Scanner(System.in);
        System.out.print("Enter a list:");
        int[] list=new int[Input.nextInt()];
        for(int i=0;i<list.length;i++){
            list[i]=Input.nextInt();
        }
       
        if(isSorted(list)){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }
    public static boolean isSorted(int[] list){
        for(int i=1;i<list.length;i++){
            if(list[i-1]>list[i]){
                return false;
            }
        }
        return true;
    }
}