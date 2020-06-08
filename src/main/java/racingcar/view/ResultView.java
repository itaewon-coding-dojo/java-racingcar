package racingcar.view;

import racingcar.domain.Car;

public class ResultView {
    public void showResult(Car[] cars) {
        int count = 1;
        for (Car car : cars) {
            System.out.printf("[%d]RacingCar) ", count);
            for (int i = 0; i < car.getStatus(); i += 1) {
                System.out.print("-");
            }
            System.out.println("");
            count += 1;
        }
        System.out.println("──────────────────────");
    }
}
