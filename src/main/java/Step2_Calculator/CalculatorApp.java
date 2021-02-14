package Step2_Calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        InputView.startCalculator();
        String input = InputView.inputArithmeticOperations();
        Calculator calculator = new Calculator();
        int result = calculator.calculate(input);
        OutputView.showOutput(result);
    }
}
