package calculator;

import calculator.domain.StringReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("StringReader")
public class StringReaderTest {
    @Test
    @DisplayName("extractNumber")
    public void extractNumber() {
        StringReader stringReader = new StringReader();

        String input1 = "1 + 2 * 3";
        int[] expected1= {1, 2, 3};
        assertThat(stringReader.extractNumber(input1)).isEqualTo(expected1);

        String input2 = "11 - 2 * 3 + 2";
        int[] expected2 = {11, 2, 3, 2};
        assertThat(stringReader.extractNumber(input2)).isEqualTo(expected2);

        String input3 = "(-2) * (-3) + (-10)";
        int[] expected3 = {-2, -3, -10};
        assertThat(stringReader.extractNumber(input3)).isEqualTo(expected3);

        String input4 = "1 & 3 + 5";
        assertThatThrownBy(() -> {
           stringReader.extractNumber(input4);
        })
                .hasToString("java.lang.IllegalArgumentException")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("extractOperator")
    public void extractOperator() {
        StringReader stringReader = new StringReader();

        String input1 = "1 + 2 * 3";
        String[] expected1= {"+", "*"};
        assertThat(stringReader.extractOperator(input1)).isEqualTo(expected1);

        String input2 = "11 - 2 * 3 + 2";
        String[] expected2 = {"-", "*", "+"};
        assertThat(stringReader.extractOperator(input2)).isEqualTo(expected2);

        String input3 = "(-2) * 3 + 4";
        String[] expected3 = {"*", "+"};
        assertThat(stringReader.extractOperator(input3)).isEqualTo(expected3);

        String input4 = "1 & 3 + 5";
        assertThatThrownBy(() -> {
            stringReader.extractNumber(input4);
        })
                .hasToString("java.lang.IllegalArgumentException")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 + 2 * 3, false",
            "4 # 2 * 3, true",
    })
    @DisplayName("checkWeird")
    public void checkWeird(String input, boolean expected) {
        StringReader stringReader = new StringReader();

        assertThat(stringReader.checkWeird(input)).isEqualTo(expected);
    }
}
