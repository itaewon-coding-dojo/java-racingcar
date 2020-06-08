package racingcar.domain;

import racingcar.domain.Car;

import java.util.ArrayList;

public class CarList {
    private final Car[] cars;

    public CarList(int number) {
        cars = new Car[number];

        for (int i = 0; i < cars.length; i += 1) {
            cars[i] = new Car();
        }
    }

    public Car[] getCars() {
        return cars;
    }

    public void moveAllCars() {
        RandomGenerator randomGenerator = new RandomGenerator();
        for (Car car : cars) {
            car.move(randomGenerator.get());
        }
    }
}
