package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarList;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CarListTest {
    CarList carList;

    @BeforeEach
    void setUp() {
        String cars = "Audi,Sonata,Morning,Volvo";
        carList = new CarList(cars);
    }

    @Test
    @DisplayName("getCars()")
    public void getCars() {
        assertThat(carList.getCars().length).isEqualTo(4);
    }

    @Test
    @DisplayName("addWinner()")
    public void addWinner() {
        ArrayList<String> winners = new ArrayList<>();
        Car existingWinner = new Car("winner");
        Car current = new Car("current");

        existingWinner.move(9);
        current.move(8);

        assertThat(winners.size()).isEqualTo(0);

        carList.addWinner(winners, current, existingWinner.getStatus());

        assertThat(winners.size()).isEqualTo(1);
    }
}
