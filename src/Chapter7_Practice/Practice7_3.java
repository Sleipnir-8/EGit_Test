import java.util.*;

public class Practice7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        HashMap<Integer, Integer> 
        hashMap = new HashMap<>();
        int number = input.nextInt();
        while (number != 0) {
            if (number <= 100 && number >= 0) {
                if (hashMap.containsKey(number)) {
                    hashMap.put(number, hashMap.get(number) + 1);
                } else {
                    hashMap.put(number, 1);
                }
            }
            number = input.nextInt();
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + ((entry.getValue() == 1) ? " time " : " times "));
        }
    }
}