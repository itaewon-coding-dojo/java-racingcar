package racingcar.view;

import java.util.Scanner;

public class InputView {
    public int getUserInput() {
        try {
            Scanner input = new Scanner(System.in);
            return input.nextInt();
        } catch (Exception e) {
            System.out.println("숫자로 다시 입력해주세요");
            return this.getUserInput();
        }
    }

    public void howManyCars() {
        System.out.println("경주용 자동차는 총 몇 대입니까?");
    }

    public void howManyTimes() {
        System.out.println("몇 번 시도하시겠습니까?");
    }
}
