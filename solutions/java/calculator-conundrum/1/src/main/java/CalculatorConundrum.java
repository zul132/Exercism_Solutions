class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int result = 0;

        switch(operation) {
            case "+":
                result = operand1 + operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                try {
                    result = operand1 / operand2;
                    break;
                } catch(ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            case null:
                throw new IllegalArgumentException("Operation cannot be null");
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        return operand1 + " " + operation + " " + operand2 + " = " + result; 
    }
}
