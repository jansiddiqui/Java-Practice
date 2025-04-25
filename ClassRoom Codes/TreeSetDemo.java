import java.util.TreeSet;;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(40);
        ts.add(30);
        System.out.println(ts);
        System.out.println(ts.descendingSet());
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.higher(20));
        System.out.println(ts.lower(20));
    }
    
}
