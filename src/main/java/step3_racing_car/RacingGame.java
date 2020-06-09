package step3_racing_car;

public class RacingGame {
    private static int[] carPositions;
    private static int time;

    public RacingGame(int[] carPositions, int time) {
        this.carPositions = carPositions;
        this.time = time;
    }

    public static void main(String[] args) {
        String carNames = InputView.carNames();
        String[] carListNames = CarList.getNames(carNames);
        carPositions = new int[carListNames.length];
        time = InputView.loopCount();
        move(carListNames);
        int[] winnersIndex = RaceCalculator.calculateWinner(carPositions);
        String[] winnerList = CarList.getIndexNames(carListNames, winnersIndex);
        ResultView.showWinner(winnerList);
    }

    public static int[] move(String[] carListNames) {
        ResultView.startMove();
        for(int j =0; j < time; j ++ ) {
            changePosition();
            ResultView.carPositions(carPositions,carListNames);
        }
        return carPositions;
    }

    public static void changePosition() {
        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i] += Car.move();
        }
    }

}