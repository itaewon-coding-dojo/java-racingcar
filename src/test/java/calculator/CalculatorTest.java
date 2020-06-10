package calculator;

import calculator.domain.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Calculator")
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    @DisplayName("add")
    public void add() {
        assertThat(calculator.add(1, 1)).isEqualTo(2);
        assertThat(calculator.add(-1, 1)).isEqualTo(0);
    }

    @Test
    @DisplayName("subtract")
    public void subtract() {
        assertThat(calculator.subtract(1, 1)).isEqualTo(0);
        assertThat(calculator.subtract(-1, 1)).isEqualTo(-2);
    }

    @Test
    @DisplayName("multiply")
    public void multiply() {
        assertThat(calculator.multiply(2, 2)).isEqualTo(4);
        assertThat(calculator.multiply(-2, 5)).isEqualTo(-10);
    }

    @Test
    @DisplayName("divide")
    public void divide() {
        assertThat(calculator.divide(6, 2)).isEqualTo(3);
        assertThat(calculator.divide(3, 2)).isEqualTo(1);
    }
}
