
class Calculator {
    //type your code here
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
}

class AdvancedCalculator extends Calculator {
    public int multiply(int a, int b){
        return a * b;
    }
}                                                                                             public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedCalculator calculator = new AdvancedCalculator();

        int choice = scanner.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid");
            return;
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result;

        if (choice == 1) {
            result = calculator.add(num1, num2);
            System.out.println("Addition: " + result);
        } else if (choice == 2) {
            result = calculator.subtract(num1, num2);
            System.out.println("Subtraction: " + result);
        } else {
            result = calculator.multiply(num1, num2);
            System.out.println("Multiplication: " + result);
        }
    }
}


// You are using Java
class Subscription {
    //type your code here
 }
 
 class PremiumSubscription extends Subscription {
     //type your code here
 }
 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baseMonthlyCost = scanner.nextDouble();
        double serviceTax = scanner.nextDouble();
        double extraFeatureCost = scanner.nextDouble();

        PremiumSubscription premiumSubscription = new PremiumSubscription(baseMonthlyCost,
                                                        serviceTax, extraFeatureCost);

        double totalMonthlyCost = premiumSubscription.calculateMonthlyCost();
    
        System.out.printf("Rs. %.2f%n", totalMonthlyCost);
        scanner.close();
    }
}


class Loan {
    //type your code here
}

class CarLoan extends Loan {
    //type your code here
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        int loanTerm = scanner.nextInt();
        double processingFee = scanner.nextDouble();
        
        CarLoan carLoan = new CarLoan(principal, interestRate, loanTerm, processingFee);
        
        System.out.printf("Total Interest: %.2f\n", carLoan.calculateInterest());
        System.out.printf("Total Cost : %.2f\n", carLoan.calculateTotalCost());
        
        scanner.close();
    }
 }