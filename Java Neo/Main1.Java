abstract class Calculator {
    abstract double square(double num);
    abstract double cube(double num);
}

class MathCalculator extends Calculator {
    double square(double num) {
        return num * num;
    }
    double cube(double num) {
        return num * num * num;
    }
}

public class Main1 {
    public static void main(String[] args) {
        MathCalculator calculator = new MathCalculator();
        double num = 15.0;
        double squareResult = calculator.square(num);
        double cubeResult = calculator.cube(num);
        System.out.println(squareResult);
        System.out.print(cubeResult);
    }
}