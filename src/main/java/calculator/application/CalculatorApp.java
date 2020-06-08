package calculator.application;

import calculator.domain.Calculator;
import calculator.domain.InputMachine;
import calculator.view.ScreenMassage;

public class CalculatorApp {
    public static void main(String[] args) {
        InputMachine inputMachine = new InputMachine();
        Calculator calculator = new Calculator();
        ScreenMassage screen = new ScreenMassage();

        screen.showMassage();

        int answer = 0;
        try {
            String userInput = inputMachine.getUserInput();
            answer = calculator.getTotalCalculation(userInput);
        } catch (Exception e) {
            screen.showErrorMassage(e);
        }

        screen.showResult(answer);
    }
}
