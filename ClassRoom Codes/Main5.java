class A{
    void add(int a){
        System.out.println("Sum: "+(a+a));
    }
    void add(int a, int b){
        System.out.println("Sum: "+(a+b));
        
    }
    void add(double a, double b){
        System.out.println("Sum: "+(a+b));
    }
}
class Main5{
    public static void main(String []a){
        A obj = new A();
        obj.add(46);
        obj.add(78, 65);
        obj.add(5.3, 3.5);
        
    }
}