package racingcar.view;

import racingcar.domain.Car;

public class ResultView {
    public void showResult(Car[] cars) {
        for (Car car : cars) {
            this.showCarStatus(car);
        }
        System.out.println("──────────────────────");
    }

    private void showCarStatus(Car car) {
        System.out.printf("[%s] ", car.getName());
        for (int i = 0; i < car.getStatus(); i += 1) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public void showWinner(Object[] cars) {
        System.out.print("최종 우승: ");
        for (Object car : cars) {
            System.out.printf("%s ", car);
        }
    }
}
