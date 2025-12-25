package racingcar.util;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    @DisplayName("문자열 리스트를 정수형 리스트로 변환해주는 검사")
    void carNameLength_test(){
        //given
        String carName = "ilovejava";
        //when & then
        assertThatThrownBy(() -> Validator.validateCarNameLength(carName))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
