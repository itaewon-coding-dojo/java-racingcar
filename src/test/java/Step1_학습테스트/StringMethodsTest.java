package Step1_학습테스트;

import Step1_학습테스트.StringMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("String Method 테스트")
public class StringMethodsTest {
    private StringMethods stringMethods;

    @BeforeEach
    void setUp() {
        stringMethods = new StringMethods();
    }

    @DisplayName("String split 테스트")
    @Test
    public void splitStringTest() {
        String[] splittedString = stringMethods.splitStrings("12");
        assertThat(splittedString).contains("1","2");
        assertThat(splittedString).containsExactly("1","2");
        assertThat(splittedString).isEqualTo(new String[]{"1","2"});

        String[] splittedString1 = stringMethods.splitStrings("1");
        assertThat(splittedString1).isEqualTo(new String[]{"1"});
        assertThat(splittedString1).contains("1");
        assertThat(splittedString1).containsExactly("1");

    }

    @DisplayName("String subString 테스트")
    @Test
    public void subStringTest() {
        String modifiedString = stringMethods.subString("(1,2)", 1,4);
        assertThat(modifiedString).isEqualTo("1,2");
        assertThat(modifiedString).doesNotContain("(");
        assertThat(modifiedString).doesNotContain(")");
    }
}


