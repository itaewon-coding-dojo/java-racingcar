package step3_racing_car;

public class RacingGame {
    private static int[] currentCarPositions;
    private static int time;
    private static int[][] positionHistory;

    public RacingGame(int[] currentCarPositions, int time) {
        this.currentCarPositions = currentCarPositions;
        this.time = time;
        this.positionHistory= new int[time][];
    }

    public static int[] getCarPosition() {
        return currentCarPositions;
    }

    public static int[][] getRacingGameHistory() {
        return positionHistory;
    }

    public static int[] move() {
        for(int j =0; j < time; j ++ ) {
            changePosition();
            positionHistory[j] = currentCarPositions;
        }
        return currentCarPositions;
    }

    public static void changePosition() {
        for (int i = 0; i < currentCarPositions.length; i++) {
            currentCarPositions[i] += Car.move();
        }
    }

}