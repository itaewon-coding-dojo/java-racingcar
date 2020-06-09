package step3_racing_car;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomGeneratorTest {
    private RandomGenerator randomGenerator;

    @BeforeEach
    void setUp() {
        randomGenerator = new RandomGenerator();
    }

    @Test
    public void randomMoveTest() {
        int generatedRandomIntNumber = randomGenerator.generateNumber(10);
        assertTrue(generatedRandomIntNumber <= 10);
    }

}
