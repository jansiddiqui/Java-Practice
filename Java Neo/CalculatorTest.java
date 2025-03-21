public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(5, 3)); // 8
        System.out.println("Subtraction: " + calc.subtract(5, 3)); // 2
        System.out.println("Multiplication: " + calc.multiply(5, 3)); // 15
        System.out.println("Division: " + calc.divide(6, 3)); // 2.0

        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Square Root: " + advCalc.squareRoot(16)); // 4.0
        System.out.println("Power: " + advCalc.power(2, 3)); // 8.0
    }
}
