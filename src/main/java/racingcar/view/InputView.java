package racingcar.view;

import java.util.Scanner;

public class InputView {
    public int getUserIntInput() {
        try {
            Scanner input = new Scanner(System.in);
            return input.nextInt();
        } catch (Exception e) {
            System.out.println("숫자로 다시 입력해주세요");
            return this.getUserIntInput();
        }
    }

    public String getUserStringInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void whatCarNamesAre() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분합니다)");
    }

    public void howManyTimes() {
        System.out.println("몇 번 시도하시겠습니까?");
    }
}
