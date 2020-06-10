package calculator.domain;

import java.util.Scanner;

public class InputMachine {
    public String getUserInput() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        validateUserInput(userInput);

        return userInput;
    }

    public void validateUserInput(String str) {
        if (str == null || str == "") {
            throw new IllegalArgumentException();
        }
    }
}
