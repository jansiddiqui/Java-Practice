abstract class AB{
    void add(){
        int s = 78;
        int h = 45;
        System.out.println(s+h);
    }
} 
class abstractC {
    public static void main(String[] args) {
        AB obj = new AB() {
            // public void add(){
            //     System.out.println("Done");
            // }
        };
        obj.add();
    }
}
