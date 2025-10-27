package racingcar.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.Car;
import racingcar.domain.Cars;

public class CarTest {

    @ParameterizedTest
    @DisplayName("입력값이 null 혹은 공백인지 검사")
    @NullAndEmptySource
    void nameNullOrEmpty(String carNames) {
        assertThatThrownBy(() -> new Cars(carNames))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("자동차 이름이 5자 초과인지 검사하는 테스트")
    @ValueSource(strings = "pobi,errorname")
    void nameLengthTest(String carNames) {
        assertThatThrownBy(() -> new Cars(carNames))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
