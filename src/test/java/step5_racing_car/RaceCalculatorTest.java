package step5_racing_car;

import org.junit.jupiter.api.Test;
import step5_racing_car.domain.RaceCalculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RaceCalculatorTest {

    @Test
    public void calculateWinnerTest(){
        RaceCalculator raceCalculator = new RaceCalculator();
        assertThat(raceCalculator.calculateWinner(new int[] {4,5,6,6})).isEqualTo(new int[] {2,3});
    }

    @Test
    public void calculateFurthestPosition() {
        RaceCalculator raceCalculator = new RaceCalculator();
        assertThat(raceCalculator.calculateFurthestPosition(new int[] {4,5,6,6})).isEqualTo(6);
    }

}
