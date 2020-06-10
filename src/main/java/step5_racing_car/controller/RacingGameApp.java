package step5_racing_car.controller;

import step5_racing_car.domain.CarList;
import step5_racing_car.domain.RaceCalculator;
import step5_racing_car.domain.RacingGame;
import step5_racing_car.view.InputView;
import step5_racing_car.view.ResultView;

public class RacingGameApp {
    public static void main(String[] args) {
        String carNames = InputView.carNames();
        String[] carListNames = CarList.getNames(carNames);
        int[] carPositions = new int[carListNames.length];
        int time = InputView.loopCount();

        RacingGame racingGame = new RacingGame(carPositions, time);
        ResultView.startMove();
        racingGame.move();

        int [][] carPositionHistory = racingGame.getRacingGameHistory();
        ResultView.showHistory(carPositionHistory, carListNames);

        int[] winnersIndex = RaceCalculator.calculateWinner(racingGame.getCarPosition());
        String[] winnerList = CarList.getIndexNames(carListNames, winnersIndex);

        ResultView.showWinner(winnerList);
    }
}
