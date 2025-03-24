// @FunctionalInterface
// interface F{
//     void sq(int a);
// }

// @FunctionalInterface
// interface F{
//     int sq(int a);
// }

@FunctionalInterface
interface F{
    int prime(int a);
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

// class lemda{
//     public static void main(String[] args) {
//         F obj = a ->{
//             System.out.println("Square is: "+ a*a);
//             return 0;
//         };
//         obj.sq(5);
//     }
// }

//findng prime number

class lemda{
    public static void main(String[] args) {
        F obj = a ->{
            if (a <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }
            if (a == 2) {
                return true; // 2 is the smallest prime number
            }
            if (a % 2 == 0) {
                return false; // Even numbers greater than 2 are not prime
            }
    
            // Check divisors from 3 to sqrt(a)
            for (int i = 3; i * i <= a; i += 2) { // Increment by 2 to skip even numbers
                if (a % i == 0) {
                    return false; // Found a divisor, so not prime
                }
            }
        };
        obj.prime(8);
    }
}