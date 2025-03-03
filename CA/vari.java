

public class vari {
    static int staticVar = 10;
    public static void main(String[] args){
        int a=5;
        double b = 5.5;
        double sum = a+b;
        System.out.println("Sum: " + sum);
        int c = (int) b;
        System.out.println("Casted value " + c);
        System.out.println("Static Variable: "+staticVar);
    }
}
