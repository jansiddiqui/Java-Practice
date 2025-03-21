@FunctionalInterface
interface F{
    void sq(int a);
}
class lemda implements F{
    @Override
    public void sq(int a){
        System.out.println("Square of "+ a + " is: "+a*a);
    }
    public static void main(String a[]){
        F f = new lemda();
        f.sq(5);
    } 
}