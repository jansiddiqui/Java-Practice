import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int L = obj.nextInt(); // Read lower bound
        int U = obj.nextInt(); // Read upper bound

        // Find and print all prime numbers between L and U
        for (int num = L; num <= U; num++) {
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            }
        }
    }
}
