
class A{
    {
        System.out.println("THis ia class A");
    }
    void add(){
        System.out.println("This is method add");
        class B{
            {
                System.out.println("This is class B");
            }
        }
        B obj1 = new B();
        B obj2  = new B();
    }
}
class Main7{
    public static void main(String  a[]){
        A obj = new A();
        obj.add();
    }
}
// a class without main method is called ananymous class 