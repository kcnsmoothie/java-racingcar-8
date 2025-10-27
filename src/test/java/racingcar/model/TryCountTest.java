package racingcar.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import racingcar.domain.Cars;

public class TryCountTest {
    @ParameterizedTest
    @DisplayName("시도 횟수가 공백인지 검사")
    @EmptySource
    void nameNullOrEmpty(String carNames) {
        assertThatThrownBy(() -> new Cars(carNames)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("시도 횟수가 음수인지 검사")
    void tryCountsIsNegative() {
        // Given
        RacingGameService service = new RacingGameService();
        Integer tryCounts = -5;

        // When & Then: validateTryCounts 호출 시 예외 발생
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> service.setTryCounts(tryCounts));

        // Then: 예외 메시지가 올바른지 검증
        assertEquals("시도 횟수는 0보다 커야 합니다.", exception.getMessage());
    }
}
