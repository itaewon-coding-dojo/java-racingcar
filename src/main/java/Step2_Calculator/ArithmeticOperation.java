package Step2_Calculator;

public class ArithmeticOperation {

    public static int arithmeticOperation(int acc, int curr, String arithmeticOperator) {

        if(arithmeticOperator.equals("+")){
            return sum(acc, curr);
        }

        if(arithmeticOperator.equals("-")){
            return subtract(acc, curr);
        }

        if(arithmeticOperator.equals("/")){
            return divide(acc, curr);
        }

        if(arithmeticOperator.equals("*")){
            return multiply(acc, curr);
        }

        return 0;
    }

    private static int sum(int acc, int curr) {
        return acc + curr;
    }

    private static int divide(int acc, int curr) {
        return acc / curr;
    }

    private static int multiply(int acc, int curr) {
        return acc * curr;
    }

    private static int subtract(int acc, int curr) {
        return acc - curr;
    }
}
