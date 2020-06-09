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
        assertTrue(racingGame.move(new String[] {}).length == 5);
    }

}
