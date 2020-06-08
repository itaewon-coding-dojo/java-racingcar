package calculator.view;

public class ScreenMassage {
    public void showMassage() {
        System.out.println("수식을 입력해주세요. 계산은 제가 합니다 ㅋ");
    }

    public void showResult(int result) {
        System.out.printf("답은 %d 입니다.", result);
    }

    public void showErrorMassage(Exception e) {
        System.out.println(e);
    }
}
