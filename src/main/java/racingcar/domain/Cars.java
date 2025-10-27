package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Cars {

    private final Set<String> carNames = new LinkedHashSet<>();
    private final static int MAX_LENGTH = 5;

    public Cars(String inputCarNames) {
        isValidInput(inputCarNames); // 입력된 문자열이 유효한 값인지 검사
        parseNames(inputCarNames); // 쉽표 기준으로 자동차 이름 구분
        validateNames(); // 자동차 이름 유효성 검사
    }

    private void isValidInput(String inputCarNames) {
        if (inputCarNames == null || inputCarNames.isBlank()) {
            throw new IllegalArgumentException("자동차 이름 입력은 비어 있을 수 없습니다.");
        }
    }

    private void parseNames(String inputCarNames) {
        Arrays.stream(inputCarNames.split(","))
                .map(String::trim)
                .forEach(carNames::add);
    }

    private void validateNames() {
        for (String name : carNames) {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");
            }
            if (name.length() > MAX_LENGTH) {
                throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다: " + name);
            }
        }
    }

    public List<String> getValidatedCarNames() {
        return new ArrayList<>(carNames);
    }
}
