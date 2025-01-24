public class A {
    static{
        System.out.println("Static blocks");
    }
    {
        System.out.println("Instance Block");
    }
    int a,b,c;
    public static void main(String[] args){
        int e=5,f=8,g=9;
        A obj = new A();
        A obj1 = new A();
        System.out.println(obj.a + obj.b + obj.c);
        System.out.println(e + " " + f + " " + g);
    }
}
