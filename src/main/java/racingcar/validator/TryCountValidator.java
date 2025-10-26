package racingcar.validator;

public class TryCountValidator implements Validator<Integer> {

    @Override
    public void validate(Integer tryCount) {
        if (tryCount == null) {
            throw new IllegalArgumentException("시도 횟수를 입력해야 합니다.");
        }
        if (tryCount <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
    }
}