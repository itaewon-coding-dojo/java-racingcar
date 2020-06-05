package Step2_Calculator;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner;

    public static void startCalculator(){
        System.out.print("Input Arithmetic Operations : ");
    }
    public static String inputArithmeticOperations() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
