package racingcar.application;

import racingcar.domain.Car;
import racingcar.domain.CarList;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingCarApp {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        inputView.howManyCars();
        int numberOfCars = inputView.getUserInput();
        inputView.howManyTimes();
        int numberOfTimes = inputView.getUserInput();

        CarList carList = new CarList(numberOfCars);
        ResultView resultView = new ResultView();

        for (int i = 0; i < numberOfTimes; i += 1) {
            carList.moveAllCars();

            Car[] cars = carList.getCars();
            resultView.showResult(cars);
        }
    }
}
