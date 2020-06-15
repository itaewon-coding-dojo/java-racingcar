package step5_racing_car.view;

public class ResultView {
    public static void carPositions(int[] carPositions, String[] carListNames) {
        System.out.println();
        for(int i = 0; i< carListNames.length; i ++) {
            System.out.print(carListNames[i] + " : ");
            printPosition(carPositions[i]);
            System.out.println();
        }
    }

    public static void printPosition(int position) {
        for(int i = 0; i <= position; i ++) {
            System.out.print("-");
        }
    }

    public static void startMove() {
        System.out.println("실행 결과");
    }

    public static void showWinner(String[] winnerList) {
        for(String winner : winnerList) {
            System.out.print(winner + " ");
        }
        System.out.println("(이)가 최종 우승했습니다.");
    }


    public static void showHistory(int[][] carPositionHistory, String[] carListNames) {
        for(int[] rounds : carPositionHistory){
            carPositions(rounds, carListNames);
        }
    }
}
