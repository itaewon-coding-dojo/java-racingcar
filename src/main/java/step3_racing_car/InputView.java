package step3_racing_car;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner;
    public static int carAmount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String carNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int loopCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
