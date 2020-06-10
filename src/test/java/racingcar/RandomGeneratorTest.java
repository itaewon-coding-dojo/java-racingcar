package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.RandomGenerator;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomGeneratorTest {
    @Test
    @DisplayName("get()")
    public void get() {
        RandomGenerator randomGenerator = new RandomGenerator();
        assertThat(randomGenerator.get() >= 0).isTrue();
        assertThat(randomGenerator.get() <= 9).isTrue();
    }
}
