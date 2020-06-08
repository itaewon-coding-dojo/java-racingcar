package racingcar.domain;

public class Car implements Comparable {
    private int status = 0;
    private final String name;

    public Car(String carName) {
        this.name = carName;
    }

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            this.status += 1;
        }
    }

    public int getStatus() {
        return this.status;
    }

    public String getName() {
        return this.name;
    }

    public int compareTo(Object obj) {
        Car car = (Car)obj;
        return this.status < car.getStatus() ? 1 : -1;
    }
}
