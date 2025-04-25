import java.util.HashMap;
import java.util.Map;
public class HasingDuplicate {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(150, "ABC");
        hm.put(170, "CDE");
        hm.put(180, "ABC");
        hm.put(200, "EFG");
        hm.put(300, "XYZ");

        for(Map.Entry<Integer, String> entry : hm.entrySet()) {
            String value = entry.getValue();
            for (Map.Entry<Integer, String> innerEntry : hm.entrySet()) {
                if (entry.getKey() != innerEntry.getKey() && value.equals(innerEntry.getValue())) {
                    System.out.println("Duplicate found: " + entry.getKey() + " and " + innerEntry.getKey() + ", Value: " + value);
                }
            }
        }
    }
}
