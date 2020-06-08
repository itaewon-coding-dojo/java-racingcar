package step3_racing_car;

import java.util.Random;

public class RandomGenerator {
    private static Random generator;

    public static int generateNumber(int max) {
        generator = new Random();
        return generator.nextInt(max);
    }

}
