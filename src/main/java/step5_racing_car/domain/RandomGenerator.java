package step5_racing_car.domain;

import java.util.Random;

public class RandomGenerator {
    private static Random generator;

    public static int generateNumber(int max) {
        generator = new Random();
        return generator.nextInt(max);
    }
}
