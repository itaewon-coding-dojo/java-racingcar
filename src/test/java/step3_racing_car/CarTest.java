package step3_racing_car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @DisplayName("randomMoveable tests if movable returns true or false")
    @Test
    public void randomMovableTest() {
        assertThat(car.movable()).isEqualTo(true||false);
    }

    @DisplayName("randomMove returns 0 or 1")
    @Test
    public void randomMoveTest() {
        assertTrue(car.move() == 1 || car.move() == 0);
    }


}
