class A{
    void add(int a){
        System.out.println("Sum by Class A: "+(a+a));
    }
    // void sub(int a){
    //     System.out.println("Sum by Class C: "+(a-a));
    // }
}
class B extends A{
    void add(int a){
        System.out.println("Sum by Class B: "+(a+a));
    }
}

class C extends B{
    void add(int a){
        System.out.println("Sum by Class C: "+(a+a));
    }
    void sub(int a){
        System.out.println("Sum by Class C: "+(a-a));
    }
}

public class Main6 {
    public static void main(String[] args){
        A obj, obj1, obj2;
        obj=new  A();
        obj1=new B();
        obj2=new C();
        obj.add(5);
        // obj1.sub(5);
        obj1.add(50);
        obj2.add(500);
        
        C obj3 = new C();
        obj3.sub(500);
    }
}
