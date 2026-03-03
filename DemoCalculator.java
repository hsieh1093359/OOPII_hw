public class DemoCalculator {
    
    private double result;
    private double previousOperand;
    private String lastOperation;
    
    /**
     * Creates a new calculator instance
     */
    public DemoCalculator() {
        this.result = 0;
        this.previousOperand = 0;
        this.lastOperation = "";
    }
    
    /**
     * Addition operation
     * @param operand the number to be added
     * @return the calculation result
     */
    public double add(double operand) {
        result = previousOperand + operand;
        previousOperand = result;
        lastOperation = "Addition";
        return result;
    }
    
    /**
     * Subtraction operation
     * @param operand the number to be subtracted
     * @return the calculation result
     */
    public double subtract(double operand) {
        result = previousOperand - operand;
        previousOperand = result;
        lastOperation = "Subtraction";
        return result;
    }
    
    /**
     * Multiplication operation
     * @param operand the number to be multiplied
     * @return the calculation result
     */
    public double multiply(double operand) {
        result = previousOperand * operand;
        previousOperand = result;
        lastOperation = "Multiplication";
        return result;
    }
    
    /**
     * Division operation
     * @param operand the number to be divided by
     * @return the calculation result
     * @throws IllegalArgumentException when divisor is zero
     */
    public double divide(double operand) throws IllegalArgumentException {
        if (operand == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        result = previousOperand / operand;
        previousOperand = result;
        lastOperation = "Division";
        return result;
    }
    
    /**
     * Gets the current calculation result
     * @return the current result
     */
    public double getResult() {
        return result;
    }
    
    /**
     * Resets the calculator
     */
    public void reset() {
        result = 0;
        previousOperand = 0;
        lastOperation = "";
    }
    
    /**
     * Sets the first operand
     * @param operand the number to be set
     */
    public void setOperand(double operand) {
        previousOperand = operand;
    }
    
    /**
     * Gets the last operation performed
     * @return the operation name
     */
    public String getLastOperation() {
        return lastOperation;
    }
    
    /**
     * Main method - demonstrates how to use the calculator
     */
    public static void main(String[] args) {
        DemoCalculator calculator = new DemoCalculator();
        
        // Example 1: Addition
        calculator.setOperand(10);
        double result1 = calculator.add(5);
        System.out.println("10 + 5 = " + result1);
        
        // Example 2: Multiplication
        calculator.setOperand(8);
        double result2 = calculator.multiply(3);
        System.out.println("8 × 3 = " + result2);
        
        // Example 3: Division
        calculator.setOperand(20);
        try {
            double result3 = calculator.divide(4);
            System.out.println("20 ÷ 4 = " + result3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Display the last operation
        System.out.println("Last operation: " + calculator.getLastOperation());
        System.out.println("Final result: " + calculator.getResult());
    }
}