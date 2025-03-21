public class OuterClass {
    public void myMethod() {
        final int num = 5;

        class LocalClass {
            void display() {
                System.out.println("Number: " + num);
            }
        }

        LocalClass obj = new LocalClass();
        obj.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.myMethod();
    }
}