package calculator;

import calculator.domain.InputMachine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("InputMachine")
public class InputMachineTest {
    @Test
    @DisplayName("validateUserInput")
    public void validateUserInput() {
        InputMachine inputMachine = new InputMachine();

        assertThatThrownBy(() -> {
            inputMachine.validateUserInput("");
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasToString("java.lang.IllegalArgumentException");

        assertThatThrownBy(() -> {
            inputMachine.validateUserInput(null);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasToString("java.lang.IllegalArgumentException");
    }
}
