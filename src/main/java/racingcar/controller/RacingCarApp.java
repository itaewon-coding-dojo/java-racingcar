package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.CarList;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.Arrays;

public class RacingCarApp {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        inputView.whatCarNamesAre();
        String nameOfCars = inputView.getUserStringInput();
        inputView.howManyTimes();
        int numberOfTimes = inputView.getUserIntInput();

        CarList carList = new CarList(nameOfCars);
        ResultView resultView = new ResultView();

        for (int i = 0; i < numberOfTimes; i += 1) {
            carList.moveAllCars();
            resultView.showResult(carList.getCars());
        }

        resultView.showWinner(carList.getWinners());
    }
}
