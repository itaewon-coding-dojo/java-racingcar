package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @ParameterizedTest
    @CsvSource(value = {
            "1, 0",
            "2, 0",
            "3, 0",
            "4, 1",
            "5, 1",
            "9, 1",
    })
    @DisplayName("move and getStatus")
    public void test(int input, int expected) {
        Car car = new Car();

        car.move(input);
        assertThat(car.getStatus()).isEqualTo(expected);
    }
}
