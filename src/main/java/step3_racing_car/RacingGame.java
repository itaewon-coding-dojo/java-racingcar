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
        System.out.println(Arrays.toString(carPositions));

        time = InputView.loopCount();
        System.out.println("실행 결과");

        move();

    }

    public static int[] move() {
        for(int j =0; j < time; j ++ ) {
            for (int i = 0; i < carPositions.length; i++) {
                carPositions[i] += Car.move();
            }
            ResultView.carPositions(carPositions);
        }
        return carPositions;
    }


}