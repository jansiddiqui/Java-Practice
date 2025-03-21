interface  R {
    void add();
}
public class Anonymous {
    public static void main(String jan[]){
        R obj = new R(){
            public void add(){
                int a = 89;
                int b = 87;
                System.out.println(a+b);
            }
        };
        obj.add();
    }
}
