class AAA{
    int a;
    int b;
    AAA(){
        a=10;
        b=20;
    }
    void display(AAA obj){
        System.out.println("a = "+obj.a + " b = " +obj.b);
    }
    void get(){display(this);}
    public static void main(String[] args){
        AAA obj = new AAA();
        
        obj.get();
    }
}
