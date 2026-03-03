// CopilotDemo.java

public class CopilotDemo {
    public static void main(String[] args) {
        // Display a welcome message
        System.out.println("Welcome to GitHub Copilot Demo!");

        // Demonstration of basic arithmetic operations
        int a = 10;
        int b = 5;

        // Addition
        int sum = add(a, b);
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = subtract(a, b);
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = multiply(a, b);
        System.out.println("Product: " + product);

        // Division
        if (b != 0) {
            double quotient = divide(a, b);
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }
}