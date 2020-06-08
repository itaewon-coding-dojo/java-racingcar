package step3_racing_car;

import java.util.Arrays;

public class RacingGame {
    private static int[] carPositions;
    private static int time;

    public RacingGame(int[] carPositions, int time) {
        this.carPositions = carPositions;
        this.time = time;
    }

    public static void main(String[] args) {

        int carNumbers = InputView.carAmount();
        carPositions = new int[carNumbers];

        time = InputView.loopCount();

        move();

    }

    public static int[] move() {
        ResultView.startMove();
        for(int j =0; j < time; j ++ ) {
            for (int i = 0; i < carPositions.length; i++) {
                carPositions[i] += Car.move();
            }
            ResultView.carPositions(carPositions);
        }
        return carPositions;
    }


}