// Hasing.java
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Hasing {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print("Enter a key: ");
            int key = sc.nextInt();
            System.out.print("Enter a value: ");
            String value = sc.next();
            hm.put(key, value);
        }
        System.out.println("Hashset: " + hm);   
        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("one"));
        System.out.println(hm.size());
        
        for(Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

