import java.util.Scanner;
class Jan{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        short b = obj.nextShort();
        byte c = obj.nextByte();
        String d = obj.next();
        obj.nextLine();
        String e  = obj.nextLine();
        System.out.println("Name is "+a+" short is "+b+" Byte is "+c+" String is "+d+" line is "+e);
    }
}