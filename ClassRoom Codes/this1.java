
class jan{
    int x=90;
    int y=80;
    jan(int x, int y){
        this(100);
        System.out.println(this.x + this.y);
        System.out.println(x + y);
    }
    jan (int c){
        System.out.println(c);
    }
}
public class this1 {
    public static void main(String[] args){
        jan obj = new jan(90,50);
    }
}
