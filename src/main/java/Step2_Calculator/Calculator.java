package Step2_Calculator;

public class Calculator {
    private int accumulator;

    public int calculate(String s) {
        InputErrorHandler.checkCalculatorIllegalArgument(s);
        String[] arithmetics = InputExtactor.extractCalculatorInputs(s);
        
        accumulator = Integer.parseInt(arithmetics[0]);

        for(int i = 1; i< arithmetics.length; i += 2) {
              accumulator = ArithmeticOperation.arithmeticOperation(accumulator, Integer.parseInt(arithmetics[i+1]), arithmetics[i]);
        }
        return accumulator;
    }
}
