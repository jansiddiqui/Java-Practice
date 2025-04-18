import java.util.ArrayList;

class A<T, U, Z> {
    T a;
    T b;
    T c;
    void sum(T num1, U num2, Z num3) {
        System.out.println("Values are A: "+num1+" B: "+num2+" C: "+num3);
    }
}
public class gennn {

    public static void main(String[] args) {
        A<Integer, String, Float> obj = new A<>();
        A<Float, Double, String> obj1 = new A<>();
        obj.sum(10, "Hello", 20.5f);
        obj1.sum(10.5f, 20.5, "World");
    }
}