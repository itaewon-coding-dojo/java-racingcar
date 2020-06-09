package step3_racing_car;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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