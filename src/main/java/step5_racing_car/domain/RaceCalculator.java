package step5_racing_car.domain;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RaceCalculator {

    public static int[] calculateWinner(int[] carPositions){
        int furthestPosition = calculateFurthestPosition(carPositions);
        return IntStream.range(0, carPositions.length)
                .filter(i -> furthestPosition == carPositions[i])
                .mapToObj(i->i)
                .mapToInt(x -> x)
                .toArray();
    }

    public static int calculateFurthestPosition(int[] carPositions) {
       return Arrays.stream(carPositions).max().getAsInt();
    }
}
