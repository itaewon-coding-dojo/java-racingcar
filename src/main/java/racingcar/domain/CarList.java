package racingcar.domain;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarList {
    private final Car[] cars;

    public CarList(String carNames) {
        String[] names = carNames.split(",");
        cars = new Car[names.length];
        for (int i = 0; i < names.length; i += 1) {
            cars[i] = new Car(names[i]);
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

    public Object[] getWinners() {
        Arrays.sort(cars);
        Car winner = cars[0];

        ArrayList<String> winners = new ArrayList<>();
        winners.add(winner.getName());

        for (int i = 1; i < cars.length; i += 1) {
            addWinner(winners, cars[i], winner);
        }

        return winners.toArray();
    }

    private void addWinner(ArrayList<String> winners, Car current, Car existingWinner) {
        if (current.getStatus() == existingWinner.getStatus()) {
            winners.add(current.getName());
        }
    }
}
