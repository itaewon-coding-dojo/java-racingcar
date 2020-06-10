package step3_racing_car;

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
