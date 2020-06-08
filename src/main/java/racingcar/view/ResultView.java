package racingcar.view;

import racingcar.domain.Car;

public class ResultView {
    public void showResult(Car[] cars) {
        for (Car car : cars) {
            for (int i = 0; i < car.getStatus(); i += 1) {
                System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
