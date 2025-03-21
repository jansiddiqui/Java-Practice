public class Main6 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing element at index 5: " + numbers[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}