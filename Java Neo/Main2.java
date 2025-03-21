interface Interface {
    default void show() {
        System.out.println("Default Show Method");
    }
    
    static void display() {
        System.out.println("Static Display Method");
    }
}

public class Main2 implements Interface {
    public static void main(String[] args) {
        Main2 obj = new Main2();
        obj.show();
        Interface.display();
    }
}