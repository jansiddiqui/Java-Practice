import java.util.function.*;

// Supplier + Predicate + Function + Consumer
class A {
    public static void main(String[] args) {
        Supplier<Integer> obj = ()->1500;
        System.out.println("Supplier output: " + obj.get());

        Predicate<Integer> preObj = a-> a%2 ==0;
        System.out.println("Predicate output: " + preObj.test(1));

        Function<String, Integer> funObj = b-> b.length();
        System.out.println("Function output: " + funObj.apply("Hello"));

        Consumer<String> conObj = str -> System.out.println("Consumer output: " + str);
        conObj.accept("Hello class this is consumer");
    }
}
