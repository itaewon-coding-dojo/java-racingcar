import org.assertj.core.internal.Numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("set Method Test")
public class SetMethodsTest {
    private Set<Integer> numbers;
    private SetMethods setMethods;
    @BeforeEach
    void setUp() {
        setMethods = new SetMethods();
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @DisplayName("set 사이즈 테스트")
    @Test
    public void setSizeTest() {
        int setSize = setMethods.getSize(numbers);
        assertThat(setSize).isEqualTo(3);
    }

    @DisplayName("set 내용물 확인 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1,1,2,3})
    public void setContainsTest(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }

//    @Test
//    public void setThrowErrorTest() {
//        assertThat(numbers.contains(true)).isEqualTo(false);
//        assertThat(numbers.contains(4)).isEqualTo(false);
//        assertThat(numbers.contains(5)).isEqualTo(false);
//    }

    @DisplayName("set 입력 출력 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false" }, delimiter = ':')
    public void setIOTest(int input, boolean expected) {
        assertThat(numbers.contains(input)).isEqualTo(expected);

    }

}
