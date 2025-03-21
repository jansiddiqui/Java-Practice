public class Example {
    static void check(int num) throws IllegalArgumentException {
        if (num < 18) {
            throw new IllegalArgumentException("Not eligible");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            check(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}