import java.util.ArrayList;

public class genAL {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Create an ArrayList of type Integer
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(1);
        list.add(2.5);
        list.add('A');
        list.add(true);
        int s = list.size();
        System.out.println("Size of the list: " + s);
        System.out.println(list.contains("Hwllo"));
        System.out.println(list.hashCode());
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(2.5));
        System.out.println(list.lastIndexOf(2.5));
        list.add(2, 3.5);
        System.out.println("String List: " + stringList);
        System.out.println("Integer List: " + intList);
        System.out.println("Mixed List: " + list);
    }
}