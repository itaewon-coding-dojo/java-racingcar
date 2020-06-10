package step3_racing_car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RacingGameTest {
    private RacingGame racingGame;

    @BeforeEach
    void setUp() {
        racingGame = new RacingGame(new int[] {0,0,0,0,0}, 5);
    }

    @DisplayName("if moved")
    @Test
    public void moveTest() {
        assertTrue(racingGame.move().length == 5);
    }

    @Test
    public void getCarPositionTest() {
        assertTrue(racingGame.getCarPosition().length == 5);
    }

    @Test
    public void getRacingGameHistoryTest() {
        assertTrue(racingGame.getRacingGameHistory().length == 5);
    }

    @Test
    public void changePositionTest() {
        int positionHistory1 = RacingGame.getCarPosition()[0];
        RacingGame.move();
        int positionHistory2 = RacingGame.getCarPosition()[0];
        System.out.println(positionHistory1 + "  " + positionHistory2);
        assertTrue(positionHistory1 != positionHistory2);
    }


}
