class A{
    A(int a, int b){
        System.out.println(a+b);
    }
    A(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
// constructor dont have data type
class cons{
    public static void main(String[] args) {
        A obj = new A(40, 65);
        A obj1 = new A(23,35,36);
    }
}