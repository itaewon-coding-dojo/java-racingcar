package step5_racing_car.domain;

public class Car {

    public static int move() {
        return movable() ? 1 : 0;
    }

    public static boolean movable() {
        int randomNumber = RandomGenerator.generateNumber(10);
        return randomNumber < 5 ? false : true;
    }

}
