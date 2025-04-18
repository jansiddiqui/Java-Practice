class A<T extends Number,S extends Number>{
    void add(T a, S b){
        if(a instanceof Integer && b instanceof Double){
            System.out.println(a.intValue() + b.doubleValue());
        } else if(a instanceof Double && b instanceof Integer){
            System.out.println(a.doubleValue() + b.intValue());
        } else if(a instanceof Integer && b instanceof Integer){
            System.out.println(a.intValue() + b.intValue());
        } else if(a instanceof Double && b instanceof Double){
            System.out.println(a.doubleValue() + b.doubleValue());
        }
    }
}
public class GenAdd{
    static <T> void add(T a, T b){
        System.out.println("First value "+ a + " and second value " + b); 
    }
    public static void main(String[] args){
        A<Integer, Double> obj = new A<>();
        obj.add(10, 20.5);
        A<Double, Double> obj1 = new A<>();
        obj1.add(10.5, 20.5);
        A<Integer, Integer> obj2 = new A<>();
        obj2.add(10, 20);
        A<Double, Integer> obj3 = new A<>();
        obj3.add(80.5, 30);
        add(100, 200);
        add(100.5, 200.5);
        add("Hello", "World");
    }
}