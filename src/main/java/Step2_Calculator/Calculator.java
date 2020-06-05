package Step2_Calculator;

public class Calculator {
    private int acc;

    public int calculate(String s) {
        InputErrorHandler.checkCalculatorIllegalArgument(s);
        String[] arithmetics = InputExtactor.extractCalculatorInputs(s);
        
        acc = Integer.parseInt(arithmetics[0]);
        
        for(int i = 1; i< arithmetics.length; i += 2) {
              acc = ArithmeticOperation.arithmeticOperation(acc, Integer.parseInt(arithmetics[i+1]), arithmetics[i]);
        }

        return acc;
    }
}
