class Main4 {
    
    static class StaticNestedClass {
        int a = 1;

        void innermethod(int x) {
            System.out.println("value of x = " + x);
            System.out.println("value of this.a = " + this.a);  
        }
    }

    public static void main(String[] args) {
        Main4.StaticNestedClass im = new Main4.StaticNestedClass();
        im.innermethod(55);
    }
}