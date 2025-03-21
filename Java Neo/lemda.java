// @FunctionalInterface
// interface F{
//     void sq(int a);
// }

@FunctionalInterface
interface F{
    int sq(int a);
}
// class lemda implements F{
//     @Override
//     public void sq(int a){
//         System.out.println("Square of "+ a + " is: "+a*a);
//     }
//     public static void main(String a[]){
//         F f = new lemda();
//         f.sq(5);
//     } 
// }

// class lemda{
//     public static void main(String[] args) {
//         F obj = a ->{
//             System.out.println("Square is: "+ a*a);
//         };
//         obj.sq(5);
//     }
// }

class lemda{
    public static void main(String[] args) {
        F obj = a ->{
            System.out.println("Square is: "+ a*a);
            return 0;
        };
        obj.sq(5);
    }
}