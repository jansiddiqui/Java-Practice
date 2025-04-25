import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class HashingUpper {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        for(Map.Entry<Integer, String> entry : hm.entrySet()) {
            String value = entry.getValue();
            value = value.toUpperCase();
            hm.put(entry.getKey(), value);
        }
        System.out.println(hm);
    }
}
