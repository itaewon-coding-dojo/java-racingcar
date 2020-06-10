package step5_racing_car.domain;

import java.util.stream.IntStream;

public class CarList {

    public static String[] getNames(String carNames) {
        return carNames.split(",");
    }
    
    public static String[] getIndexNames(String[] carListNames, int[] winnersIndex) {
        return IntStream.range(0, carListNames.length)
                .filter(i -> IntStream.of(winnersIndex).anyMatch(x-> x== i))
                .mapToObj(i -> carListNames[i])
                .toArray(String[]::new);
    }
}