
public class main2 {
    public static void main(String[] args) {
        int a =5, b=3;
        System.out.println("Addition: "+(a+b));
        System.out.println("Substraction: "+(a-b));

        System.out.println("Bitwise AND: "+(a&b));
        System.out.println("Bitwise OR: " + (a|b));

        boolean x = true, y=false;
        System.out.println("Logical AND: "+(x&&y));
        System.out.println("Logical OR : " + (x||y) );

        int max = (a>b)? a:b;
        System.out.println("MAx VAlue: "+max);
    }
}
