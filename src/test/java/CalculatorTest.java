import Step2_Calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("test calculator")
    @ParameterizedTest
    @CsvSource(value = {"2 + 3 * 4 / 2:10", "1:1", "0 * 10 * 11 + 3: 3"}, delimiter = ':')
    public void calculatorTestArithmeticOperations(String arithmetic, int result) {
        assertThat(calculator.calculate(arithmetic)).isEqualTo(result);
    }

    @DisplayName("null input")
    @Test
    public void calculatorTestWithNull() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
           calculator.calculate("null");
        });
    }

    @DisplayName("wrong input")
    @Test
    public void calculatorTestWithWrongInput() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
             calculator.calculate("!");
        });
    }

    @DisplayName("wrong format")
    @Test
    public void calculatorTestWithWrongFormat() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
             calculator.calculate("4 + a");
        });
    }

    @DisplayName("space inputs")
    @Test
    public void calculatorTestWithSpaceInputs() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            calculator.calculate("4 + 1 *  2");
        });
    }

    @DisplayName("negative inputs")
    @Test
    public void calculatorTestWithNegativeInputs() {
        assertThat(calculator.calculate("-4 - 1 * 2")).isEqualTo(-10);
    }


}
