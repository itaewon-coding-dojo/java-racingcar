package racingcar.domain;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarList {
    private final Car[] cars;

    public CarList(String carNames) {
        String[] names = carNames.split(",");
        this.cars = new Car[names.length];

        for (int i = 0; i < names.length; i += 1) {
            this.cars[i] = new Car(names[i]);
        }
    }

    public Car[] getCars() {
        return this.cars;
    }

    public void moveAllCars() {
        RandomGenerator randomGenerator = new RandomGenerator();
        for (Car car : cars) {
            car.move(randomGenerator.get());
        }
    }

    public Object[] getWinners() {
        Arrays.sort(this.cars);
        int winnerStatus = this.cars[0].getStatus();

        ArrayList<String> winners = new ArrayList<>();

        for (Car car : this.cars) {
            addWinner(winners, car, winnerStatus);
        }

        return winners.toArray();
    }

    public void addWinner(ArrayList<String> winners, Car current, int winnerStatus) {
        if (current.getStatus() == winnerStatus) {
            winners.add(current.getName());
        }
    }
}
