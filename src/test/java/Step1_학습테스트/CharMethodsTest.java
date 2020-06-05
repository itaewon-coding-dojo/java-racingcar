package Step1_학습테스트;

import Step1_학습테스트.CharMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

@DisplayName("Char Methods 테스트")
public class CharMethodsTest {
    private CharMethods charMethods;
    @BeforeEach
    void setUp() {
        charMethods = new CharMethods();
    }

    @DisplayName("charAt 테스트")
    @ParameterizedTest
    @CsvSource(value = {"abc:0:a", "abc:1:b", "abc:2:c"}, delimiter = ':')
    public void charIOTest(String string,int index, char expected) {
        assertThat(charMethods.charAt(string, index)).isEqualTo(expected);
    }

    @DisplayName("charAt Error Index out of bound 테스트")
    @Test
    public void charErrorTest() {

        assertThatThrownBy(() -> {
            charMethods.charAt("abc", 3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");

//        Throwable thrown = catchThrowable(() -> { throw new Exception("String index out of range: 3"); });
//        assertThat(thrown).isInstanceOf(Exception.class) .hasMessageContaining("String index out of range: 3");

        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> charMethods.charAt("abc", 3))
                .withMessage("String index out of range: 3")
                .withMessageContaining("String")
                .withNoCause();

//        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> { throw new IndexOutOfBoundsException("NO!"); })
//                .withMessage("NO!")
//                .withMessageContaining("NO")
//                .withNoCause();

    }
}
