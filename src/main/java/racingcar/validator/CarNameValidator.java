package racingcar.validator;

public class CarNameValidator implements Validator<String> {
    private static final int MAX_LENGTH = 5;

    @Override
    public void validate(String carName) {
        if (carName == null || carName.isBlank()) {
            throw new IllegalArgumentException("자동차 이름은 빈 값일 수 없습니다.");
        }
        if (carName.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
    }
}

