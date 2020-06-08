package step3_racing_car;

import java.util.Scanner;

public class ResultView {
    public static void carPositions(int[] carPositions) {
        System.out.println();
        for(int position : carPositions) {
            for(int i = 0; i <= position; i ++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
