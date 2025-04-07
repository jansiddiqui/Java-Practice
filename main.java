import java.util.*;
class main{
    static int div(int n, int m) throws ArithmeticException, IllegalAccessError{
        int C = n/m;
        return C;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            System.out.println(div(a,b));
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Finally");
        }
    }
}