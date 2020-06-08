package racingcar.domain;

public class Car {
    private int status = 0;

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            this.status += 1;
        }
    }

    public int getStatus() {
        return this.status;
    }
}
